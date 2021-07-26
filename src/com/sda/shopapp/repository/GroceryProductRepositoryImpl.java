package com.sda.shopapp.repository;

import com.sda.shopapp.model.GroceryProduct;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.zip.GZIPOutputStream;

public class GroceryProductRepositoryImpl extends SellableRepositoryImpl<GroceryProduct> implements GroceryProductRepo {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy");

    public GroceryProductRepositoryImpl() throws IOException {
        Path path = Paths.get("C:/Users/Alin/Documents/Sda-Java-Advance/src/groceries.csv");
        Files.lines(path)
                .skip(1)
                .filter(line -> line != null)
                .filter(line -> !line.isEmpty())
                .map(lines -> {
                    try {
                        String[] arrayElem = lines.split("\\|");
                        return new GroceryProduct(
                                DATE_FORMAT.parse(arrayElem[5]),
                                Boolean.parseBoolean(arrayElem[6]),
                                arrayElem[7],
                                arrayElem[2],
                                Double.parseDouble(arrayElem[1]),
                                arrayElem[3],
                                arrayElem[4],
                                arrayElem[0]
                        );
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                }).filter(groceryProduct -> groceryProduct != null)
                .forEach(groceryProduct -> groceryProduct.add(groceryProduct));
    }
}
