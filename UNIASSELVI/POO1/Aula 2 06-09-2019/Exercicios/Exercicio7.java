package Exercicios;

import java.util.Scanner;

public class Exercicio7 {

	//LOCADORA DE VIDEOS - FATURAMENTO
	public static void main(String[]args) {
		
		
		int totalVids,locacao,alugadoMes,devolAtraso,vidPerdidos,paraReposicao,vidTotalAno;
		double totalVal,valorLoc,multaDevo,valMultMes,lucroAnual;
		int vidsPorLoc = 50;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o numero de locaçoes:");
		System.out.println("Cada locacao contem 50 Unidades!");
		locacao = scanner.nextInt();
		
		System.out.println("Digite o valor de uma locaçao: ");
		valorLoc = scanner.nextInt();
		
		totalVids = vidsPorLoc * locacao; // Unidade
		totalVal = valorLoc * locacao; // R$
		alugadoMes = totalVids / 3; // Unidade
		lucroAnual = alugadoMes * 12; // R$
		multaDevo = (valorLoc*2.5)/100; // R$
		devolAtraso = alugadoMes/10; // Unidade
		valMultMes = multaDevo * devolAtraso; // R$
		
		vidPerdidos = (totalVids*2)/100; // Unidade
		paraReposicao = (totalVids - vidPerdidos)/10; // Unidade
		vidTotalAno =  totalVids - vidPerdidos + paraReposicao; //Unidade
				
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("Quantidade de locaçoes no estabelecimento: "+locacao);
		System.out.println("Quantidade total de Videos na Locadora: "+totalVids);
		System.out.println("Valor Total de Locaçoes no Estabelecimento: "+totalVal);
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::Faturamento:::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("Aluguel Mensal: 1/3 dos Videos sao alugados por Mes ->"+alugadoMes);
		System.out.println("Lucro anual do estabelecimento com base Aluguel Mensal ->"+lucroAnual);
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("Valor padrâo referente a multa de atraso: "+multaDevo);
		System.out.println("Devoluções por atraso referente ao Mes: "+devolAtraso);
		System.out.println("Valor ganho sobre o percentual de Multa Atraso mensal: "+valMultMes);
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("Videos Perdidos durante o ano: "+vidPerdidos);
		System.out.println("Videos comprados para Reposicao Anual: "+paraReposicao);
		System.out.println("Total de Videos no Final do ano: "+vidTotalAno);
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");

		System.out.println(" ");

	}
}
