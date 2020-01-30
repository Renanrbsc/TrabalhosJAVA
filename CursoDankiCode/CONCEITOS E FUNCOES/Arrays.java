package CursoDankiCode;

public class Arrays {
	
	public static void main (String[]args) {
		
	/* Criar varias variaves utiliza muita memoria
	 * no processo do Programa*/
		
	/*  String nome1 = "Renan";
		String nome2 = "Bruno";
		String nome3 = "Leticia"; */
		
		/* Arrays */
		
		/* Cria grupos de caracteres em apenas uma variavel */
		
		/* Array Normal */
		
		String[] nome = new String[5];
				nome[0] = "Renan";
				nome[1] = "Bruno";
				nome[2] = "Leticia";
				nome[3] = "Iracy";
				nome[4] = "Giiulia";
				
				System.out.println("O Nome é: "+nome[4]);
				System.out.println("O Nome é: "+nome[2]);
				System.out.println("O Nome é: "+nome[0]);
				
		/* Arrays MultiDimensional */
		/* Um Arrays que pode conter varias chaves [] */
				
		String[][] var1 = new String[5][5];
				var1[0][0] = "Felipe";
				System.out.println(var1[0][0]);
				
		String [][][][][] var2 = new String [3][3][3][3][3];
				var2[1][1][1][1][1] = "Raul";
				System.out.println(var2[1][1][1][1][1]);
						
		}

}
