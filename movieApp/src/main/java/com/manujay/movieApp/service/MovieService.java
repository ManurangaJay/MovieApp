package com.manujay.movieApp.service;

import com.manujay.movieApp.document.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MovieService {
    public List<Movie> getAllMovies();
}
