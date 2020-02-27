package br.com.microservice.fornecedor.processor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.microservice.fornecedor.entity.InfoFornecedor;
import br.com.microservice.fornecedor.repository.InfoFornecedorRepository;

@Component
public class InfoFornecedorProcessor {

	@Autowired
	private InfoFornecedorRepository infoFornecedorRepository;
	
	public List<InfoFornecedor> buscarFornecedorPorEstado(String estado) {
		return infoFornecedorRepository.findByEstado(estado);
	}
}