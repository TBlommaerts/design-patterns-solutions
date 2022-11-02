package designpatterns.builder;

import java.time.LocalDate;

public class Movie {
	private final String title;
	private final Genre genre;
	private final String director;
	private final LocalDate releaseDate;
	private final String description;
	
	private Movie(MovieBuilder builder) {
		this.title = builder.title;
		this.genre = builder.genre;
		this.director = builder.director;
		this.releaseDate = builder.releaseDate;
		this.description = builder.description;
	}
	
	public String getTitle() {
		return title;
	}
	
	public Genre getGenre() {
		return genre;
	}
	
	public String getDirector() {
		return director;
	}
	
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	
	public String getDescription() {
		return description;
	}
	
	public static class MovieBuilder {
		private final String title;
		private Genre genre;
		private String director;
		private LocalDate releaseDate;
		private String description;
		
		// Constructor with required fields
		public MovieBuilder(String title) {
			this.title = title;
		}
		
		public MovieBuilder genre(Genre genre) {
			this.genre = genre;
			return this;
		}
		
		public MovieBuilder director(String director) {
			this.director = director;
			return this;
		}
		
		public MovieBuilder releaseDate(LocalDate releaseDate) {
			this.releaseDate = releaseDate;
			return this;
		}
		
		public MovieBuilder description(String description) {
			this.description = description;
			return this;
		}
		
		public Movie build() {
			return new Movie(this);
		}
	}
}

