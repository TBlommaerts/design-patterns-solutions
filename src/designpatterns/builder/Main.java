package designpatterns.builder;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		
		// Now we only use what we need
		Movie movie1 = new Movie.MovieBuilder("Iron Man")
				.genre(Genre.ACTION)
				.director("Jon Favreau")
				.releaseDate(LocalDate.of(2008, 5, 2))
				.description("Iron Man tells the story of Tony Stark, "
				+ "a billionaire industrialist and genius inventor who is kidnapped and forced to build a devastating weapon. "
				+ "Instead, using his intelligence and ingenuity, Tony builds a high-tech suit of armor and escapes captivity.")
				.build();
		
		Movie movie2 = new Movie.MovieBuilder("The Simpsons Movie")
				.genre(Genre.COMEDY)
				.director("David Silverman")
				.build();
		
		Movie movie3 = new Movie.MovieBuilder("Harry Potter and the Philosopher's Stone")
				.build();
		
		Movie movie4 = new Movie.MovieBuilder("The Shawshank Redemption")
				.genre(Genre.DRAMA)
				.releaseDate(LocalDate.of(1994, 9, 23))
				.build();
		
		Movie movie5 = new Movie.MovieBuilder("The Hobbit")
				.director("Peter Jackson")
				.build();
	}
}