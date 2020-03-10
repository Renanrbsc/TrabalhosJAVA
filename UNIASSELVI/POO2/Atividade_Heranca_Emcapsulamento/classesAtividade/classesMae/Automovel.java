package classesMae;

public class Automovel {
    String TipoDeAutomovel;
	String PlacaDoAutomovel;
	String FabricadoEm;

	public Automovel(){
		this.TipoDeAutomovel = "";
	}
	
    public String getTipoDeAutomovel(){
        return this.TipoDeAutomovel;
    }
    public void setTipoDeAutomovel(String TipoDeAutomovel){
        this.TipoDeAutomovel = TipoDeAutomovel;
    }

	public String getPlacaDoAutomovel(){
		return this.PlacaDoAutomovel;
	}
    public void setPlacaDoAutomovel(String PlacaDoAutomovel){
        this.PlacaDoAutomovel = PlacaDoAutomovel;
    }

    public String getFabricadoEm(){
        return this.FabricadoEm;
    }
    public void setFabricadoEm(String FabricadoEm){
        this.FabricadoEm = FabricadoEm;
    }
    
    @Override
    public String toString() {
        return "Tipo de Automovel: " + this.TipoDeAutomovel + "\n" +
               "Placa do Automovel: " + this.PlacaDoAutomovel + "\n" +
               "Fabricado em: " + this.FabricadoEm + "\n";
    }

}