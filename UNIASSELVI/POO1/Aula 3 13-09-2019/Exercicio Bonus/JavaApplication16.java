package javaapplication16; // pacote de classes, forma de organizar os objetos/classes em um projeto
import java.util.Scanner; // importando biblioteca JAVA para utilizar funcoes especificas
public class JavaApplication16 { // classe publica, todas as classes dentro do pacote tem acesso atraves do .metodo

 public static void main(String[] args) { /* classe estatica que nao retorna valor e tem o metodo que inicia o programa 
	 + contem parametro utilizado para iniciar nos aplicativos JAVA E VM*/

 NewClass calc; //declarando uma variavel para ter herança de objeto"classe"
 calc = new NewClass(); // variavel do tipo objeto"classe"

 Scanner sc; // declarando variavel para herança de objeto"Scanner que foi importado de bibliotaca JAVA"
 sc = new Scanner(System.in); //variavel do tipo objeto com parametro inicializador do Scanner

 float valor1, valor2, resultado = 0; //declarando tipo decimal de variaveis e um valor para outra
 int opcao; // declarando variavel do tipo inteiro

 do { //LOOP FAZER  todas vezes que o programa finalizar o resultados, devera voltar nesse estagio
 System.out.println("Escola o cálculo: "); //chamando metodo sistema para escrever na tela
 System.out.println("1 - Cálculo 01"); //chamando metodo sistema para escrever na tela 
 System.out.println("2 - Cálculo 02"); //chamando metodo sistema para escrever na tela 
 System.out.println("2 - Cálculo 03"); //chamando metodo sistema para escrever na tela 
 System.out.println("4 - Sair"); //chamando metodo sistema para escrever na tela
 System.out.println("Opção: "); //chamando metodo sistema para escrever na tela
 opcao = sc.nextInt(); // variavel que vai receber o valor do Scanner como tipo Inteiro'' usuario digita''

 if (opcao != 4) { // funcao de decisao  ounde opcao tera o valor do scanner e se for diferente de valor, ira fazer uma acao

 System.out.println("\nDigite o 1º valor: "); //chamando metodo para escrever na tela
 valor1 = sc.nextFloat(); //variavel float recebe valor do tipo decimal do scanner ''usuario digita valor 1''
 System.out.println("\nDigite o 2º valor: ");//chamando metodo para escrever na tela
 valor2 = sc.nextFloat();//variavel float recebe valor do tipo decimal do scanner ''usuario digita valor 2''
 
 // se o if tiver valor = a 1, 2, 3 ira cair no interruptor SWITCH que por sua ver
 // fara uma das opcoes do case
 
 switch(opcao) { // interruptor
 case 1: // caso opcao 1
 resultado = calc.calculo01(valor1, valor2); // variavel = chamar classe,chamar metodo(variaveis indicadas como referencias ao metodo v1,v2) variavel resultado recebe o valor da operacao q esta contida
 break; // termina o case
 case 2: // caso opcao 2
 calc.setNum1(valor1); // chama classe, chama metodo (parametro para substituir atributo)
 calc.setNum2(valor2); // chama classe, chama metodo (parametro para substituir atributo)
 resultado = calc.calculo02(); 
 break; // termina o case
 case 3: // caso opcao 3
 calc.setNum1(valor1); // chama classe, chama metodo (parametro para substituir atributo)
 calc.setNum2(valor2); // chama classe, chama metodo (parametro para substituir atributo)
 calc.calculo03(); //chama classe.metodo
 resultado = calc.getTotal(); // varaiavel que recebe valor de classe.metodo
 break; // termina o case
 }

 System.out.println("\n\n==============================="); //chamando metodo sistema para escrever na tela
 System.out.println("Resultado: " + resultado); //chamando metodo sistema para escrever na tela
 System.out.println("===============================\n\n"); //chamando metodo sistema para escrever na tela
 } 
 } while(opcao != 4); // LOOP ENQUANTO- ficara rodando o programa enquanto o valor de opcao for diferente de 4
 }
}



// Programa usado para operar logicas matematicas em um ambiente de estudo 'DEPENDENDO DO CONTEXTO' pode ser usado por empresas financeiras mudando os operadores