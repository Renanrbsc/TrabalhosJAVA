import java.util.Date;
import java.awt.*;
import javax.swing.*;

public class Aluno{
    private String nome;
    private Date data_de_nascimento;
    private Float altura;
    private Float peso;
    private String telefone;
    private String email;

    public String getNome(){
		return this.nome;
	}
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(String idade){
        this.idade = idade;
    }

    public String getPeso(){
		return this.peso;
	}
    public void setPeso(String peso){
        this.peso = peso;
    }

    public String getAltura(){
		return this.altura;
	}
    public void setAltura(String altura){
        this.altura = altura;
    }

    public Date getDataNascimento(){
        return data_de_nascimento;
    }
    public void setDataNascimento(Date dataNascimento){
        this.data_de_nascimento = dataNascimento;
    }

    public int getIdade(){
        return this.getDataNascimento().getYear();
    }

    public float getIMC(){
        return this.getPeso()
                / (this.getAltura() * this.getAltura());
    }

}