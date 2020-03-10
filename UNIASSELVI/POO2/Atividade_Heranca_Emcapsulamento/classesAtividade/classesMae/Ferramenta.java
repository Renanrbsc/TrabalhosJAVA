package classesMae;

public class Ferramenta {
    String TipoDeFerramenta;
	String NomeDaFerramenta;
	String DurabilidadeDaFerramenta;

	public Ferramenta(){
		this.TipoDeFerramenta = "";
	}
	
    public String getTipoDeFerramenta(){
        return this.TipoDeFerramenta;
    }
    public void setTipoDeFerramenta(String TipoDeFerramenta){
        this.TipoDeFerramenta = TipoDeFerramenta;
    }

	public String getNomeDaFerramenta(){
		return this.NomeDaFerramenta;
	}
    public void setNomeDaFerramenta(String NomeDaFerramenta){
        this.NomeDaFerramenta = NomeDaFerramenta;
    }

    public String getDurabilidadeDaFerramenta(){
        return this.DurabilidadeDaFerramenta;
    }
    public void setDurabilidadeDaFerramenta(String DurabilidadeDaFerramenta){
        this.DurabilidadeDaFerramenta = DurabilidadeDaFerramenta;
    }
    
    @Override
    public String toString() {
        return "Tipo de Ferramenta: " + this.TipoDeFerramenta + "\n" +
               "Nome da Ferramenta: " + this.NomeDaFerramenta + "\n" +
               "Durabilidade da ferramenta: " + this.DurabilidadeDaFerramenta + "\n";
    }

}