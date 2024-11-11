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
	private Integer Id;
	
	private String Titolo;
	
	private String Contenuto;
//	private String User;
//	private String Categoria;
//	private String Media;
	
	private LocalDateTime DataPubblicazione;
	
	//COSTRUTTORE
	
	public Post () {
		DataPubblicazione = LocalDateTime.now();
	}
	
	
    //GETTER e SETTER
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getTitolo() {
		return Titolo;
	}

	public void setTitolo(String titolo) {
		Titolo = titolo;
	}

	public String getContenuto() {
		return Contenuto;
	}

	public void setContenuto(String contenuto) {
		Contenuto = contenuto;
	}

	public LocalDateTime getDataPubblicazione() {
		return DataPubblicazione;
	}


	
	
	

}
