package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyAppController {
	
	public MyAppController() {
		System.out.println("My App Controller Constructor...");
	}
	
	@RequestMapping("/abc")
	//@ResponseBody
	public String someMethod() {
		System.out.println("You have accessed /abc url path...");
		//return "demo.html";
		//return "<h1>This is the content as response to the client</h1>";
		return "view/demo.jsp";
	}
	
	@RequestMapping("/xyz")
	public String anotherMethod() {
		return "demo";
	}
}
