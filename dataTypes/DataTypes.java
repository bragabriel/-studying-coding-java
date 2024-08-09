package dataTypes;

public class DataTypes {

	public static void main(String[] args) {
		
		//Criar duas vari�veis para cada tipo de Dado
		
		/* Valores Inteiros com Capacidades de Armazenamento diferentes: */
		byte b1 = 10;
		byte b2 = 20;
		
		short s1 = 20000;
		//short s2 = 40000;  <- Ultrapassa o limite do short
		
		//int i1 = -10000000000; <- Muito abaixo do valor inteiro negativo permitido
		int i2 = 28500;
		
		long l1 = 10000000000000000L;
		long l2 = 20040050005000500L;
		
		
		
		/* Valores Float com Capacidades de Armazenamento diferentes: */
		//float f1 = 4.5; <- necess�rio adicionar um (F ou f) para dizer que � um float,
		//						quando n�o colocamos nada, ele infere que � um double
		float f2 = 10.68f;
		
		double d1 = 85.69; //tem capacidade de armazenamento maior que o float
		double d2 = 99.04d; //podemos tamb�m explicitar que � um double, colocando 'd'
		
		
		/* Char (1 caracter; aspas simples) */
		char c1 = 'W';
		//char c2 = 'Tw'; <- 2 caracteres
		char c3 = '\u0057'; //<- c�digo unicode da letra W, funciona, ele vai ler a letra W
		
		
		/* Strings (mais de 1 caracter; aspas duplas)*/
		String st1 = "Fulano";
		//String st2 = 'Ciclano'; <- errado, aspas simples
		String st3 = "as ddde das lsdjakh DSAJKLH *&#�$% asldj 2189*(@";
		String st4 = "12/06/2022"; //existe o tipo correto para usar data, n�o � String
		//							pois n�o permite por exemplo, comparar qual data � maior ou menor

		
		/* Boolean (valores l�gicos) */
		boolean bo1 = true;
		boolean bo2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(s1);
		System.out.println(i2);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(c1);
		System.out.println(c3);
		System.out.println(st1);
		System.out.println(st3);
		System.out.println(st4);
		System.out.println(bo1);
		System.out.println(bo2);
	}
}