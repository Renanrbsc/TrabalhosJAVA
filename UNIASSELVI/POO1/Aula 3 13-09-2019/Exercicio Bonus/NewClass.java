//SEGUNDA CLASSE NO PACKAGE

package javaapplication16; // pacote de classes, forma de organizar os objetos/classes em um projeto
public class NewClass { // classe publica, todas as classes dentro do pacote tem acesso atraves do .metodo

 private float num1; // variavel privada do tipo float(decimal), apenas a classe atual tem acesso ao tipo
 private float num2; // variavel privada do tipo float(decimal), apenas a classe atual tem acesso ao tipo
 private float total; // variavel privada do tipo float(decimal), apenas a classe atual tem acesso ao tipo
 
 public NewClass(){ // declarando metodo construtor - contem instrucoes que serao executadas SEMPRE que for instanciado um objeto desta classe
	 num1 = 0; // variaveis com acesso publico no valor
	 num2 = 0; // variaveis com acesso publico no valor
	 total = 0; // variaveis com acesso publico no valor
	 }

	 public float getTotal(){ // declarando metodo para pegar outro variavel e retorna-lo
	 return(total);//atributos
	 }

	 public void setNum1(float v1) { // declarando metodo para definir outra variavel
	 num1 = v1;//atributos
	 }

	 public void setNum2(float v1) { // declarando metodo para definir outra variavel
	 num2 = v1;//atributos
	 }

	 public float calculo01(float v1, float v2) { // declarando metodo para operaçao matematica com valor decimal = parametro variaveis do tipo decimal
	 float res; // tipo de variavel  para resultado //atributos
	 res = (v1 * v2) / (v1 + v2); // operacao matematica com logica matematica () e valor no resultado //atributos
	 return(res); // retornando ao metodo o valor da variavel resultado //atributos
	 }

	 public float calculo02() { // declarando metodo para operaçao matematica com valor decimal sem parametro
	 total = num1 - 3 * num2; // operacao matematica com as variaveis declaradas e valor no total //atributos
	 return(total); // retornando ao metodo o valor da variavel total //atributos
	 }

	 public void calculo03() { // declarando metodo 3 que nao vai retornar valor 
	 total = (num1 - num2) / num2; // operacao matematica com logica matematica entre () e valor no total //atributos
	 }
	}