package com.ywxx.cineEase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ywxx.cineEase.entity.Movie;
import com.ywxx.cineEase.repository.MovieRepository;
import com.ywxx.cineEase.service.MovieService;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @PostMapping("/save")
    public Movie saveMovie(@RequestBody Movie movie) {
        return movieService.save(movie);
    }

    @GetMapping("/movies")
    public String listMovies() {
        return movieService.findAll().toString();
    }
}
