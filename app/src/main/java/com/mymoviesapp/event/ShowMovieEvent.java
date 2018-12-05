package com.mymoviesapp.event;

import com.mymoviesapp.model.Movie;

public class ShowMovieEvent {
    public final Movie movie;

    public ShowMovieEvent(Movie movie) {

        this.movie = movie;
    }
}
