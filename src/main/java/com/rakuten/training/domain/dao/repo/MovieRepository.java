package com.rakuten.training.domain.dao.repo;

import org.springframework.data.repository.CrudRepository;

import com.rakuten.training.domain.Movie;

public interface MovieRepository extends CrudRepository<Movie,Integer> {
     
}
