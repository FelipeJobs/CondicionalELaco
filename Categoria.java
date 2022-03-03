package Exercícios;

import java.util.Scanner;

/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
•	10-14 infantil
•	15-17 juvenil
•	18-25 adulto */
public class Categoria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double idade;
        for (int c = 0; c <1 ; c++) {
            System.out.print("\33[36mQual a sua idade: ");
            idade = input.nextDouble();
        if (idade/(int) idade != 1){ //impedir números decimais.
            System.out.println("\33[31mSó aceitamos valores inteiros, tente novamente...");
            c=-1;
            continue;
        }
        if(idade <= 14 && idade >=10){
            System.out.println("\33[35mVocê está na categoria Infantil. ");
        }
        else if(idade <= 17 && idade >=15){
            System.out.println("\33[34mVocê está na categoria Juvenil. ");
        }
        else if(idade> 17){
            System.out.println("\33[36mVocê está na categoria Adulta.");
        }
        else {
            System.out.println("\33[31mVocê não tem idade suficiente para participar de uma categoria. ");
        }

    }
}}
