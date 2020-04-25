package SistemaLogin.app;

import SistemaLogin.app.Controller.Controller_login;

public class Bootstrap {

	public void Startup() {
		
		Controller_login login = new Controller_login();
		
		login.InserirDados();
		login.DadosTesteAplicacao();
		
		System.out.println(login.DadosCadastrados());
		
		}

}
