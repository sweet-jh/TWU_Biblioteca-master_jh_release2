package com.twu.biblioteca;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ExampleTest {

    @Test
    public void WelcomTest() {
        assertEquals("Welcome to biblioteca!",Messages.welcome());
    }

    @Test
    public void BookListTest() {
        BookList simple = new BookList();
        assertEquals(simple.getBookList(),"Head First Java    Kathy Sierra & Bert Bates    2015\n" +
                "Effective Java    Joshua Bloch    2014\n" +
                "A Song of Ice and Fire    George R. R. Martin    2012\n" +
                "The Book Thief    Markus Zusak    2013\n" +
                "The Hogwarts Library Boxed Set    J.K. Rowling    2013\n" +
                "Modern PHP    Josh Lockhart    2015\n");
    }

    @Test
    public void displayDetailTest() {
        Books HeadFirstJava = new Books("Head First Java","Kathy Sierra & Bert Bates",2015);
        assertEquals(HeadFirstJava.displayDetail(),"Head First Java    Kathy Sierra & Bert Bates    2015\n");
    }

    @Test
    public void displayMenuTest() {
        Menu simple = new Menu();
        simple.addMenu("List Books");
        assertEquals(simple.displayMenu(),"1. List Books\n");
    }

    @Test
    public void validMenuTest() {
        Menu simple = new Menu();
        simple.addMenu("List Books");
        int order = 2;
        assertEquals(simple.validMenu(order),"Select a valid option!");
    }

    @Test
    public void validMenuTest2() {
        Menu simple = new Menu();
        simple.addMenu("List Books");
        int order = 1;
        assertEquals(simple.validMenu(order),null);
    }

    @Test
    public void quitTest() {
        Menu simple = new Menu();
        simple.addMenu("List Books");
        simple.addMenu("Select a book");

        int i=0;
        int selmenu[] = new int[]{2, 1, 999, 3, 2};
        for(i=0;i<5;i++) {
            simple.selectMenu(selmenu[i]);
            if(simple.getQuit())
                break;
        }
        assertEquals(i,2);
    }

    @Test
    public void checkoutTest() {
        BookList floor1 = new BookList();
        floor1.checkout(3);
        assertEquals(floor1.getBookList(),"Head First Java    Kathy Sierra & Bert Bates    2015\n" +
                "Effective Java    Joshua Bloch    2014\n" +
                "The Book Thief    Markus Zusak    2013\n" +
                "The Hogwarts Library Boxed Set    J.K. Rowling    2013\n" +
                "Modern PHP    Josh Lockhart    2015\n");
    }

    @Test
    public void checkoutWelcom() {
        BookList floor1 = new BookList();
        assertEquals(floor1.checkout(3),"Thank you! Enjoy the book.");
    }

    @Test
    public void checkoutFail() {
        BookList floor2 = new BookList();
        floor2.checkout(3);
        assertEquals(floor2.checkout(3),"That book is not available!");
    }

    @Test
    public void checkinWelcom() {
        BookList floor1 = new BookList();
        floor1.checkout(3);
        assertEquals(floor1.checkin(3),"Thank you for returning the book.");
    }

    @Test
    public void checkinFail() {
        BookList floor2 = new BookList();
        assertEquals(floor2.checkin(7),"That is not a valid book to return.");
    }


}
