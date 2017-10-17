import java.util.Scanner;

class Questao11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int quantidade,codigo = 100;
		double valor = 0;
		System.out.println("Codigo --------- Produto --------- valor \n 10        Pastel de carne          1,50 \n 11        Coxinha de frango        1,80 \n 12        Empada de frango         1,90 \n 20        Hamburguer               10,00 \n 30        Pizza                    8,00 \n 50        Suco                     2,50 ");	

		while(codigo != 0){
			System.out.println("Informe o codigo: ");
			codigo = sc.nextInt();
			if(codigo != 0){	
				System.out.println("Informe a quantidade: ");
				quantidade = sc.nextInt();			

				switch (codigo) {
					case 10:
						valor = valor + (quantidade * 1.50);
						System.out.println(" valor parcial:" + valor + "R$");
						break;
					case 11:
						valor = valor + (quantidade * 1.80);
						System.out.println(" valor parcial:" + valor + "R$");
						break;
					case 12:
						valor = valor + (quantidade * 1.90);
						System.out.println(" valor parcial:" + valor + "R$");
						break;
					case 20:
						valor = valor + (quantidade * 10.00);
						System.out.println(" valor parcial:" + valor + "R$");
						break;
					case 30:
						valor = valor + (quantidade * 8.00);
						System.out.println(" valor parcial:" + valor + "R$");
						break;
					case 50:
						valor = valor + (quantidade * 2.50);
						System.out.println(" valor parcial:" + valor + "R$");
						break;
					default:
						System.out.println("\n ------ Codigo Invalido ------ \n");
						break;
				}
				System.out.println("\n Para encerrar digite o codigo '0' \n ");
			}
		}
		if(valor>50.00){
			valor = valor*0.05;
			System.out.println(" valor total:" + valor + "R$");
		}
		else{
			System.out.println(" valor total:" + valor + "R$");
		}
	}
}
