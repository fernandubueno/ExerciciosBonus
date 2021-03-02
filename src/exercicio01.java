import java.util.Scanner;
public class exercicio01 {

	public static void main(String[] args) {
		int ano, idade;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o seu ano de nascimento:");
		ano = leitor.nextInt();
		
		idade = 2021 - ano;
		
		System.out.println("A sua idade em 31 de dezembro de 2021 é de " + idade);
		
		leitor.close();

	}

}
