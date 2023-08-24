package org.launchcode;

public class MenuItem {
    private String name;
    private double price;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuItemCategory getCategory() {
        return category;
    }

    public void setCategory(MenuItemCategory category) {
        this.category = category;
    }

    private MenuItemCategory category;
    private boolean isNew;

    public MenuItem(String name, double price, String description, MenuItemCategory category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public boolean isNew() {
        return isNew;
    }


    @Override
    public String toString() {
        return  name + ":" +
                 category + "\n" +
                 description + "\n" +
                 isNew + price + "\n";
    }
}
