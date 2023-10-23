package br.com.projetoclienteservidor.ads.service;

import br.com.projetoclienteservidor.ads.entity.Unha;
import br.com.projetoclienteservidor.ads.repository.UnhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnhaService {
    @Autowired(required = false)
    UnhaRepository unhaRepository;
    public Unha salvar(Unha unha){
        if(unha.getModelo()==null || unha.getModelo().isBlank()){
            throw new RuntimeException("O modelo de unha deve ser preenchido");
        }else if(unha.getDescricao()==null || unha.getDescricao().isBlank()){
            throw new RuntimeException("A descrição deve ser preenchida");
        }
        return unhaRepository.save(unha);
    }
}
