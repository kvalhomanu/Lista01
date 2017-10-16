import java.util.Scanner;

class Questao01{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 					
		float km = 3.6F;							//Variavel que armazena o valor de conversao para kmh

		System.out.println("Informe a velocidade em m/s: ");
		float velocidade_ms = sc.nextInt();

		float velocidade_km = velocidade_ms * km;
		
		System.out.println("A velocidade em km/h é: " + velocidade_km);
	}
}