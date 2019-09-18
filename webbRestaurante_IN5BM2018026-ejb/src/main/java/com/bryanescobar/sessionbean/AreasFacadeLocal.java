/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryanescobar.sessionbean;

import com.bryanescobar.entities.Areas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface AreasFacadeLocal {

    void create(Areas areas);

    void edit(Areas areas);

    void remove(Areas areas);

    Areas find(Object id);

    List<Areas> findAll();

    List<Areas> findRange(int[] range);

    int count();
    
}
