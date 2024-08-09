package OPP.inheritance;

public class Main {

	public static void main(String[] args) {
		
		Aluno a = new Aluno(105080, "Jo�o", true);

		AlunoGrad ag = new AlunoGrad(110080, "Gabriel Braga", true, 10.0);
		
		AlunoPosGrad apg = new AlunoPosGrad(110080, "Joana", true, "Diego Negretto", "O papel da T.I no papel");
		
		a.imprimir();
		ag.imprimir();
		apg.imprimir();
	}

}
