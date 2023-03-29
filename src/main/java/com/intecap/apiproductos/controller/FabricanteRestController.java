package com.intecap.apiproductos.controller;

import com.intecap.apiproductos.model.Fabricante;
import com.intecap.apiproductos.response.FabricanteResponseRest;
import com.intecap.apiproductos.service.IFabricanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "4000")
public class FabricanteRestController {
    @Autowired
    private IFabricanteService fabricanteService;
//Mostrando Listado de Fabricante
    @GetMapping("/fabricante")
    public ResponseEntity<FabricanteResponseRest> buscarFabricante() {
        return fabricanteService.buscarFabricante();
    }
//Buscando Fabricante por Id
    @GetMapping("/fabricante/{id}")
    public ResponseEntity<FabricanteResponseRest> buscarFabricanteId(@PathVariable Long id) {
        return fabricanteService.buscarFabricanteId(id);
    }
//Creando Fabricante
    @PostMapping("/fabricante")
    public ResponseEntity<FabricanteResponseRest> creandoFabricante(@RequestBody Fabricante request) {
        return fabricanteService.creandoFabricante(request);
    }
//Actualizando Fabricante
    @PutMapping("/fabricante/{id}")
    public ResponseEntity<FabricanteResponseRest> actualizarFabricante(@PathVariable Long id, @RequestBody Fabricante request) {
        return fabricanteService.actualizarFabricante(id, request);
    }

    @DeleteMapping("/fabricante/{id}")
    public ResponseEntity<FabricanteResponseRest> eliminarFabricante(@PathVariable Long id){
        return fabricanteService.eliminarFabricante(id);
    }

}
