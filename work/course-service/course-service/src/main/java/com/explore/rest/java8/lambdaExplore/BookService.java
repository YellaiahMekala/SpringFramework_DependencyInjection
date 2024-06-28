package com.explore.rest.java8.lambdaExplore;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
    public List<Book> getBooksinSort(){

        List<Book> books=new BookDao().getBooks();
        Collections.sort(books,new MyComparator());
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksinSort());
    }
}


class MyComparator implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        //if we interchange arguments in below comparison we change
        // sorting order from asc to desc order .i.e.vice versa 
        return o2.getName().compareTo(o1.getName());

    }
}
