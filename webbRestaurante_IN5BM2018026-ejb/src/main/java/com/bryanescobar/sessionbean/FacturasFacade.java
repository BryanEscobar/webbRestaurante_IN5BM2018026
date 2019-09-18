/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryanescobar.sessionbean;

import com.bryanescobar.entities.Facturas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author programacion
 */
@Stateless
public class FacturasFacade extends AbstractFacade<Facturas> implements FacturasFacadeLocal {

    @PersistenceContext(unitName = "com.bryanescobar_webbRestaurante_IN5BM2018026-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FacturasFacade() {
        super(Facturas.class);
    }
    
}
