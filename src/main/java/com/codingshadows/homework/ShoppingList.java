package com.codingshadows.homework;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    private List<String> items;

    public ShoppingList() {
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void replaceItem(int index, String newItem) {
        // TODO if the index is valid, replace the item at the index with the new item

    }

    public void removeItem(int index) {
        // TODO if the index is valid, remove the item at the index
    }

    public boolean containsItem(String item) {
        return items.contains(item);
    }

    public int size() {
        return items.size();
    }

    public List<String> getItems() {
        return new ArrayList<>(items);
    }
}
