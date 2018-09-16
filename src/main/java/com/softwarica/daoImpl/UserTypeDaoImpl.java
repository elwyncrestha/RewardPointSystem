/*
 * The MIT License
 *
 * Copyright 2018 elwyn.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.softwarica.daoImpl;

import com.softwarica.dao.UserTypeDao;
import com.softwarica.model.UsertypeTbl;
import java.util.ArrayList;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author elwyn
 */
public class UserTypeDaoImpl implements UserTypeDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void add(UsertypeTbl usertypeTbl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<UsertypeTbl> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UsertypeTbl selectById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(UsertypeTbl usertypeTbl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(UsertypeTbl usertypeTbl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verifyUserType(String userTypeName) {
        Session localSession = sessionFactory.getCurrentSession();
        localSession.beginTransaction();
        CriteriaBuilder builder = localSession.getCriteriaBuilder();
        CriteriaQuery<UsertypeTbl> criteria = builder.createQuery(UsertypeTbl.class);

        ArrayList<UsertypeTbl> arrayList = (ArrayList<UsertypeTbl>) localSession.createQuery(criteria).getResultList();

        for (UsertypeTbl user : arrayList) {
            System.out.println(user.getAuthority());
        }
        localSession.getTransaction().commit();
        localSession.close();

        return true;
    }

}
