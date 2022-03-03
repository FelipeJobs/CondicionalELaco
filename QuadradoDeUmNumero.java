package Exercícios;
/*Faça um programa em que permita a entrada de um número qualquer e exiba se
este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo;
se for ímpar exiba o número elevado ao quadrado.*/
import java.util.Scanner;

public class QuadradoDeUmNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero;
        System.out.print("Digite um número qualquer: ");
        numero = input.nextDouble();
        if(numero % 2 == 0){
            System.out.println("\33[34mO número digitado é par.");
            System.out.println("\33[36mA raiz quadrada de " + numero + " é: " + Math.sqrt(numero));
        }
        else {
            System.out.println("\33[34mO número digitado é ímpar.");
            System.out.println("\33[36mO número " + numero + " elevado ao quadrado vale: " + Math.pow(numero,2));

        }



    }
}
