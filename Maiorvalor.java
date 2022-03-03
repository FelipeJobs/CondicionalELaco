package Exercícios;
/*Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
import java.util.Arrays;
import java.util.Scanner;
public class Maiorvalor {
    public static void main(String[] args) {
    int quantosValores,max =0, invalido;
    Scanner input = new Scanner(System.in);
        System.out.println("Quantos valores você irá comparar: ");
        quantosValores = input.nextInt();
        double valores[] = new double[quantosValores];
    for (int c = 0; c <quantosValores ; c++) {
            System.out.print("\33[32mQual é o " + (c+1) + "º valor: ");
            valores[c] = input.nextDouble();
            invalido = (int)valores[c];
            if(valores[c]/ invalido !=1){
                System.out.println("\33[31mVocê só pode digitar números inteiros, tente novamente...\n");
                c = c-1;
            }
            max = Math.max(max,(int)valores[c]);}
    System.out.println("\33[34mOs valores digitados foram: "+Arrays.toString(valores));
    System.out.println("\33[36mO maior valor é: " + max);
}}
