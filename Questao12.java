import java.util.Scanner;

class Questao12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numero,quadrado,cubo;
	
		System.out.println("Informe o numero: ");
		numero = sc.nextInt();

		quadrado = numero*numero;
		cubo = quadrado*numero;

		System.out.println("Numero: " + numero + "\n Quadrado: " + quadrado + "\n Cubo: " + cubo);
	}
}
