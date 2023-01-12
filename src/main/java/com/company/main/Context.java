package com.company.main;

import com.company.dao.impl.TourismDaoImpl;
import com.company.dao.inter.TourismDaoInter;

public class Context {

    public static TourismDaoInter instanceTourismDao() {
        return new TourismDaoImpl();
    }
    
}
