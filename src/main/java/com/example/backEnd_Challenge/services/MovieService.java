package com.example.backEnd_Challenge.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.backEnd_Challenge.entites.Movies;
import com.example.backEnd_Challenge.repositories.MovieRepository;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movies> getAllMovies() {
        return movieRepository.findAll();
    }

    public List<Movies> getMoviesByLaunchDate(Date launchDate) {
        Sort sort = Sort.by(Sort.Direction.ASC, "date");
        return movieRepository.findByDateGreaterThanEqual(launchDate,sort);
    }
    
    public Optional<Movies> getMovieById(String id) {
        return movieRepository.findById(id);
    }

    public Movies createMovie(Movies movie) {
        return movieRepository.save(movie);
    }

    public Movies updateMovie(String id, Movies updatedMovie) {
        if (movieRepository.existsById(id)) {
            updatedMovie.setId(id);
            return movieRepository.save(updatedMovie);
        } else {
            return null;
        }
    }

    public void deleteMovie(String id) {
        movieRepository.deleteById(id);
    }
}
