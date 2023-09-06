package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static String main(String[] args) {

        MenuItem mozzSticks = new MenuItem("Mozzarella Sticks", 8.99, "breaded cheese sticks with marinara", MenuItemCategory.APPETIZER, false);
        MenuItem spinDip = new MenuItem("Spinach Artichoke Dip", 12.99, "homemade dip served with bread thins", MenuItemCategory.APPETIZER, true);

        Menu currentMenu = new Menu(new java.util.Date(), new ArrayList<>());
        currentMenu.getItems().add(mozzSticks);
        currentMenu.getItems().add(spinDip);


        for (Object MenuItem : currentMenu.getItems()) {
            return MenuItem.toString();
        }

    }
