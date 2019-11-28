package com.ustglobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.BookConfig;
import com.ustglobal.springcore.di.Book;

public class BookApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BookConfig.class);
		Book book = context.getBean(Book.class);
		System.out.println("Book Name : " +book.getName());
		System.out.println("Price : " +book.getPrice());
		System.out.println("Author Name :" +book.getAuthor().getName());
		System.out.println("Pet Name : " +book.getAuthor().getPetname());
	}
}
