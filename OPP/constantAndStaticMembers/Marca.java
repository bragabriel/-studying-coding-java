package OPP.constantAndStaticMembers;

public class Marca {

	private String nome;
	private int nrDeModelos;
	private int anoDeLancamento;
	private int codigo;
	
	
	public Marca(String nome, int nrDeModelos, int anoDeLancamento, int codigo) {
		this.nome = nome;
		this.nrDeModelos = nrDeModelos;
		this.anoDeLancamento = anoDeLancamento;
		this.codigo = codigo;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNrDeModelos() {
		return nrDeModelos;
	}
	
	public void setNrDeModelos(int nrDeModelos) {
		this.nrDeModelos = nrDeModelos;
	}
	
	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}
	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
