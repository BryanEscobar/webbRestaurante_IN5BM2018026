/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryanescobar.sessionbean;

import com.bryanescobar.entities.Cocineros;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface CocinerosFacadeLocal {

    void create(Cocineros cocineros);

    void edit(Cocineros cocineros);

    void remove(Cocineros cocineros);

    Cocineros find(Object id);

    List<Cocineros> findAll();

    List<Cocineros> findRange(int[] range);

    int count();
    
}
