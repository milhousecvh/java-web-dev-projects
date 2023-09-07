package org.launchcode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem mozzSticks = new MenuItem("Mozzarella Sticks",8.99, "breaded cheese sticks with marinara", MenuItemCategory.APPETIZER, false);
        MenuItem spinDip = new MenuItem("Spinach Artichoke Dip", 12.99, "homemade dip served with bread thins", MenuItemCategory.APPETIZER, true);
        MenuItem dilla = new MenuItem("Chicken Quessadilla", 9.99, "cheddar jack cheese and grilled chicken quesadilla", MenuItemCategory.APPETIZER, false);
        MenuItem iceCream = new MenuItem("mint chocolate chip gelato", 4.99, "mint chocolate chip gelato", MenuItemCategory.DESSERT, false)
        Menu currentMenu = new Menu();

        currentMenu.getItems().add(mozzSticks);
        currentMenu.getItems().add(spinDip);
        currentMenu.getItems().add(dilla);

        // print menu
        System.out.println(currentMenu.toString());


        //print single item????
        System.out.println(mozzSticks);


        //delete item
        currentMenu.getItems().remove(0);

        //reprint menu
        System.out.println(currentMenu.toString());

        System.out.println(spinDip.equals(mozzSticks));
    }
}
