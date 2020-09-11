package kr.co.fascampus.eatgo.interfeaces;

import kr.co.fascampus.eatgo.application.ReviewService;
import kr.co.fascampus.eatgo.domain.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/restaurants/{restaurantsId}/reviews")
    public ResponseEntity<?> create(@PathVariable Long restaurantsId,
                                    @Valid @RequestBody Review resource) throws URISyntaxException {
        Review review = reviewService.addReview(Review.builder()
                .name(resource.getName())
                .score(resource.getScore())
                .description(resource.getDescription())
                .build());

        String url = "/restaurants/" + restaurantsId + "/reviews/" + review.getId();
        return ResponseEntity.created(new URI(url)).body("{}");
    }
}
