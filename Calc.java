import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primero numero:");
        double num1 = entrada.nextDouble();

        System.out.println("Digite o segundo numero:");
        double num2 = entrada.nextDouble();

         System.out.println("Escolha a operação (+, -, * , /)");
         String operacao = entrada.next();

         double resultado = 0;

         if (operacao.equals("+")) {
            resultado = num1 + num2;
         } else if (operacao.equals("-"))  {
            resultado = num1 - num2;
         } else if (operacao.equals("*")) {
            resultado = num1 * num2;

         } else if (operacao.equals("/")) {
             resultado = num1 / num2;

         }else {
            System.out.println("Operação errada!");
         }

        System.out.println("resultado:" + resultado);
        entrada.close();

         }
         }
    

