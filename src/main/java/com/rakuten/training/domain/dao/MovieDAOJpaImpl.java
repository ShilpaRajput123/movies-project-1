package com.rakuten.training.domain.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.rakuten.training.domain.Movie;

public class MovieDAOJpaImpl implements MovieDAO {
    
	Map<Integer,Movie> db = new HashMap<>();
	int idSequence = 0;
	
	
	@Autowired
	EntityManager em;
	@Override
	public Movie save(Movie toBeSaved) {
		int id = ++idSequence;
		toBeSaved.setId(id);
		db.put(id, toBeSaved);
		return toBeSaved;
		
	}

	@Override
	public Movie findById(int id) {
		
		 return db.get(id);
	}

	@Override
	public List<Movie> findByGenre(String genre) {
		Query q=em.createQuery("Select m from Movie m where m.firstGenre=:firstgenre");
		q.setParameter("firstgenre", findByGenre("firstgenre"));
		return q.getResultList();
	}

	@Override
	public List<Movie> findByNumSongsGreaterThan(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> findByNameLike(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}
     
}
