package com.app.dto;

import com.app.pojos.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {


	
	private String email;
	
	private String password;

//	public String getEmail() {
//		return email;
//	}
//
//	public String getPassword() {
//		return password;
//	}
	
	
}
