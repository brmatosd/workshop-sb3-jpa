package com.educandoweb.course.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String name, email, phone, password;
	
	
}
