package com.sda.shopapp.repository;

import com.sda.shopapp.model.Sellable;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SellableRepositoryImpl<T extends Sellable> implements SellableRepository<T> {
    private Map<String, T> sellableByID = new HashMap<>();

    @Override
    public void add(T item) {
        sellableByID.put(item.getId(), item);
    }

    @Override
    public Optional<T> search(String id) {
        T item = sellableByID.get(id);
        return Optional.ofNullable(item);
    }

    @Override
    public void remove(String id) {
        sellableByID.remove(id);
    }

    @Override
    public Optional<T> findByName(String name) {
      return   sellableByID.values()
                .stream()
                .filter(item -> item.getName().equals(name))
                .findAny();
    }
}
