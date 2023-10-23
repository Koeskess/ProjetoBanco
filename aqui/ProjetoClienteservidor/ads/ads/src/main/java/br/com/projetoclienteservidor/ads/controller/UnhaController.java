package br.com.projetoclienteservidor.ads.controller;

import br.com.projetoclienteservidor.ads.entity.Unha;
import br.com.projetoclienteservidor.ads.service.UnhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/unha")
public class UnhaController {
    @Autowired //aqui é a injestão de dependência. - sempre fica dentro da classe pra poder passar a injestão de dependencia.
    UnhaService unhaService;
    @PostMapping //aqui faz a requisição post (está salvando) - enviando dados
    public Unha salvar(@RequestBody Unha unha){
        return unhaService.salvar(unha); //quando eu executo o "salvar", ele pega o que está no parâmetro o objeto da entidade (unha).
    }

}
