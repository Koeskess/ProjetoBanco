package br.com.projetoclienteservidor.ads.repository;

import br.com.projetoclienteservidor.ads.entity.Unha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnhaRepository extends JpaRepository <Unha, Integer> {
}
