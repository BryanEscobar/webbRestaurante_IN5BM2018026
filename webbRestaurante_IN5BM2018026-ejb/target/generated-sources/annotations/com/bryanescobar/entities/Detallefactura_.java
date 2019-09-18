package com.bryanescobar.entities;

import com.bryanescobar.entities.Cocineros;
import com.bryanescobar.entities.Facturas;
import com.bryanescobar.entities.Platos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T10:54:55")
@StaticMetamodel(Detallefactura.class)
public class Detallefactura_ { 

    public static volatile ListAttribute<Detallefactura, Platos> platosList;
    public static volatile SingularAttribute<Detallefactura, Cocineros> cocinerosIdcocineros;
    public static volatile SingularAttribute<Detallefactura, Integer> cantidad;
    public static volatile SingularAttribute<Detallefactura, Integer> precioventa;
    public static volatile SingularAttribute<Detallefactura, Double> preciototal;
    public static volatile SingularAttribute<Detallefactura, Integer> iddetallefactura;
    public static volatile SingularAttribute<Detallefactura, Facturas> facturasIdfacturas;

}