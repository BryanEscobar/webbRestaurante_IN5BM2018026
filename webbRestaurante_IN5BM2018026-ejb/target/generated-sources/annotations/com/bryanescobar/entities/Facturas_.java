package com.bryanescobar.entities;

import com.bryanescobar.entities.Clientes;
import com.bryanescobar.entities.Detallefactura;
import com.bryanescobar.entities.Mesas;
import com.bryanescobar.entities.Meseros;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T10:54:55")
@StaticMetamodel(Facturas.class)
public class Facturas_ { 

    public static volatile SingularAttribute<Facturas, Date> fecha;
    public static volatile SingularAttribute<Facturas, Clientes> clientesIdclientes;
    public static volatile SingularAttribute<Facturas, Meseros> meserosIdmeseros;
    public static volatile ListAttribute<Facturas, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Facturas, Mesas> mesasIdmesas;
    public static volatile SingularAttribute<Facturas, Integer> idfacturas;

}