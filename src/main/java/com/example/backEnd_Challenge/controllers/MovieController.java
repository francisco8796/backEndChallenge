package com.example.backEnd_Challenge.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.backEnd_Challenge.entites.Movies;
import com.example.backEnd_Challenge.services.MovieService;


@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movies> getAllMovies() {
        return movieService.getAllMovies();
    } 
    
    @GetMapping("/moviesByDate")
    public ResponseEntity<List<Movies>> getMoviesByLaunchDate() {
        // Hardcoded start date
        Date hardcodedStartDate = new Date(0); // Equivalent to '1970-01-01'
        List<Movies> movies = movieService.getMoviesByLaunchDate(hardcodedStartDate);
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/moviesAfterDate")
    public ResponseEntity<List<Movies>> getMoviesByLaunchDate(
        @RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate) {
        List<Movies> movies = movieService.getMoviesByLaunchDate(startDate);
        return ResponseEntity.ok(movies);
    }

    @PostMapping
    public ResponseEntity<Movies> createMovie(@RequestBody Movies movie) {
        Movies createdMovie = movieService.createMovie(movie);
        return new ResponseEntity<>(createdMovie, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movies> updateMovie(@PathVariable String id, @RequestBody Movies movie) {
        Movies updatedMovie = movieService.updateMovie(id, movie);
        return updatedMovie != null ? ResponseEntity.ok(updatedMovie) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable String id) {
        movieService.deleteMovie(id);
        return ResponseEntity.noContent().build();
    }
}

