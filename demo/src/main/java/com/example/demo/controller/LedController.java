package com.example.demo.controller;

import com.example.demo.conexao.ControlePorta;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/led")
public class LedController {

    private ControlePorta controle = new ControlePorta("COM4", 9600); // Altere COM3 se necessário

    @GetMapping("/ligar")
    public String ligar() {
        controle.enviaDados(1);
        return "LED ligado!";
    }

    @GetMapping("/desligar")
    public String desligar() {
        controle.enviaDados(2);
        return "LED desligado!";
    }

    @GetMapping("/fechar")
    public String fechar() {
        controle.close();
        return "Porta serial fechada!";
    }
}