package com.example.springbootcomparer.service;

import com.example.springbootcomparer.domain.Book;

/**
 * @author hongcunlin
 */
public interface BookCompareService {
    /**
     * 两本书是否一样
     *
     * @param a 书1
     * @param b 书2
     * @return 是否一样
     */
    boolean compare(Book a, Book b);
}
