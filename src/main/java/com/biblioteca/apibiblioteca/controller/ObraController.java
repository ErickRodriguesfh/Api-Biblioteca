package com.biblioteca.apibiblioteca.controller;
import com.biblioteca.apibiblioteca.dto.ObrasDTO;
import com.biblioteca.apibiblioteca.entities.Obras;
import com.biblioteca.apibiblioteca.service.ObrasService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/obras")
public class ObraController {

    @Autowired
    private ObrasService obrasService;


    @PostMapping
    public ResponseEntity<ObrasDTO> inserirObra(@RequestBody ObrasDTO obrasDTO){
        ObrasDTO obj = obrasService.insertObras(obrasDTO);
        return new ResponseEntity<>(obj, HttpStatus.CREATED);


    }

    @GetMapping
    public ResponseEntity<List<Obras>> listarObras(){
        return ResponseEntity.ok().body(obrasService.findAll());
    }

    @PutMapping("{id}")
    public ResponseEntity<Obras> atualizaObra(@PathVariable Long id,@RequestBody Obras obras ){
        Obras obj = obrasService.findById(id);
        BeanUtils.copyProperties(obras, obj, "id");
        return ResponseEntity.ok().body(obrasService.updateObra(obj));
    }

    @DeleteMapping("{id}")
    public void deletaObra(@PathVariable Long id){
        Obras obras= obrasService.findById(id);
        obrasService.delete(obras);

    }


}
