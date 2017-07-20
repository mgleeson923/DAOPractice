package com.gc.factory;

import com.gc.dao.FileDao;
import com.gc.dao.JDBCDao;
import com.gc.dao.ProductDao;

/**
 * Created by michaelgleeson on 7/20/17.
 */
public class DaoFactory {
    public static ProductDao getDaoInstance(int fileDao) {
        switch (fileDao) {
            case ProductDao.FILE_DAO:
                return new FileDao();

            case ProductDao.JDBC_DAO:
                return new JDBCDao();

            default:
                break;
        }
        return null;
    }
}
