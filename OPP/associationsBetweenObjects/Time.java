package OPP.associationsBetweenObjects;

public class Time {

	private String nome;
	private String cores;
	private Estadio estadio;
	private Jogador jogador;
	private Tecnico tecnico;
	private Presidente presidente;
	
	public Time(String nome, String cores, Estadio estadio, Jogador jogador, Tecnico tecnico, Presidente presidente) {
		this.nome = nome;
		this.cores = cores;
		this.estadio = estadio;
		this.jogador = jogador;
		this.tecnico = tecnico;
		this.presidente = presidente;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCores() {
		return cores;
	}
	public void setCores(String cores) {
		this.cores = cores;
	}
	public Estadio getEstadio() {
		return estadio;
	}
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public Presidente getPresidente() {
		return presidente;
	}

	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}
	
	public void exibirTime(){
		System.out.println("Time: " + this.nome);
		System.out.println("Cores do time: " + this.cores);
		System.out.println("Est�dio: " + this.estadio.getNome());
		System.out.println("Jogador: " + this.jogador.getNome());
		System.out.println("T�cnico: " + this.tecnico.getNome());
		System.out.println("Presidente: " + this.presidente.getNome());
	}
}