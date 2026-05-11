package atividade;

public class Main {
	public static void main(String[] args) {
		
		// Corrida normal
		Corrida corrida01 = new Corrida(10.0, "João", 20);
		
		// Corrida premium
		CorridaPremium corrida02 = new CorridaPremium(20.0, "Maria", 30, 2.0);
		
		//metodo comum
		corrida01.mostrarInformacoes();
		
		// sobrecarga
		corrida01.mostrarInformacoes("corrida");
		
		// sobrescrita
		corrida02.mostrarInformacoes();
		
		// método estático
		Corrida.mostrarQtdeCorridas();
	}
}
