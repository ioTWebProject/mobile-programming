package com.mymoviesapp.callback;

import com.mymoviesapp.model.Movie;

import java.util.List;

public interface MoviesCallback {

    void success(List<Movie> movies);

    void error(Exception error);

}
