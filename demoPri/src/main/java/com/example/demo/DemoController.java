package com.example.demo;

import org.jetbrains.annotations.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RestController
@Validated
public class DemoController {


    private ServiciosUsuario serviciosUsuario;

    public DemoController(ServiciosUsuario serviciosUsuario){this.serviciosUsuario = serviciosUsuario;}

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/redireccionar")
    public String login(){return "formaRegistro";}

    @PostMapping("/registrar")
    public ResponseEntity<UsuarioDto> crear(@RequestBody @Valid UsuarioDto usuarioDto){
        UsuarioDto usuarioCreado = serviciosUsuario.crear(usuarioDto);
        return new ResponseEntity<UsuarioDto>(usuarioCreado, null, HttpStatus.CREATED);
    }

}
