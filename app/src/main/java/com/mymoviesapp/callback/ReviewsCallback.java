package com.mymoviesapp.callback;

import com.mymoviesapp.model.Review;

import java.util.List;

public interface ReviewsCallback {

    void success(List<Review> reviews);

    void error(Exception error);

}
