package com.manujay.movieApp.service;

import com.manujay.movieApp.document.Review;
import com.manujay.movieApp.repository.ReviewRepository;

public interface ReviewService {
    public Review createReview(String reviewBody, String imdbId);
}
