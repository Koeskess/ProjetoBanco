package br.com.projetoclienteservidor.ads;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean(name = "padrao")
    public String rotaPadrao() {
        return "Tela1";
        //método rotapadrão, que retorna a tela 1
    }

    @Bean(name = "apresentacao")
    public String rotaApresentacao() {
        return "Tela2";
    }
}
