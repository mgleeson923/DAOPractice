package com.gc.dao;

import com.gc.dto.Product;

import java.util.List;

/**
 * Created by michaelgleeson on 7/20/17.
 */
public class FileDao implements ProductDao {
    @Override
    public List<Product> read() {
        return null;
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void deleteProduct(int keyIndex) {

    }

    @Override
    public void updateProduct(int keyIndex, Product product) {

    }
}
