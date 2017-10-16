import java.util.Scanner;
import java.util.ArrayList;

class Questao08{
	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);	
		int soma = 0,maior = 0,menor = 100000;
		float media;

		ArrayList<Integer> valores = new ArrayList<Integer>(10);

    		for(int i = 1; i <= 10; i++){
			System.out.println("Informe o " + i + " valor: "); 
			valores.add(sc.nextInt());	
   		}

    		for(int j = 0; j < 10; j++){
			int atual = valores.get(j);
			soma = soma + atual;
			
			if(atual > maior){
				maior = atual;
			}
			if (atual < menor){
				menor = atual;
			} 
		}
	
		media = soma/10;	

		System.out.println("media: " + media);
		System.out.println("maior: " + maior);
		System.out.println("menor: " + menor);		
	}
}