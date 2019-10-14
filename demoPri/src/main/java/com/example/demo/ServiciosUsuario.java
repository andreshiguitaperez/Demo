package com.example.demo;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosUsuario {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiciosUsuario.class);

    private RepositorioUsuario repositorioUsuario;

    private ModelMapper modelMapper;

    public  ServiciosUsuario(RepositorioUsuario repositorioUsuario, ModelMapper model){

        this.repositorioUsuario = repositorioUsuario;
        this.modelMapper = model;

    }


    public UsuarioDto crear(UsuarioDto usuarioACrearDto){
        LOGGER.debug("Comenzar a Crear: usuarioACrearDto={}", usuarioACrearDto);

        Usuario usuarioACrear = modelMapper.map(usuarioACrearDto, Usuario.class);
        Usuario resultado = repositorioUsuario.save(usuarioACrear);
        UsuarioDto dtoResultado = modelMapper.map(resultado, UsuarioDto.class);

        return dtoResultado;
    }

}
