package classesMae;

public class Imovel {
    int CodigoImovel;
	String NomeImovel;
	String LocalProducao;

	public Imovel(){
		this.CodigoImovel = 00;
	}
	
    public int getCodigoImovel(){
        return this.CodigoImovel;
    }
    public void setCodigoImovel(int CodigoImovel){
        this.CodigoImovel = CodigoImovel;
    }

	public String getNomeImovel(){
		return this.NomeImovel;
	}
    public void setNomeImovel(String NomeImovel){
        this.NomeImovel = NomeImovel;
    }

    public String getLocalProducao(){
        return this.LocalProducao;
    }
    public void setLocalProducao(String LocalProducao){
        this.LocalProducao = LocalProducao;
    }
    
    @Override
    public String toString() {
        return "Codigo do Imovel: " + this.CodigoImovel + "\n" +
               "Nome do Imovel: " + this.NomeImovel + "\n" +
               "Local de Produçâo: " + this.LocalProducao + "\n";
    }

}