package com.opensanca.trilharest.filmes.filmes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.opensanca.trilharest.filmes.comum.Pagina;
import com.opensanca.trilharest.filmes.comum.ParametrosDePaginacao;

@RestController
@RequestMapping("/filmes")
public class FilmesAPI{
	
	@Autowired
	private FilmesRepository filmesRepository;
	
	@RequestMapping(path="/em-exibicao", method=RequestMethod.GET)
	public Pagina<Filme> getEmExibicao(ParametrosDePaginacao parametrosDePaginacao ){
		return this.filmesRepository.buscarPaginaEmExibicao(parametrosDePaginacao);
	}

}
