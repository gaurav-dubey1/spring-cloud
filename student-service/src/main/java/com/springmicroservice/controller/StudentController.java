package com.springmicroservice.controller;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	/**
     * Controller is used to invoke services and it's return json object as response.
     */

	@GetMapping("/records")
	public JSONObject test() {
		JSONObject obj=new JSONObject();  
		  obj.put("subject_code","Math");   
		  obj.put("dept_name","CSE"); 
		  obj.put("name","Sumit");  
		  obj.put("id",new Integer(101));  
		  System.out.println("Student Service Invoked...");
	return obj;
	}
}
