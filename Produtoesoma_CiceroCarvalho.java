package produtoesoma_cicerocarvalho;
//@author Cicero Carvalho
import java.util.Scanner;
public class Produtoesoma_CiceroCarvalho {

    public static void main(String[] args)
    {
      Scanner entrada;
      double num1, num2, num3, num4, soma, prod;
      
      entrada = new Scanner(System.in);
      
      System.out.print("Digite o 1º número: ");
      num1 = entrada.nextDouble();
      
      System.out.print("Digite o 2º número: ");
      num2 = entrada.nextDouble();
      
      System.out.print("Digite o 3º número: ");
      num3 = entrada.nextDouble();
      
      System.out.print("Digite o 4º número: ");
      num4 = entrada.nextDouble();
      
      soma = num2 + num4;
      prod = num1 * num3;
      
      System.out.println("A soma do 2º número com o 4º número é: "+soma);
      System.out.println("A multiplicação do 1º número com o 3º número é: " + prod);
    }
}
