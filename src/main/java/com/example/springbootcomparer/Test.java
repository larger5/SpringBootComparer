package com.example.springbootcomparer;

import com.example.springbootcomparer.domain.Book;

import java.util.Date;
import java.util.HashSet;

/**
 * @author hongcunlin
 */
public class Test {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();
        Book book = new Book();
        book.setId(123L);
        book.setName("hello");
        book.setType(1);
        book.setCreateTime(new Date());
        book.setUpdateTime(new Date());
        books.add(book);
        System.out.println(books);
    }
}
