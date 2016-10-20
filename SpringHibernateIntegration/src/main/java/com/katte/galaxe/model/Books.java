package com.katte.galaxe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Books {
	@Id@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    public void setId(int id) {
		this.id = id;
	}

	private String name;
    private String author;
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	@Override
	public String toString() {
		return "Books [name=" + name + ", author=" + author + ", isbn=" + isbn + ", price=" + price + "]";
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}

	private String isbn;
    private int price;
}
