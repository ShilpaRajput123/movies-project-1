package com.rakuten.training.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column(name="movie_poster")
	String poster;
	@Column(name="movie_desc")
	String desc;
	@Column(name="movie_songs")
	String songs;
	@Column(name="movie_fight")
	String fight;
	@Column(name="movie_genre")
	String genre;
	
    public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(String poster, String desc, String songs, String fight, String genre) {
		super();
		this.poster = poster;
		this.desc = desc;
		this.songs = songs;
		this.fight = fight;
		this.genre = genre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getSongs() {
		return songs;
	}

	public void setSongs(String songs) {
		this.songs = songs;
	}

	public String getFight() {
		return fight;
	}

	public void setFight(String fight) {
		this.fight = fight;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
    
	
}
