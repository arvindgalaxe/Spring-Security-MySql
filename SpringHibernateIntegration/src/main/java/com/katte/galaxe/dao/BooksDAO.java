package com.katte.galaxe.dao;

import java.util.List;

import com.katte.galaxe.model.Books;

public interface BooksDAO {
     public void addBooks(Books b);
     public List<Books> listOfBooks();
     public void updateBooks(Books b);
     public Books getBooksById(int id);
     public void removeBooks(int id);
}
