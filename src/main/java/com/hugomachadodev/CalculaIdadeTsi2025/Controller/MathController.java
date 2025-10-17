package com.hugomachadodev.CalculaIdadeTsi2025.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hugomachadodev.CalculaIdadeTsi2025.Services.MathService;

@RestController
public class MathController {

    @RequestMapping("/calculaidade")
    public String CalculoIdade(
        @RequestParam (value = "nome") String nome,
        @RequestParam(value = "sobrenome", required = false) String sobrenome,
        @RequestParam (value = "dataNascimento") String dataNascimento
    ){
        if(sobrenome != null && sobrenome != ""){
            nome += " " + sobrenome;
        }
        return MathService.calcularIdade(nome, dataNascimento);
    }
}
