package com.gc.controller;

import com.gc.dao.FileDao;
import com.gc.dao.JDBCDao;
import com.gc.dao.ProductDao;
import com.gc.dto.Product;
import com.gc.factory.DaoFactory;

import java.util.List;

/**
 * Created by michaelgleeson on 7/20/17.
 */
public class DaoDemo {
    public static void main(String[] args) {
        //JDBCDao dao = new JDBCDao();
        //ProductDao dao = new FileDao();
        ProductDao dao = DaoFactory.getDaoInstance(ProductDao.FILE_DAO);

        List<Product> list = dao.read();

        for(Product prod: list) {
            System.out.println(prod);
        }
    }
}
