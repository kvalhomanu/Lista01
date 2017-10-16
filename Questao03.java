import java.util.Scanner;

class Questao03{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float p1, p2, p3;
		float peso1 = 0.2F, peso2 = 0.3F, peso3 = 0.5F;
		
		System.out.println("Informe a primeira nota: ");
		p1 = sc.nextInt();
		System.out.println("Informe a segunda nota: ");
		p2 = sc.nextInt();
		System.out.println("Informe a terceira nota: ");
		p3 = sc.nextInt();
		
		float media = (p1*peso1)+(p2*peso2)+(p3*peso3);
		
		System.out.println("A média do aluno é: " + media);
	}
}