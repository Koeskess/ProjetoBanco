package br.com.projetoclienteservidor.ads.controller;

import br.com.projetoclienteservidor.ads.service.ManicureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller // Aqui são as rotas. Tudo com @ é anotação (bean).

public class ManicureController {
    @Autowired
    ManicureService manicureService; //@Autowired - gestão de dependencias - chamando algo que está em
    // outro classe (ela traz tudo o que está armazenado na padrão (variavel), que está na config controller)

    @Autowired
    private String padrao;
    @Autowired
    private String apresentacao;


    @GetMapping
    public String rotaPadrao() {
        return padrao;
    }

    @GetMapping("/apresentacao")
    public String rotaApresentacao() {
        return apresentacao;

    }

    @GetMapping("/apresentacao/{nome}")
    public String rotaUnhaId(@PathVariable("nome") String nome) {
        return manicureService.rotaFinalId(nome);
    }
}
