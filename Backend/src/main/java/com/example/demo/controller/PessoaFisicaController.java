
package com.example.demo.controller;

import com.example.demo.model.PessoaFisica;
import com.example.demo.repository.PessoaFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa-fisica")
public class PessoaFisicaController {
    
    @Autowired
    private PessoaFisicaRepository pessoaFisicaRepository;

    // Cadastrar uma nova Pessoa Física
    @PostMapping("/cadastrar")
    public PessoaFisica cadastrarPessoaFisica(@RequestBody PessoaFisica pessoaFisica) {
        return pessoaFisicaRepository.save(pessoaFisica);
    }

    // Listar todas as Pessoas Físicas
    @GetMapping("/listar")
    public List<PessoaFisica> listarPessoasFisicas() {
        return pessoaFisicaRepository.findAll();
    }
}
