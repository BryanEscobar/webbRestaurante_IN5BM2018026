package com.bryanescobar.entities;

import com.bryanescobar.entities.Detallefactura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T10:54:55")
@StaticMetamodel(Cocineros.class)
public class Cocineros_ { 

    public static volatile ListAttribute<Cocineros, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Cocineros, String> apellido;
    public static volatile SingularAttribute<Cocineros, Integer> idcocineros;
    public static volatile SingularAttribute<Cocineros, String> sueldo;
    public static volatile SingularAttribute<Cocineros, String> nombre;

}