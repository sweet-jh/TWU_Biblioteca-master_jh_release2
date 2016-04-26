package com.twu.biblioteca;

/**
 * Created by hjing on 4/26/16.
 */
public class User {
    private String name;
    private String password;
    private String email;
    private String address;
    private String telephone;

    public boolean login(String name, String password) {
        if(this.name == name && this.password == password) {
            return true;
        }
        else
            return false;
    }

    public String checkInformation() {
        return this.name + this.email +this.address + this.telephone;
    }

    public void checkoutBook(int order) {
        BookList bookList = new BookList();
        bookList.checkout(order,this.name);
    }

}
