package com.katte.galaxe.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.katte.galaxe.model.Books;

@Repository
public class BooksDAOImpl implements BooksDAO{
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addBooks(Books b) {
		Session session = this.sessionFactory.openSession();
		session.save(b);
		System.out.println("Book Details are saved successful....!!! \n"+b);
	}

	@Override
	public List<Books> listOfBooks() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Books> mybook = session.createQuery("from Books").list();
		System.out.println("NO of Books"+mybook.size());
		return mybook;
	}

	@Override
	public void updateBooks(Books b) {
		Session session = this.sessionFactory.openSession();
		System.out.println(b.getId());
		session.beginTransaction();
		session.update(b);
		session.getTransaction().commit();
		System.out.println("Books details are updated successfull....");
	}

	@Override
	public Books getBooksById(int id) {
		Session session = this.sessionFactory.openSession();
		Books b = (Books) session.load(Books.class, new Integer(id));
		return b;
	}

	@Override
	public void removeBooks(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Books b = (Books) session.load(Books.class, new Integer(id));
		if(b!=null)
		{
			session.delete(b);
		}
	}
}
