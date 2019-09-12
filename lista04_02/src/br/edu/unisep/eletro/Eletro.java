package br.edu.unisep.eletro;

public class Eletro {
	
	private double potencia;
	
	public Eletro() {
		
	}

	public Eletro(double potencia) {
		this.potencia = potencia;
	}
	
	public double calcularValorConsumo(double tempo, double potencia) {
		return (potencia * tempo) / 1000 * 0.75;
	}

	public double getPotencia() {
		return potencia;
	}
	
}
