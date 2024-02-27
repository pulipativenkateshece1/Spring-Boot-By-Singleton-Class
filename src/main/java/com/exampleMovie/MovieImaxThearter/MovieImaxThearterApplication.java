package com.exampleMovie.MovieImaxThearter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//@RestController
@SpringBootApplication
public class MovieImaxThearterApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext applicationContext= SpringApplication.run(MovieImaxThearterApplication.class, args);
		
//		RRR rrr = new RRR();
//		
//		//Salara salar = new Salara();
//		IMAXTherater imaxTherater = new IMAXTherater(rrr);
//		imaxTherater.getMovie();
		
		IMAXTherater imaxTherater=applicationContext.getBean(IMAXTherater.class);
		imaxTherater.getMovie();
		
	}

	/*@RequestMapping("Hello")
	public String display()
	{
		return "Hello World!..";
	}*/
}
