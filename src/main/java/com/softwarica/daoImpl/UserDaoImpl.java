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

import com.softwarica.dao.UserDao;
import com.softwarica.model.UserTbl;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elwyn
 */
@Repository
public class UserDaoImpl implements UserDao{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void insert(UserTbl userTbl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserTbl> selectAll() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<UserTbl> cq = cb.createQuery(UserTbl.class);
        Root<UserTbl> root = cq.from(UserTbl.class);
        cq.select(root);
        
        List<UserTbl> results = session.createQuery(cq).getResultList();
        return results;
    }

    @Override
    public UserTbl selectById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(UserTbl userTbl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(UserTbl userTbl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public long countStudents()
    {
        Session session = sessionFactory.openSession();
        String query = "SELECT COUNT(u) FROM com.softwarica.model.UserTbl u";
        Query q = session.createQuery(query);
        long count = (long)q.getSingleResult();
        return count;
    }

    @Override
    public long countStudents(String gender) {
        char userGender;
        switch(gender.toLowerCase())
        {
            case "male":
                userGender = 'M';
                break;
            case "female":
                userGender = 'F';
                break;
            default:
                userGender = 'O';
        }
        Session session = sessionFactory.openSession();
        String query = "SELECT COUNT(u) FROM com.softwarica.model.UserTbl u WHERE u.userGender='"+userGender+"'";
        Query q = session.createQuery(query);
        long count = (long)q.getSingleResult();
        return count;
    }
}
