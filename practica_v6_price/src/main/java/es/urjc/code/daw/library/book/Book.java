package es.urjc.code.daw.library.book;

import com.fasterxml.jackson.annotation.JsonAlias;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id = null;
	
	private String title;
	

	private String preface;

	@JsonAlias("price_int")
	private Integer price;

	@Column(name = "price_float")
	@JsonAlias("price")
	private Float priceFloat;


	public Book() {}

	public Book(String nombre, String preface) {
		super();
		this.title = nombre;
		this.preface = preface;
	}

	public Float getPriceFloat() {
        return priceFloat;
    }

	public void setPriceFloat(Float priceFloat) {
		this.priceFloat = priceFloat;
		this.price = priceFloat.intValue();
	}

	public String getPreface() {
		return preface ;
	}

	public void setPreface(String preface) {
		this.preface = preface;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", preface=" + preface + "]";
	}

}
