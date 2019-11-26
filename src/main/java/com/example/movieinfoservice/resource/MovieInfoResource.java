package com.example.movieinfoservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movieinfoservice.model.MovieInfo;

@RestController
@RequestMapping("/movieinfo")
public class MovieInfoResource {

	@GetMapping("/{movieId}")
	public MovieInfo getMovieDetails(@PathVariable ("movieId") int movieId){
		
		return new MovieInfo(movieId, "Movie1");
				
	}
}
