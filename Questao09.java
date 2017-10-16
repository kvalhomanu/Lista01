import java.util.Scanner;

class Questao09{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		int num1,num2,maior,menor,i,par = 0,impar = 0,soma;
		
		System.out.println("Informe o primeiro numero:");
		num1 = sc.nextInt();
		System.out.println("Informe o segundo numero:");
		num2 = sc.nextInt();

		if(num1>num2){
			maior = num1;
			menor = num2;
			}
		else{
			maior = num2;
			menor = num1;
			}
		
		for(i = menor+1; i<maior;i++){
			if((i % 2) == 0){ 	
				par++;
				}
			else{
				impar++;
				}		
			}
		soma = menor + maior;
		System.out.println("Pares: " + par + " \n Impares: " + impar + "\n Soma: "+ soma);	

	}	
}