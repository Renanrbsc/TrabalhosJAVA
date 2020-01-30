package teste;

import java.util.Scanner;

public class calc {
	
	public static void main (String args[]){
		double x,y,result;
		String z;
		
		for(int i = 1;i>0;i++) {
			Scanner inn = new Scanner(System.in);

			System.out.println("Digite o primeiro valor");
			x = inn.nextDouble();

			System.out.println("Digite uma opera��o logica:");
			System.out.println(" / , * , + , - ");
			z = inn.next();
							
			System.out.println("Digite o segundo valor");
			y = inn.nextDouble();
			
			if ("/".equals(z)){
				result = x / y;
			}
			
			else if ("*".equals(z)){
				result = x * y;
			}
			
			else if ("+".equals(z)){
				result = x + y;
			}
			
			else if ("-".equals(z)){
				result = x - y;
			}
			
			else{
				result = 0;
				System.out.println("Esta operacao nao existe!");
			}
			
			System.out.printf("O Resultado �: %.5f",result);
			System.out.println("");
			System.out.println("");

		}

	}
		
}

