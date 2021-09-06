package com.pavan.natours.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;

import java.util.Calendar;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;

import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.pavan.natours.entities.bookings;
import com.pavan.natours.entities.tours;
import com.pavan.natours.entities.user_data;

import org.springframework.stereotype.Component;

@Component
public class PDFGenerator {
   
    String timeStamp = new SimpleDateFormat("ddmmYYYY_HHmmss").format(Calendar.getInstance().getTime());

    public void generateItinerary(bookings bookings ,String filePath)
    {
        Document doc = new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(filePath));
            doc.open();
            doc.addTitle("Natour");
            doc.addHeader("Date: ",timeStamp);
            doc.add(generateTable(bookings));
            doc.close();
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        }
    }

    private PdfPTable generateTable(bookings booking) {
        
         tours tour = booking.getTid();
         user_data user = booking.getUid();
        PdfPTable table= new PdfPTable(2);
        PdfPCell cell;
        cell=new PdfPCell(new Phrase("Booking Details"));
        cell.setColspan(2);
        table.addCell(cell);
        table.addCell("Tour Name");
        table.addCell(tour.getName());
        table.addCell("Client Name:");
        table.addCell(user.getUname());
        table.addCell("Client Email ID:");
        table.addCell(user.getUemail());
        table.addCell("Tour Date:");
        table.addCell(booking.getcreate_at().toString());
        table.addCell("price:");
        table.addCell(Integer.toString(booking.getPrice()));
       
       
        
        return table;
    }
}
