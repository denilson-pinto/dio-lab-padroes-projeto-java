package one.digitalinnovation.gof.strategy;

public class Teste {

	public static void main(String[] args) {
		CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
		ICMS icms = new ICMS(100.0);
		IPI ipi = new IPI(100.0);
		ISS iss = new ISS(100.0);
		
		System.out.println("Valor cobrado de ICMS: R$ " + calculadora.calcular(icms));
		System.out.println("Valor cobrado de IPI:  R$ " + calculadora.calcular(ipi));
		System.out.println("Valor cobrado de ISS:  R$ " + calculadora.calcular(iss));
	}
	
}
