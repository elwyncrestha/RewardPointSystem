/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softwarica.dao;

import org.hibernate.Session;

/**
 *
 * @author elwyn
 */
public abstract class SuperDao {

    protected abstract Session getCurrentSession();

}
