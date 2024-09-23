package Java;

import java.util.Scanner;

public class Subtracao {

    public static void main(String[] args){

        int num1, num2, result;

        Scanner input = new Scanner (System.in);

        System.out.println("\nDigite o primeiro número: ");
        num1 = input.nextInt();
        System.out.println("\nDigite o segundo número: ");
        num2 = input.nextInt();

        result = (num1 - num2);

        System.out.println("\nO resultado da expressão: (" + num1 + " - " + num2 + ") é " + result);
    }
}
