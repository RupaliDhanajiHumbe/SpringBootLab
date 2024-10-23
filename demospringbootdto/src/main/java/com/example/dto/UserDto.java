package com.example.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	
	private int uid;
	                      //@Column(name="username",nullable=false,length=50)
	private String userName;
	
	                    //@Column(name="usercontact",nullable=false,unique=true,length=15)
                         //private String contact;
    private int age;

    
}
