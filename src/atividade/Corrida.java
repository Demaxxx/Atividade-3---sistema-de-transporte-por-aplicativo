package atividade;

public class Corrida {
	
	// atributos
	protected double preco;
	protected String motorista;
	protected double distancia;
	protected static int qtdeCorridas = 0;
	
	
	// construtor

	public Corrida(double preco, String motorista, double distancia) {
		this.preco = preco;
		this.motorista = motorista;
		this.distancia = distancia;
		qtdeCorridas++;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		if (preco > 0){
			this.preco = preco;
		}
		else {
			System.out.println("preço inválido!");
		}
		
	}


	public String getMotorista() {
		return motorista;
	}


	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}


	public double getDistancia() {
		return distancia;
	}


	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}


	public static int getQtdeCorridas() {
		return qtdeCorridas;
	}


	public static void setQtdeCorridas(int qtdeCorridas) {
		Corrida.qtdeCorridas = qtdeCorridas;
	}
	
	// método estático
	public static void mostrarQtdeCorridas() {
		System.out.println("quantidade de corridas: " + qtdeCorridas);
	}
	
	// método comum
	public void mostrarInformacoes() {
		System.out.println("preço: " + preco);
		System.out.println("motorista: " + motorista);
		System.out.println("distancia: " + distancia);
	}
	
	// sobrecarga
	public void mostrarInformacoes(String mensagem) {

	    System.out.println(mensagem);

	    System.out.println("preço: " + preco);
	    System.out.println("motorista: " + motorista);
	    System.out.println("distancia: " + distancia);
	}
	
}


