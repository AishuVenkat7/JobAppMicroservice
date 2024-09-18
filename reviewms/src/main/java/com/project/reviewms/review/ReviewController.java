package com.project.reviewms.review;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

	private ReviewService reviewService;

	public ReviewController(ReviewService reviewService) {
		super();
		this.reviewService = reviewService;
	}

	@GetMapping
	public ResponseEntity<List<Review>> getAllReviews(@RequestParam Long companyId) {
		List<Review> reviews = reviewService.getAllReviews(companyId);
		return ResponseEntity.ok(reviews);
	}

	@GetMapping("/{reviewId}")
	public ResponseEntity<Review> getReviewById(@PathVariable Long reviewId) {
		Review review = reviewService.getReviewById(reviewId);
		if (review != null)
			return ResponseEntity.ok(review);
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@PostMapping("/create")
	public ResponseEntity<String> addReview(@RequestParam Long companyId, @RequestBody Review review) {
		boolean isCreated = reviewService.addReview(companyId, review);
		if (isCreated)
			return new ResponseEntity<>("Review created Successfully", HttpStatus.CREATED);
		return new ResponseEntity<>("Review not created", HttpStatus.NOT_FOUND);
	}

	@PutMapping("/{reviewId}")
	public ResponseEntity<String> updateReview(@PathVariable Long reviewId, @RequestBody Review updatedReview) {
		boolean isUpdated = reviewService.updateReview(reviewId, updatedReview);
		if (isUpdated)
			return ResponseEntity.ok("Review updated Successfully");
		return new ResponseEntity<>("Review not updated", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/{reviewId}")
	public ResponseEntity<String> deleteReviewById(@PathVariable Long reviewId) {
		boolean isDeleted = reviewService.deleteReviewById(reviewId);
		if (isDeleted)
			return ResponseEntity.ok("Review deleted Successfully");
		return new ResponseEntity<>("Review not deleted", HttpStatus.NOT_FOUND);
	}

}
