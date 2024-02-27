package com.exampleMovie.MovieImaxThearter;

import org.springframework.stereotype.Component;

@Component
public class IMAXTherater 
{
	private Movie movie;
	



	public IMAXTherater(Movie movie) {
		super();
		this.movie = movie;
	}




	public void getMovie()
	{
		movie.moveName();
		movie.heroName();
		movie.herioneName();
		movie.directorName();
	}

}
