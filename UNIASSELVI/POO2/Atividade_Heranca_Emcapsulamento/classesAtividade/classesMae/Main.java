package classesMae;

public class Main {

	public static void main(String[]args){
		
		Imovel novo_imovel = new Imovel();
		novo_imovel.setCodigoImovel(58423676);
		novo_imovel.setNomeImovel("Balcão com bordas arredondas");
		novo_imovel.setLocalProducao("Constrular e cia");

		System.out.println(novo_imovel);
		
		Ferramenta novo_ferramenta = new Ferramenta();
		novo_ferramenta.setTipoDeFerramenta("Ferramenta de corte");
		novo_ferramenta.setNomeDaFerramenta("Serra de duas mãos");
		novo_ferramenta.setDurabilidadeDaFerramenta("80% de durabilidade");

		System.out.println(novo_ferramenta);

		Automovel novo_automovel = new Automovel();
		novo_automovel.setTipoDeAutomovel("Esportivo");
		novo_automovel.setPlacaDoAutomovel("AGR5467");
		novo_automovel.setFabricadoEm("Guaramirin, SC");

		System.out.println(novo_automovel);

		Roupa nova_roupa = new Roupa();
		nova_roupa.setCodigoDaRoupa(741258963);
		nova_roupa.setNomeDaRoupa("Vestido longo em cores dourado e azul");
		nova_roupa.setTipoDeTecido("100% algodão");

		System.out.println(nova_roupa);

		Mercadoria nova_mercadoria = new Mercadoria();
		nova_mercadoria.setCodigoMercadoria("a9526325874g1586");
		nova_mercadoria.setNomeMercadoria("Panela aço inox da panelux");
		nova_mercadoria.setLocalDeVenda("Atacarejo do Seu João");

		System.out.println(nova_mercadoria);

		Celular novo_celular = new Celular();
		novo_celular.setRegistroDoCelular("1425289rio632547121");
		novo_celular.setMarcaDoCelular("Asus Zenfone max 10");
		novo_celular.setGeracaoDoCelular("20 - 2020");

		System.out.println(novo_celular);





	}

}