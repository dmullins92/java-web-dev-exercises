package org.launchcode.java.studios.restaurantmenu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Menu {
    private LocalDate dateLastUpdated;
    private ArrayList<String> categories = new ArrayList<>(
            Arrays.asList("Appetizer", "Main Course", "Dessert")
    );
    private MenuItem special;
    private ArrayList<MenuItem> items;
    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
        this.dateLastUpdated = LocalDate.now();
    }
    public void addCategory(String category) {
        this.categories.add(category);
    }
    public void removeCategory(String category) {
        this.categories.remove(category);
    }
    public void addMenuItem(MenuItem item) {
        this.items.add(item);
    }
    public void removeMenuItem(MenuItem item) {
        this.items.remove(item);
    }
    public MenuItem getSpecial() {
        return special;
    }
    public void setSpecial(MenuItem special) {
        this.special = special;
    }
    public LocalDate getDateLastUpdated() {
        return dateLastUpdated;
    }
    public ArrayList<String> getCategories() {
        return categories;
    }
    public ArrayList<MenuItem> getItems() {
        return items;
    }

}
