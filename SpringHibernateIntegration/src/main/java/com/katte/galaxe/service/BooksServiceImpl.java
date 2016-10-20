package com.katte.galaxe.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.katte.galaxe.dao.BooksDAO;
import com.katte.galaxe.model.Books;

@Service
public class BooksServiceImpl implements BooksService{
     
	private BooksDAO booksdao;
	
	public void setBooksdao(BooksDAO booksdao) {
		this.booksdao = booksdao;
	}
    @Transactional
	@Override
	public void addBooks(Books b) {
		this.booksdao.addBooks(b);				
	}
    @Transactional
	@Override
	public List<Books> listOfBooks() {
		return this.booksdao.listOfBooks();
	}
	@Override
	public void updateBooks(Books b) {
		this.booksdao.updateBooks(b);		
	}
	@Override
	@Transactional
	public Books getBooksById(int id) {	
		return this.booksdao.getBooksById(id);
	}
	@Override
	@Transactional
	public void removeBooks(int id) {
				this.booksdao.removeBooks(id);
	}
}
