package com.s2it.avaliacao.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.s2it.avaliacao.models.BinaryTree;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class Questao9ServiceTest {

	@Autowired
	private Questao9Service questao9Service;
	
	@Test
	public void testSomarValorDosNos() {
		
		BinaryTree atual = new BinaryTree();
		atual.setValor(10);
		
			BinaryTree esquerda1 = new BinaryTree();
			esquerda1.setValor(10);
		
				BinaryTree esquerda2 = new BinaryTree();
				esquerda2.setValor(10);
				
				BinaryTree direita2 = new BinaryTree();
				direita2.setValor(10);
		
				esquerda1.setLeft(esquerda2);
				esquerda1.setRight(direita2);
		
		
			BinaryTree direita1 = new BinaryTree();
			direita1.setValor(10);
			
				BinaryTree esquerda3 = new BinaryTree();
				esquerda3.setValor(2);
					
					BinaryTree esquerda4 = new BinaryTree();
					esquerda4.setValor(1);
				
					esquerda3.setLeft(esquerda4);
				
				BinaryTree direita3 = new BinaryTree();
				direita3.setValor(2);
		
				direita1.setLeft(esquerda3);
				direita1.setRight(direita3);
		
		atual.setLeft(esquerda1);
		atual.setRight(direita1);
		
		int soma = questao9Service.somarValorDosNos(atual);
		
		assertEquals(soma, 55);
		
		int soma2 = questao9Service.somarValorDosNos(null);
		
		assertEquals(soma2, 0);
	}
	
}
