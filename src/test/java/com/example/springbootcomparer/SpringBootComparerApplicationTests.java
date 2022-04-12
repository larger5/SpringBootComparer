package com.example.springbootcomparer;

import com.example.springbootcomparer.domain.Book;
import com.example.springbootcomparer.domain.BookExt;
import com.example.springbootcomparer.service.BookCompareService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.*;

@SpringBootTest
class SpringBootComparerApplicationTests {

    @Resource
    private BookCompareService compareService;

    @Test
    void contextLoads() {
        // true
        System.out.println(compareService.compare(buildBookA(), buildBookB()));
    }

    private Book buildBookA() {
        Book book = new Book();
        book.setId(1L);
        book.setType(1);
        book.setName("hello");
        book.setCreateTime(new Date());
        book.setUpdateTime(new Date());
        List<BookExt> bookExt = new ArrayList<>();
        // 顺序不一致
        bookExt.add(buildExtA());
        bookExt.add(buildExtB());
        book.setBookExtList(bookExt);
        return book;
    }

    private Book buildBookB() {
        Book book = new Book();
        book.setId(1L);
        book.setType(1);
        book.setName("hello");
        book.setCreateTime(new Date());
        book.setUpdateTime(new Date());

        List<BookExt> bookExt = new ArrayList<>();
        // 顺序不一致
        bookExt.add(buildExtB());
        bookExt.add(buildExtA());
//        bookExtList.add(buildExtB());
        book.setBookExtList(bookExt);
        return book;
    }

    private BookExt buildExtA() {
        BookExt ext = new BookExt();
        ext.setId(1L);
        ext.setValue("hello");
        return ext;
    }

    private BookExt buildExtB() {
        BookExt ext = new BookExt();
        ext.setId(2L);
        ext.setValue("hi");
        return ext;
    }
}
