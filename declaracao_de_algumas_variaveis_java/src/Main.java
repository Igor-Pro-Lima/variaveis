import java.util.Locale;
//Biblioteca para usar o locale.

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        //Comando para garatir que a separação das casas decimais seja o ponto.		
		
		int idade;
		double salario, altura;
		char genero;
		String nome;
		
		idade = 30;
		salario = 5616.6;
		altura = 1.75;
		genero = 'M';
		nome = "Igor Lima";
		
		System.out.println("IDADE = " + idade);
		System.out.println("SALARIO " + String.format("%.2f", salario));
		System.out.println("ALTURA = " + String.format("%.2f", altura));
		System.out.println("GENERO = " + genero);
		System.out.println("NOME = " + nome);

	}

}
