package com.intecap.apiproductos.model.dao;

import com.intecap.apiproductos.model.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IProductoDao extends CrudRepository <Producto, Long> {
}
