package com.pavan.natours.repos;


import com.pavan.natours.entities.user_data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user_data,Integer> {
   
    user_data findByUemail(String uemail);
}
