package com.softwarica.daoImpl;

import com.softwarica.dao.SuperDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elwyn
 */
@Repository
public class SuperDaoImpl extends SuperDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

}
