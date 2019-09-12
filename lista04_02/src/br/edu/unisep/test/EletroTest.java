package br.edu.unisep.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.unisep.eletro.Eletro;

class EletroTest {

	@Test
	public void calculoConsumoTest() {
		var  e = new Eletro(300);
		assertEquals(0.90, e.calcularValorConsumo(4, 300),0.01);
	}

}
