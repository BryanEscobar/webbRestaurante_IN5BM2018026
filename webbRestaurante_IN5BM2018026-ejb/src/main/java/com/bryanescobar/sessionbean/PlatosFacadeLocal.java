/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryanescobar.sessionbean;

import com.bryanescobar.entities.Platos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface PlatosFacadeLocal {

    void create(Platos platos);

    void edit(Platos platos);

    void remove(Platos platos);

    Platos find(Object id);

    List<Platos> findAll();

    List<Platos> findRange(int[] range);

    int count();
    
}
