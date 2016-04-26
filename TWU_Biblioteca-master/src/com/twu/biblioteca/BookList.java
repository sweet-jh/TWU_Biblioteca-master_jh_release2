package com.twu.biblioteca;
/**
 * Created by hjing on 4/24/16.
 */

public class BookList {
    private Books[] bookList;
    private String AllBookList="";
    BookList() {
        bookList = new Books[6];
        bookList[0] = new Books("Head First Java","Kathy Sierra & Bert Bates",2015);
        bookList[1] = new Books("Effective Java","Joshua Bloch",2014);
        bookList[2] = new Books("A Song of Ice and Fire","George R. R. Martin",2012);
        bookList[3] = new Books("The Book Thief","Markus Zusak",2013);
        bookList[4] = new Books("The Hogwarts Library Boxed Set","J.K. Rowling",2013);
        bookList[5] = new Books("Modern PHP","Josh Lockhart",2015);
    }

    public String getBookList() {

        for(int i=0;i<6;i++) {
            if(bookList[i].getStatus())
                AllBookList = AllBookList+(i+1)+". "+bookList[i].displayDetail();
        }
        return AllBookList;
    }

    public String checkout(int order, String name) {
        if( (order-1)<6 && bookList[order-1].getStatus() ) {
            bookList[order - 1].setStatus(false);
            bookList[order - 1].setLendBy(name);
            return "Thank you! Enjoy the book.";
        }
        else
            return "That book is not available!";
    }

    public String checkin(int order) {
        if( (order-1)<6 && !bookList[order-1].getStatus() ) {
            bookList[order-1].setStatus(true);
            return "Thank you for returning the book.";
        }
        else {
            return "That is not a valid book to return.";
        }
    }

}
