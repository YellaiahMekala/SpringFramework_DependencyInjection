package com.explore.rest.java8.lambdaExplore;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(101, "java", 500));
        books.add(new Book(102,"sql",1500));
        books.add(new Book(103,"spring",2500));
        books.add(new Book(104,"rest",2000));
        return books;
    }
}
