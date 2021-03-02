import java.util.Scanner;
public class exercicio02 {

	public static void main(String[] args) {
		double horas;
		int minutos, segundos;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe quantos minutos tem o filme:");
		minutos = leitor.nextInt();
		
		horas = minutos / (double) 60;
		segundos = minutos * 60;
		
		System.out.println("Esse filme tem " + horas + " hora(s).");
		System.out.println("Esse filme tem " + segundos + " segundos.");
		
		leitor.close();

	}

}
