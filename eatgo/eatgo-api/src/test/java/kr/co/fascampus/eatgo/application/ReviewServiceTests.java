package kr.co.fascampus.eatgo.application;

import kr.co.fascampus.eatgo.domain.Review;
import kr.co.fascampus.eatgo.domain.ReviewRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

public class ReviewServiceTests {

    @Autowired
    private ReviewService reviewService;

    @Mock
    private ReviewRepository reviewRepository;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);

        reviewService = new ReviewService(reviewRepository);
    }

    @Test
    public void addReview(){
        Review review = Review.builder()
                .name("Black")
                .score(3)
                .description("ads")
                .build();

        reviewService.addReview(review);

        verify(reviewRepository).save(any());
    }
}