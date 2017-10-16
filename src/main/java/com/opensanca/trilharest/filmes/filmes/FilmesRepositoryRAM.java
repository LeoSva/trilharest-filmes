package com.opensanca.trilharest.filmes.filmes;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.opensanca.trilharest.filmes.comum.Pagina;
import com.opensanca.trilharest.filmes.comum.ParametrosDePaginacao;

@Repository
public class FilmesRepositoryRAM implements FilmesRepository{

	@Override
	public Pagina<Filme> buscarPaginaEmExibicao(ParametrosDePaginacao parametrosDePaginacao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Filme buscarPorId(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

}
