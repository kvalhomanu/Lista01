import java.util.Scanner;

class Questao10{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		int numero,resultado = 10;
		
		System.out.println("Informe o numero a ser dividido:");
		numero = sc.nextInt();
		
		for(i=0;resultado>1;i++){       // N�o funciona
			resultado = numero/2;
		}
	
		System.out.println("Numero: " + numero + "\n N� Divisoes realizadas: " + i + "\n Ultimo resultado: " + resultado);
	}
}