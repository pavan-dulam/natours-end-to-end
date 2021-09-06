package com.pavan.natours.util;

import javax.mail.MessagingException;

public interface EmailUtil {
		void sendEmail(String toAddress,String filePath) throws MessagingException;
}
