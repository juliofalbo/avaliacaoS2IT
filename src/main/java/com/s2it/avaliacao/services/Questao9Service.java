package com.s2it.avaliacao.services;

import org.springframework.stereotype.Service;

import com.s2it.avaliacao.models.BinaryTree;

@Service
public class Questao9Service {

	public int somarValorDosNos(BinaryTree atual) {
		int soma = atual.getValor();

		soma += atual.getLeft() != null ? somarValorDosNos(atual.getLeft()) : 0;
		soma += atual.getRight() != null ? somarValorDosNos(atual.getRight()) : 0;

		return soma;
	}
	
}
