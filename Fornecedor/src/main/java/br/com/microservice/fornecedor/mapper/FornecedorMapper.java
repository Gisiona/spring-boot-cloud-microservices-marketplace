package br.com.microservice.fornecedor.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.microservice.fornecedor.dto.InfoFornecedorDto;
import br.com.microservice.fornecedor.entity.Endereco;
import br.com.microservice.fornecedor.entity.InfoFornecedor;

@Component
public class FornecedorMapper {

	public List<InfoFornecedorDto> from(List<InfoFornecedor> fornecedores, Endereco endereco)
	{
		List<InfoFornecedorDto> dtos = new ArrayList<InfoFornecedorDto>();				
		for (InfoFornecedor info : fornecedores) {
			InfoFornecedorDto dto = new InfoFornecedorDto();
			dto.setIdFornecedor(String.valueOf(info.getIdFornecedor()));
			dto.setEmail(info.getEmail());
			dto.setPessoaContato(info.getPessoaContato());
			dto.setTelefone(info.getTelefone());
			dto.setIdEndereco(String.valueOf(info.getIdEndereco()));
			dto.setEndereco(endereco);
			dtos.add(dto);
		}
		return dtos;
	}

	public InfoFornecedorDto from(InfoFornecedor info, Endereco endereco) {
		InfoFornecedorDto dto = new InfoFornecedorDto();
		dto.setIdFornecedor(String.valueOf(info.getIdFornecedor()));
		dto.setEmail(info.getEmail());
		dto.setPessoaContato(info.getPessoaContato());
		dto.setTelefone(info.getTelefone());
		dto.setIdEndereco(String.valueOf(info.getIdEndereco()));
		dto.setEndereco(endereco);
		
		return dto;
	} 
}
