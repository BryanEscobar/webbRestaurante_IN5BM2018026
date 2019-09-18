package com.bryanescobar.entities;

import com.bryanescobar.entities.Facturas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T10:54:55")
@StaticMetamodel(Meseros.class)
public class Meseros_ { 

    public static volatile SingularAttribute<Meseros, String> apellido;
    public static volatile SingularAttribute<Meseros, Double> sueldo;
    public static volatile SingularAttribute<Meseros, Integer> idmeseros;
    public static volatile SingularAttribute<Meseros, String> nombre;
    public static volatile ListAttribute<Meseros, Facturas> facturasList;

}