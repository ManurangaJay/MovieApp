package com.manujay.movieApp.service.impl;

import com.manujay.movieApp.document.Movie;
import com.manujay.movieApp.document.Review;
import com.manujay.movieApp.repository.ReviewRepository;
import com.manujay.movieApp.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private MongoTemplate mongoTemplate;
    @PostMapping
    public Review createReview(String reviewBody, String imdbId){
        Review review = reviewRepository.insert(new Review(reviewBody));

        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review))
                .first();

        return review;
    }
}
