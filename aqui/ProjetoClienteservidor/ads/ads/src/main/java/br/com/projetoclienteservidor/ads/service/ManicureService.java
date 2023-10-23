package br.com.projetoclienteservidor.ads.service;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ManicureService {

    public String rotaFinalId(@PathVariable("nome") String nome) {
        if (nome.equals("verao")) {
            return "Tela3";
        } else {
            return "Unhas de verão não encontradas!";
        }
    }
}
