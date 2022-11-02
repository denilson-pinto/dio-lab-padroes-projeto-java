package one.digitalinnovation.gof.strategy;

public class ISS implements Imposto{
	
	private double valor;

	public ISS(double valor) {
		this.valor = valor;
	}
	
	@Override
	public double calcular() {
		return this.valor * 0.50;
	}

}
