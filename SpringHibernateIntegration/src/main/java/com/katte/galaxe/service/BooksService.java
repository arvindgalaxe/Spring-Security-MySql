package com.katte.galaxe.service;

import java.util.List;

import com.katte.galaxe.model.Books;

public interface BooksService {
	public void addBooks(Books b);
	public List<Books> listOfBooks();
	public void updateBooks(Books p);
    public Books getBooksById(int id);
    public void removeBooks(int id);
}
