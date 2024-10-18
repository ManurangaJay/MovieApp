package com.manujay.movieApp.service;

import com.manujay.movieApp.document.Movie;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    public List<Movie> getAllMovies();

    public Optional<Movie> getMovieById(ObjectId id);

    public Optional<Movie> getMovieByImdbId(String imdbId);

}

















