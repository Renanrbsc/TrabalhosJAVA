package classesMae;

public class Mercadoria {
    String CodigoMercadoria;
	String NomeMercadoria;
	String LocalDeVenda;

	public Mercadoria(){
		this.CodigoMercadoria = "";
	}
	
    public String getCodigoMercadoria(){
        return this.CodigoMercadoria;
    }
    public void setCodigoMercadoria(String CodigoMercadoria){
        this.CodigoMercadoria = CodigoMercadoria;
    }

	public String getNomeMercadoria(){
		return this.NomeMercadoria;
	}
    public void setNomeMercadoria(String NomeMercadoria){
        this.NomeMercadoria = NomeMercadoria;
    }

    public String getLocalDeVenda(){
        return this.LocalDeVenda;
    }
    public void setLocalDeVenda(String LocalDeVenda){
        this.LocalDeVenda = LocalDeVenda;
    }
    
    @Override
    public String toString() {
        return "Codigo do Mercadoria: " + this.CodigoMercadoria + "\n" +
               "Nome do Mercadoria: " + this.NomeMercadoria + "\n" +
               "Local de Venda: " + this.LocalDeVenda + "\n";
    }

}