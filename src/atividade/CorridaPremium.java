package atividade;

public class CorridaPremium extends Corrida {
	
	// atributos
	protected double taxa;
	
	// construtor
	public CorridaPremium(double preco, String motorista, double distancia, double taxa) {
		super(preco, motorista, distancia);
		this.taxa = taxa;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	// sobrescrita
	@Override
	public void mostrarInformacoes() {
		System.out.println("CORRIDA PREMIUM");
		System.out.println("preço: " + preco);
		System.out.println("motorista: " + motorista);
		System.out.println("distancia: " + distancia);
		System.out.println("taxa adicional: " + taxa);
	}
}
