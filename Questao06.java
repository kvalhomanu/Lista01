import java.util.Scanner;

class Questao06{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float diaria,taxa = 60.0F;
		double valor;
		String nome;
		
		System.out.println("Informe seu nome: ");
		nome = sc.next();				 
		
		System.out.println("Informe a quantidade de diarias desejadas: ");
		diaria = sc.nextFloat();
		
		if(diaria < 15){
			valor = (taxa + 8) * diaria;
			System.out.println("cliente: " + nome + "\n valor:" + valor + " R$");
			}
		else if(diaria == 15){
			valor = (taxa + 6) * diaria;
			System.out.println("cliente: " + nome + "\n valor:" + valor + " R$");
			}
		else{
			valor = (taxa + 5.5) * diaria;
			System.out.println("cliente: " + nome + "\n valor:" + valor + " R$");
			}
	}
}