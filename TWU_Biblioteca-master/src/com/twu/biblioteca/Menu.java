package com.twu.biblioteca;
import java.util.Vector;
/**
 * Created by hjing on 4/24/16.
 */
public class Menu {
    private Vector menu = new Vector();
    private boolean quit = false;

    public void addMenu(String menu) {
        this.menu.add(menu);
    }

    public String displayMenu() {
        String menuList = "";
        for (int i = 0; i < menu.size(); i++) {
            menuList = menuList + (i+1) +". " + menu.get(i).toString() + "\n";
        }
        return menuList;
    }

    public String validMenu(int order) {
        int number = menu.size();
        if (order > number) {
            return "Select a valid option!";
        } else return null;
    }

    public void setQuit(int q) {
        if (q == 1) {
            quit = true;
        }
    }

    public boolean getQuit() {
        return quit;
    }

    public String selectMenu(int selmenu) {
        if (this.validMenu(selmenu) == null)
            return menu.get(selmenu - 1).toString();
        else if (selmenu == 999) {
            setQuit(1);
            return null;
        }
        else
            return null;
    }

}
