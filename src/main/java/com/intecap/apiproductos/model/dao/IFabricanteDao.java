package com.intecap.apiproductos.model.dao;

import com.intecap.apiproductos.model.Fabricante;
import org.springframework.data.repository.CrudRepository;

public interface IFabricanteDao extends CrudRepository <Fabricante, Long> {
}
