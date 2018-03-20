package com.s2it.avaliacao.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class Questao8ServiceTest {

	@Autowired
	private Questao8Service questao8Service;
	
	@Test
	public void testSomarValorDosNos() {
		
		int soma = questao8Service.calcularQuestao8(111, 222);
		assertEquals(soma, 121212);
		
		int soma2 = questao8Service.calcularQuestao8(11101, 222);
		assertEquals(soma2, -1);
		
		int soma3 = questao8Service.calcularQuestao8(1235, 88);
		assertEquals(soma3, 182835);
	}
	
}
