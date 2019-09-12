package br.edu.unisep.app;

import java.util.Scanner;

import br.edu.unisep.eletro.Eletro;

public class EletroApp {
	
	private Scanner sc = new Scanner(System.in);
	private Eletro el = new Eletro();
	
	public void obterDados() {
		System.out.println("Informe o tempo a maquina ficou ligada(em horas): ");
		var tempo = sc.nextDouble();
		System.out.println("Informe a potencia da maquina: ");
		var potencia = sc.nextDouble();
		
		System.out.printf("Serão gastos: R$ %.2f", el.calcularValorConsumo(tempo, potencia));
	}

}
