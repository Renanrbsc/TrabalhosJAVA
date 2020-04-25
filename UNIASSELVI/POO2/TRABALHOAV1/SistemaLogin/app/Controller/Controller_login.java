package SistemaLogin.app.Controller;

import SistemaLogin.app.Views.Menu;
import SistemaLogin.app.Model.Academico;
import SistemaLogin.app.Model.Colaborador;
import SistemaLogin.app.Model.Comunidade;
import SistemaLogin.app.Model.Empresa;

public class Controller_login {
	private int opcao;
	private Academico academico;
	private Colaborador colaborador;
	private Comunidade comunidade;
	private Empresa empresa;
	private Menu menu;

	public Controller_login() {
		this.academico = new Academico();
		this.colaborador = new Colaborador();
		this.comunidade = new Comunidade();
		this.empresa = new Empresa();
		this.menu = new Menu();

	}
	
	public void InserirDados() {
		/* Dados que a partir de uma funcionalidade de cadastro, são gravados em Banco de dados*/
		/* Setters que podem ser utilizados por uma aplicação de CRUD*/
		
		this.academico.setNome("Renan");
		this.academico.setCpf("0987654321");
		this.academico.setRegistroInstituicao("5863211");
		this.academico.setSenha("12345");
		this.academico.setIdade(21);
		this.academico.setNaturalidade("Brasileiro");
		this.academico.setVinculoInstituicao(true);
		
	    this.colaborador.setNome("Amarildo");
	    this.colaborador.setCpf("1452369875");
	    this.colaborador.setIdade(35);
	    this.colaborador.setNaturalidade("Mexicano");
	    this.colaborador.setRegistroInstituicao("AHE45679");
	    this.colaborador.setSenha("12345");
	    this.colaborador.setVinculoInstituicao(true);
	    
	    this.comunidade.setNome("Lucas Almeida Junior");
	    this.comunidade.setCpf("5236982741");
	    this.comunidade.setIdade(22);
	    this.comunidade.setNaturalidade("Brasileiro");
	    this.comunidade.setRegistroInstituicao("LucasAlm");
	    this.comunidade.setSenha("12345");
	    this.comunidade.setVinculoAluno("Pai do aluno George");
	    this.comunidade.setVinculoInstituicao(false);
	    
	    this.empresa.setRazaoSocial("CDUNI - Cursos a distancia é na Uniasselvi");
	    this.empresa.setCnpj("145236987456321");
	    this.empresa.setVinculoInstituicao(true);
	    this.empresa.setSenha("12345");
	    this.empresa.setRegistroInstituicao("4536-KLS");	   
	    
	}
	
	public void DadosTesteAplicacao() {
		
		System.out.println("-----------Dados TESTE para funcionamento do login ------------ ");

	    System.out.println("--------Academico-------- ");
	    System.out.println("Login: " + this.academico.getRegistroInstituicao());
	    System.out.println("Senha: " + this.academico.getSenha());
	    
	    System.out.println("--------Colaborador-------- ");
	    System.out.println("Login: " + this.colaborador.getRegistroInstituicao());
	    System.out.println("Senha: " + this.colaborador.getSenha());
	    System.out.println("CPF: " + this.colaborador.getCpf());
	    
	    System.out.println("--------Comunidade-------- ");
	    System.out.println("Login: " + this.comunidade.getRegistroInstituicao());
	    System.out.println("Senha: " + this.comunidade.getSenha());
	    System.out.println("CPF: " + this.comunidade.getCpf());	 
	    
	    System.out.println("--------Empresa-------- ");
	    System.out.println("Login: " + this.empresa.getRegistroInstituicao());
	    System.out.println("Senha: " + this.empresa.getSenha());
	    System.out.println("CPF: " + this.empresa.getCnpj());

	    System.out.println("---------------------------------------------------------------\n ");

	}
	
	public boolean MenuLogin(int opcao) {
		
		if (opcao == 1) {
			return this.academico.LoginAcademico();}
		else if (opcao == 2) {
			return this.colaborador.LoginColaborador();}
		else if (opcao == 3) {
			return this.comunidade.LoginComunidade();}
		else if (opcao == 4) {
			return this.empresa.LoginEmpresa();}
		else {
			return false;
			}
	}

	public String DadosCadastrados() {

		System.out.println(this.menu.Indice());
		opcao = this.menu.Opcao();	
		
		if (this.MenuLogin(opcao)) {
			if (opcao == 1) {
				return this.academico.toString();}
			else if (opcao == 2) {
				return this.colaborador.toString();}
			else if (opcao == 3) {
				return this.comunidade.toString();}
			else if (opcao == 4) {
				return this.empresa.toString();}
		}else {
			return "Login incorreto, tente novamente!";
			}
		return "\n";
		}
		
}





