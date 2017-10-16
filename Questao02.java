import java.util.Scanner;

class Questao02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ano_atual = 2017;

		System.out.println("Informe seu ano de nascimento: ");
		int ano_nascimento = sc.nextInt();
		
		int idade_atual = ano_atual - ano_nascimento;
		
		System.out.println("Sua idade atual é de: " + idade_atual);
	}
}