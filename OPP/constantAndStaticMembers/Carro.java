package OPP.constantAndStaticMembers;

public class Carro {

	private String modelo;
	private String cor;
	private int ano;
	private Marca marca;
	private String chassi;
	private Proprietario proprietario;
	private int velMax;
	private int velAtual;
	private int nrPortas;
	private boolean tetoSolar;
	private int nrMarchas;
	private int marchaAtual;
	private boolean cambioAutomatico;
	private int volumeCombustivel;
	private float autonomia;
	
	
	
	
	public Carro(String modelo, String cor, int ano, Marca marca, String chassi, Proprietario proprietario, int velMax,
                 int velAtual, int nrPortas, boolean tetoSolar, int nrMarchas, int marchaAtual, boolean cambioAutomatico,
                 int volumeCombustivel) {

		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.marca = marca;
		this.chassi = chassi;
		this.proprietario = proprietario;
		this.velMax = velMax;
		this.velAtual = velAtual;
		this.nrPortas = nrPortas;
		this.tetoSolar = tetoSolar;
		this.nrMarchas = nrMarchas;
		this.marchaAtual = marchaAtual;
		this.cambioAutomatico = cambioAutomatico;
		this.volumeCombustivel = volumeCombustivel;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public int getVelMax() {
		return velMax;
	}

	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}

	public int getVelAtual() {
		return velAtual;
	}

	public void setVelAtual(int velAtual) {
		this.velAtual = velAtual;
	}

	public int getNrPortas() {
		return nrPortas;
	}

	public void setNrPortas(int nrPortas) {
		this.nrPortas = nrPortas;
	}

	public boolean isTetoSolar() {
		return tetoSolar;
	}

	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}

	public int getNrMarchas() {
		return nrMarchas;
	}

	public void setNrMarchas(int nrMarchas) {
		this.nrMarchas = nrMarchas;
	}

	public int getMarchaAtual() {
		return marchaAtual;
	}

	public void setMarchaAtual(int marchaAtual) {
		this.marchaAtual = marchaAtual;
	}

	public boolean isCambioAutomatico() {
		return cambioAutomatico;
	}

	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}

	public int getVolumeCombustivel() {
		return volumeCombustivel;
	}

	public void setVolumeCombustivel(int volumeCombustivel) {
		this.volumeCombustivel = volumeCombustivel;
	}

	public float getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(float autonomia) {
		this.autonomia = autonomia;
	}

	public void acelera(){
		velAtual += 1;
	}
	
	public void freia() {
		velAtual = 0;
	}
	
	public void trocaMarcha() {
		marchaAtual += 1;
	}
	
	public void reduzMarcha() {
		marchaAtual -= 1;
	}
	
	public void marchaRe() {
		if(velAtual > 0) {
			System.out.println("A marcha R� n�o pode ser engatada.");
		}
	}
	
	
	public void autonomia(float consumoMedio) {
			
		this.autonomia = this.volumeCombustivel * consumoMedio;
		
		System.out.println("A autonomia do carro � de: " + this.autonomia + "km/l");
	}
}
