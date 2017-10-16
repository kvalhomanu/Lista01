import java.util.Scanner;

class Questao07{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int nota;                           	  		  //inicializacao da variavel que ira armazenar a nota
		
		System.out.println("Informe a nota do aluno: ");
		nota = sc.nextInt();				  	  //recebe a nota do aluno da entrada padrao e armazena em nota
		
		if( (0 < nota) && (nota <= 49) ){						  //condicao para a aprovacao do aluno
			System.out.println("O aluno obteve conceito 'Insuficiente'");
			}
		else if( (50 <= nota) && (nota <= 64) ){			  //condicao para a realizacao da final pelo aluno
			System.out.println("O aluno obteve conceito 'Regular'");
			}
		else if( (65 <= nota) && (nota <= 84) ){							  //condicao para reprovacao do aluno
			System.out.println("O aluno obteve conceito 'Bom'");
			}
		else{
			System.out.println("O aluno obteve conceito 'Otimo'");
			}
	}
}