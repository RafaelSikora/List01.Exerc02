import java.util.Scanner;
//Exercicio 02: Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
class Main {
  
  public static void main(String[] args) {
  //Declaração de variáveis
  double numero;

    //Passo 1: fazer a entrada dos dados
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o numero desejado: ");
    numero = teclado.nextDouble();
    
    //Passo 2: exibir a resposta pro usuário
    System.out.println("O numero digitado foi: " + numero);
  }
  
}
