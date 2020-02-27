package model;

import java.util.List;

interface ProductInterface {
    List<Product> all(); // get all the product records
    void insert(Product product); // persist new product to the database
}
