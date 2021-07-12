package com.sda.javaadvance.genericclass.repository;

import com.sda.javaadvance.genericclass.model.Identifiable;

import java.util.ArrayList;
import java.util.List;

public class IdentifiableRepository<T extends Identifiable> {

    protected List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);

    }

    public T getItemById(String id) {

        for (T item : items) {
            if (item.getID().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public void removeItemByID(String id) {
        T itemToBeRemove = getItemById(id);
        if (itemToBeRemove != null) {
            items.remove(itemToBeRemove);
        }
    }

}
