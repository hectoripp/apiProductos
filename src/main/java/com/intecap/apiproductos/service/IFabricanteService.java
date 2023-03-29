package com.intecap.apiproductos.service;

import com.intecap.apiproductos.model.Fabricante;
import com.intecap.apiproductos.response.FabricanteResponseRest;
import org.springframework.http.ResponseEntity;

public interface IFabricanteService {
    //Mostrando el listado de Fabricantes
    public ResponseEntity<FabricanteResponseRest> buscarFabricante();
    //Buscando Fabricante especifico
    public ResponseEntity<FabricanteResponseRest> buscarFabricanteId(Long id);
    //creando Fabricante
    public ResponseEntity<FabricanteResponseRest> creandoFabricante(Fabricante fabricante);
    //actualizar datos de Fabricante
    public ResponseEntity<FabricanteResponseRest> actualizarFabricante(Long id, Fabricante fabricante);
    //Eliminar Fabricante
    public ResponseEntity<FabricanteResponseRest> eliminarFabricante(Long id);

}
