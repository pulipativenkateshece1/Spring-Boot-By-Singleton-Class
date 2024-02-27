package com.exampleMovie.MovieImaxThearter;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Salara implements Movie
{
	public void moveName()
	{
		System.out.println(" Movie Name is :Salara");
	}
	public void heroName()
	{
		System.out.println("Hero Name :Prabesh");
	}
	public void herioneName()
	{
		System.out.println(" Heroien Name: Heroien Name");
	}
	public void directorName()
	{
		System.out.println("Dirctor Name:Neelam Rajivi");
	}

}
