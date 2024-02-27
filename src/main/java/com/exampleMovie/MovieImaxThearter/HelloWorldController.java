package com.exampleMovie.MovieImaxThearter;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController 
{
	@GetMapping("world")
	public String displat()
	{
		return "Hello World";
	}
	
	        

}
