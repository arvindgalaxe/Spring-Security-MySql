package com.katte.galaxe;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.katte.galaxe.model.Books;
import com.katte.galaxe.service.BooksService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	private BooksService bookservice;
	@Autowired(required=true)
	@Qualifier(value="bookservice")
	public void setBookservice(BooksService bookservice) {
		this.bookservice = bookservice;
	}

	@RequestMapping(value={"/","/newbook"})
	public String books(@ModelAttribute("mybook") Books b)
	{
		return "books";
	}
	
	@RequestMapping(value="/addbooks", method=RequestMethod.POST)
	public ModelAndView insertBooks(@ModelAttribute("mybook") Books b)
	{
		ModelAndView mav = new ModelAndView("success");
		this.bookservice.addBooks(b);
		mav.addObject("listOfBooks",this.bookservice.listOfBooks());
		return mav;
	}
	@RequestMapping(value="/edit/{id}")
	public ModelAndView editBooks(@ModelAttribute("mybook") @PathVariable("id") int id, Books b)
	{
		b = bookservice.getBooksById(id);
		return new ModelAndView("edit","mybook",b);
	}
	@RequestMapping(value="/edit/editBooks", method=RequestMethod.POST)
	public ModelAndView updateBooks(@ModelAttribute("mybook") Books b)
	{
		System.out.println("djfksdjfjksdfjkhsdfhjk");
		ModelAndView mav = new ModelAndView("success");
		this.bookservice.updateBooks(b);
		mav.addObject("listOfBooks",this.bookservice.listOfBooks());
		return mav;	
	}
	@RequestMapping(value="/delete/{id}")
	public ModelAndView deleteBooks(@ModelAttribute("mybook") @PathVariable("id") int id, Books b)
	{
		ModelAndView mav = new ModelAndView("success");
		this.bookservice.removeBooks(id);
		mav.addObject("listOfBooks",this.bookservice.listOfBooks());
		return mav;
	}
}
