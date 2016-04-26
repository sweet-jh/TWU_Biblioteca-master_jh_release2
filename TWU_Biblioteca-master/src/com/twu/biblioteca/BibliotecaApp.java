package com.twu.biblioteca;

import java.io.*;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println(Messages.welcome());

        BookList simple = new BookList();

        Menu mainmenu = new Menu();
        mainmenu.addMenu("List Books");
        mainmenu.addMenu("Checkout Book");
        mainmenu.addMenu("Checkin Book");
        System.out.println(mainmenu.displayMenu());
        Scanner input = new Scanner(System.in);
        int selmenu = 0;
        int bookNum = 0;
        while (selmenu != 999) {
            System.out.println(Messages.selectMenu());
            selmenu = input.nextInt();
            switch (selmenu) {
                case 1:
                    String list = simple.getBookList();
                    System.out.println(list);
                    break;
                case 2:
                    System.out.println(Messages.checkBook());
                    bookNum = input.nextInt();
                    System.out.println(simple.checkout(bookNum));
                    break;
                case 3:
                    System.out.println(Messages.checkBook());
                    bookNum = input.nextInt();
                    System.out.println(simple.checkin(bookNum));
                    break;
                case 999:
                    break;
                default:
                    break;
            }
        }
    }
}
