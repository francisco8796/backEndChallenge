package com.example.backEnd_Challenge.repositories;


import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.backEnd_Challenge.entites.Movies;

public interface MovieRepository extends MongoRepository<Movies, String> {
    List<Movies> findByDateGreaterThanEqual(Date startDate, Sort sort);
    List<Movies> findByDateGreaterThanEqual(Date startDate);
}
