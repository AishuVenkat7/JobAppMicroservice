package com.project.reviewms.review;

import java.util.List;

public interface ReviewService {
	
	List<Review> getAllReviews(Long companyId);
	
	Review getReviewById(Long reviewId);
	
	boolean addReview(Long companyId, Review review);
	
	boolean updateReview(Long reviewId, Review updatedReview);

	boolean deleteReviewById(Long reviewId);

}
