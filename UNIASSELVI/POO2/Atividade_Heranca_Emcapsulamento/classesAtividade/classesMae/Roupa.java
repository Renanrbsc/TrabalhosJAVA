package classesMae;

public class Roupa {
    int CodigoDaRoupa;
	String NomeDaRoupa;
	String TipoDeTecido;

	public Roupa(){
		this.CodigoDaRoupa = 00;
	}
	
    public int getCodigoDaRoupa(){
        return this.CodigoDaRoupa;
    }
    public void setCodigoDaRoupa(int CodigoDaRoupa){
        this.CodigoDaRoupa = CodigoDaRoupa;
    }

	public String getNomeDaRoupa(){
		return this.NomeDaRoupa;
	}
    public void setNomeDaRoupa(String NomeDaRoupa){
        this.NomeDaRoupa = NomeDaRoupa;
    }

    public String getTipoDeTecido(){
        return this.TipoDeTecido;
    }
    public void setTipoDeTecido(String TipoDeTecido){
        this.TipoDeTecido = TipoDeTecido;
    }
    
    @Override
    public String toString() {
        return "Codigo do Roupa: " + this.CodigoDaRoupa + "\n" +
               "Nome da Roupa: " + this.NomeDaRoupa + "\n" +
               "Tipo de Tecido: " + this.TipoDeTecido + "\n";
    }

}