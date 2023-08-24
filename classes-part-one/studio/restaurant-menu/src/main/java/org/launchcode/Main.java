package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem mozzSticks = new MenuItem("Mozzarella Sticks",8.99, "breaded cheese sticks with marinara", MenuItemCategory.APPETIZER, false);
        MenuItem spinDip = new MenuItem("Spinach Artichoke Dip", 12.99, "homemade dip served with bread thins", MenuItemCategory.APPETIZER, true);

        Menu currentMenu = new Menu(new java.util.Date(), new ArrayList<>());
        currentMenu.getItems().add(mozzSticks);
        currentMenu.getItems().add(spinDip);

        System.out.println(currentMenu.getItems());

        //iterate over the currentMenu arrayLists
        //for MenuItem : currentMenu.getItems()
        //print out the properties you want


    }
}
