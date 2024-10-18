package com.manujay.movieApp.service.impl;

import com.manujay.movieApp.document.Movie;
import com.manujay.movieApp.repository.MovieRepository;
import com.manujay.movieApp.service.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> getMovieById(ObjectId id) {

        return movieRepository.findById(id);
    }

}














