package org.launchcode;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public Menu() { this.lastUpdated = LocalDate.now(); }

    public void addMenuItem(MenuItem item) {
        this.menuItems.add(item);
        this.lastUpdated = LocalDate.now();
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.menuItems = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return menuItems;
    }


    @Override
    public String toString() {
        String output = "";
        for(MenuItem item: this.menuItems){
            output += item.toString() + "\n";
        }
        output += this.lastUpdated;
        return output;
    }
}
