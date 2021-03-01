package com.rakuten.training.domain.dao;

import java.util.List;


import com.rakuten.training.domain.Movie;

public interface MovieDAO {
	public Movie save(Movie toBeSaved);
	public Movie findById(int id);
	public List<Movie> findByGenre(String genre);
	public List<Movie> findByNumSongsGreaterThan(int num);
	public List<Movie> findByNameLike(String name);
	public void deleteById(int id);
}
