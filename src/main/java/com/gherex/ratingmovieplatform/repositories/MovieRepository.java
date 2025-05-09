package com.gherex.ratingmovieplatform.repositories;

import com.gherex.ratingmovieplatform.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
