package Exercicios;
import java.util.Scanner;
public class Exercicio2 {
	
	public static void main(String[] args){
		String nomeFuncionario;
		double salHr, hrTrab, salBruto, salLiquido;
		double diasTrab = 30 ;
		double inss = 200;
		
		Scanner entradaDados = new Scanner(System.in);
		
		System.out.println("Programa Folha Pagamento");
		System.out.println("Calculo do Salario Bruto e Liquido!");
		System.out.println("\nNome do Funcionario:");
		nomeFuncionario = entradaDados.next(); 
		
		System.out.println("Informe as horas trabalhadas; ");
		hrTrab = entradaDados.nextDouble();
		
		System.out.println("Informe o valor hora trabalhada; ");
		salHr = entradaDados.nextDouble();
		
		salBruto = (hrTrab * diasTrab * salHr);
		
		salLiquido = (salBruto - inss);
		
		System.out.println("\n\n:::Exibiçao dos dados informados::::");
		System.out.println("Funcionario: "+nomeFuncionario);
		System.out.println("Salario Bruto: R$ "+salBruto);
		System.out.println("\nSalario Liquido: R$ "+salLiquido);
		
	}

}


