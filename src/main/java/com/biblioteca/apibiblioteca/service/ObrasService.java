package com.biblioteca.apibiblioteca.service;

import com.biblioteca.apibiblioteca.dto.ObrasDTO;
import com.biblioteca.apibiblioteca.entities.Obras;
import com.biblioteca.apibiblioteca.repository.ObrasRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ObrasService {

    @Autowired
    private ObrasRepository obrasRepository;

    //Inserindo uma obra
    public ObrasDTO insertObras(ObrasDTO obrasDTO){
        Obras obra = new Obras();
        BeanUtils.copyProperties(obrasDTO, obra);
       obrasRepository.save(obra);
       return new ObrasDTO(obra);

    }

    //Listando todas as obras
    public List<Obras> findAll(){
    List<Obras> list = obrasRepository.findAll();
    return list;
    }

    //Atualizando uma obra
    public Obras updateObra(Obras obra){
       return obrasRepository.save(obra);
    }

    //deletando uma obra
    public void delete (Obras obras){
        obrasRepository.delete(obras);
    }

    //buscando uma obra pelo id
    public Obras findById(Long id){
      return  obrasRepository.findById(id).get();
    }



}
