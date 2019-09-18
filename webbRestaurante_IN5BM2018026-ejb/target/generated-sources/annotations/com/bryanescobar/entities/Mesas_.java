package com.bryanescobar.entities;

import com.bryanescobar.entities.Areas;
import com.bryanescobar.entities.Facturas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T10:54:55")
@StaticMetamodel(Mesas.class)
public class Mesas_ { 

    public static volatile SingularAttribute<Mesas, Integer> idmesas;
    public static volatile SingularAttribute<Mesas, String> categorias;
    public static volatile SingularAttribute<Mesas, Areas> areasIdareas;
    public static volatile ListAttribute<Mesas, Facturas> facturasList;

}