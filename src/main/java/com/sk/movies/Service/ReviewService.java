package com.sk.movies.Service;

import com.sk.movies.Entity.Movie;
import com.sk.movies.Repository.ReviewRepository;
import com.sk.movies.Entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReviewService {
    @Autowired
    ReviewRepository reviewRepository;
    @Autowired
    MongoTemplate mongoTemplate;

    public Review createReview(String reviewBody, String imdbId){
        Review review=reviewRepository.insert(new Review(reviewBody, LocalDateTime.now(),LocalDateTime.now()));
        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviews").value(review))
                .first();

                return review;
    }
}
