package com.bryanescobar.entities;

import com.bryanescobar.entities.Facturas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T10:54:55")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> apellido;
    public static volatile SingularAttribute<Clientes, String> categoria;
    public static volatile SingularAttribute<Clientes, String> nit;
    public static volatile SingularAttribute<Clientes, Integer> idclientes;
    public static volatile SingularAttribute<Clientes, String> nombre;
    public static volatile ListAttribute<Clientes, Facturas> facturasList;

}