package com.intecap.apiproductos.response;

import com.intecap.apiproductos.model.Producto;

import java.util.List;

public class ProductoReponse {
    private List<Producto> productos;

    public List<Producto> getProductos(){
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
