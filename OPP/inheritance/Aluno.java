package OPP.inheritance;

public class Aluno {

	private int ra;
	private String nome;
	private boolean matriculado;
	
	public Aluno(int ra, String nome, boolean matriculado) {
		this.ra = ra;
		this.nome = nome;
		this.matriculado = matriculado;
	}
	
	public void imprimir() {
		System.out.println("\n");
		System.out.println("Nome = " + this.nome);
		System.out.println("RA = " + this.ra);
		System.out.println("Est� matriculado? = " + this.matriculado);
	}
}