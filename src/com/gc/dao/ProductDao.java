package com.gc.dao;

import com.gc.dto.Product;

import java.util.List;

/**
 * Created by michaelgleeson on 7/20/17.
 * CRUD operations are defined in the DAO
 */

public interface ProductDao {
    public int FILE_DAO = 1;
    public int JDBC_DAO = 2;

    //Read
    public List<Product> read();

    //Create
    public void addProduct(Product product);

    //Delete
    public void deleteProduct(int keyIndex);

    //Update
    public void updateProduct(int keyIndex, Product product);

}
