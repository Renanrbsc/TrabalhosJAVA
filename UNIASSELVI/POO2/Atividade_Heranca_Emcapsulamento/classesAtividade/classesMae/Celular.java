package classesMae;

public class Celular {
    String RegistroDoCelular;
	String MarcaDoCelular;
	String GeracaoDoCelular;

	public Celular(){
		this.RegistroDoCelular = "";
	}
	
    public String getRegistroDoCelular(){
        return this.RegistroDoCelular;
    }
    public void setRegistroDoCelular(String RegistroDoCelular){
        this.RegistroDoCelular = RegistroDoCelular;
    }

	public String getMarcaDoCelular(){
		return this.MarcaDoCelular;
	}
    public void setMarcaDoCelular(String MarcaDoCelular){
        this.MarcaDoCelular = MarcaDoCelular;
    }

    public String getGeracaoDoCelular(){
        return this.GeracaoDoCelular;
    }
    public void setGeracaoDoCelular(String GeracaoDoCelular){
        this.GeracaoDoCelular = GeracaoDoCelular;
    }
    
    @Override
    public String toString() {
        return "Registro do Celular: " + this.RegistroDoCelular + "\n" +
               "Marca do Celular: " + this.MarcaDoCelular + "\n" +
               "Geracao do Celular: " + this.GeracaoDoCelular + "\n";
    }

}