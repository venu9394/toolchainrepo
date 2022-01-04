package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class GetMessage {

	
@RequestMapping("service/{message}")
	
	public String welcome(@PathVariable String message) {
		
		/*return "welcome to IBM india india";*/
		return message;
	}


}
