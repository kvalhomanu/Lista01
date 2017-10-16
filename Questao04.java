import java.util.Scanner;

class Questao04{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float p1, p2, p3, p4;                             	  //inicializacao das variaveis que irao armazenar as notas
		
		System.out.println("Informe a primeira nota: ");
		p1 = sc.nextInt();				  	  //recebe a nota da primeira avaliacao da entrada padrao e armazena em p1
		System.out.println("Informe a segunda nota: ");
		p2 = sc.nextInt();				  	  //recebe a nota da segunda avaliacao da entrada padrao e armazena em p2
		System.out.println("Informe a terceira nota: ");
		p3 = sc.nextInt();				   	  //recebe a nota da terceira avaliacao da entrada padrao e armazena em p3
		System.out.println("Informe a quarta nota: ");
		p4 = sc.nextInt();				  	  //recebe a nota da quarta avaliacao da entrada padrao e armazena em p4
		
		float media = (p1 + p2 + p3 + p4)/4; 		  	  //variavel que realiza e armazena o calculo de media
		
		if(media >= 7){						  //condicao para a aprovacao do aluno
			System.out.println("O aluno foi aprovado");
			}
		else if( (5 <= media) && (media < 7) ){			  //condicao para a realizacao da final pelo aluno
			System.out.println("O aluno ira para a final");
			}
		else{							  //condicao para reprovacao do aluno
			System.out.println("O aluno foi reprovado");
			}
	}
}