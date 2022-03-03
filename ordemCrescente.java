package Exercícios;

import java.util.Arrays;
import java.util.Scanner;

public class ordemCrescente {
    public static void main(String[] args) {
        int quantosNumeros,escolha;
        double invalido =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos números você quer colocar em ordem: ");
        quantosNumeros = input.nextInt();
        double ordem[]= new double[quantosNumeros];
        System.out.print(" Voce gostaria de organizar em que ordem:\n" +
                "1 = Crescente\n" + "2 = Decrescente\n" +"Opção escohida: ");
        escolha = input.nextInt();
        for (int c = 0; c < quantosNumeros; c++) {
            System.out.print("\33[34mQual é o " + (c+1) + "º valor: ");
            if(escolha == 2){// para colocar em ordem decrescente.
                ordem[c] = -input.nextDouble();
                invalido = Math.abs(ordem[c]);
                if(ordem[c]/(int) invalido != -1){//não permitir decimal
                    System.out.println("\33[31mVocê só pode digitar números inteiros, tente novamente...");
                    c= c-1;}
                continue;
            }
            ordem[c] = input.nextDouble();
            invalido = ordem[c];
            if(ordem[c]/(int)invalido != 1){// para não permitir número decimal.
                System.out.println("\33[31mVocê só pode digitar números inteiros, tente novamente...\n");
                c = c-1;}
        }
        Arrays.sort(ordem);// para organizar em ordem
        if(escolha == 2){
        for (int c = 0; c < quantosNumeros; c++) {
            ordem[c] = Math.abs(ordem[c]);// para tirar o sinal negativo.
        }}
        System.out.println(Arrays.toString(ordem));// retornar toda a lista
    }}
