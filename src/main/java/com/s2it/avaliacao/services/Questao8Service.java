package com.s2it.avaliacao.services;

import org.springframework.stereotype.Service;

@Service
public class Questao8Service {

	public int calcularQuestao8(int numeroAParam, int numeroBParam) {

		String numeroA = Integer.toString(numeroAParam);
		String numeroB = Integer.toString(numeroBParam);

		int maiorNumero;
		if (numeroA.length() > numeroB.length())
			maiorNumero = numeroA.length();
		else
			maiorNumero = numeroB.length();

		StringBuffer numeroC = new StringBuffer();
		for (int i = 0; i < maiorNumero; i++) {
			if (i < numeroA.length())
				numeroC.append(numeroA.charAt(i));

			if (i < numeroB.length())
				numeroC.append(numeroB.charAt(i));
		}

		if (numeroC.toString().length() > 6)
			numeroC = new StringBuffer("-1");

		return new Integer(numeroC.toString());
	}

}
