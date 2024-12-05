package it.svitali.blog.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String titolo;
	
	private String contenuto;
//	private String user;
//	private String categoria;
//	private String media;
	
	private LocalDateTime dataPubblicazione;
	
	//COSTRUTTORE
	
	public Post () {
		dataPubblicazione = LocalDateTime.now();
	}
	
	
    //GETTER e SETTER
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		titolo = titolo;
	}

	public String getContenuto() {
		return contenuto;
	}

	public void setContenuto(String contenuto) {
		contenuto = contenuto;
	}

	public LocalDateTime getDataPubblicazione() {
		return dataPubblicazione;
	}


	
	
	

}
