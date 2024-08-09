package OPP.referencesConstructors;

public class Carros {

	//Atributos
	private String tipo;
	private String cor;
	private String modelo;
	private int qtdPortas;
	private boolean tracao4x4;
	private boolean bancoDeCouro;
	private boolean arCondicionado;
	
	//Construtores - Casual
	public Carros(String tipo, String cor, String modelo, int qtdPortas) {
		this.tipo = tipo;
		this.cor = cor;
		this.modelo = modelo;
		this.qtdPortas = qtdPortas;
	}
	
	//Construtor2 - Esporte
	public Carros(String tipo, String cor, String modelo, int qtdPortas, boolean tracao4x4) {
		this.tipo = tipo;
		this.cor = cor;
		this.modelo = modelo;
		this.qtdPortas = qtdPortas;
		this.tracao4x4 = tracao4x4;
	}
		
	//Construtor2 - Luxo
	public Carros(String tipo, String cor, String modelo, int qtdPortas, boolean tracao4x4, boolean bancoDeCouro, boolean arCondicionado) {
		this.tipo = tipo;
		this.cor = cor;
		this.modelo = modelo;
		this.qtdPortas = qtdPortas;
		this.tracao4x4 = tracao4x4;
		this.bancoDeCouro = bancoDeCouro;
		this.arCondicionado = arCondicionado;
	}
	
	//M�todos
	public void imprimir() {
		System.out.println("\n");
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Carro: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Quantidade de portas: " + this.qtdPortas);
		System.out.println("Tra��o nas 4 rodas: " + this.tracao4x4);
		System.out.println("Banco de couro: " + this.bancoDeCouro);
		System.out.println("Ar condicionado: " + this.arCondicionado);
	}
}