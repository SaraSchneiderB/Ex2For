/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X 
que serão lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] 
e quantos estão fora do intervalo, mostrando essas informações conforme exemplo 
(use a palavra "dentro do intervalo" para dentro do intervalo, e "fora do intervalo" para fora do intervalo).
 */
package com.mycompany.ex2for;

import java.util.Scanner;

public class Ex2For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de números para a seleção: \n");
        int n = teclado.nextInt();
        int dentroDoIntervalo = 0;
        int foraDoIntervalo = 0;
        System.out.println("Digite os números desejados: \n");
        for (int i = 0; i < n; i++) {
            int x = teclado.nextInt();
            if (x >= 10 && x <= 20) {
                dentroDoIntervalo = dentroDoIntervalo + 1;
                System.out.println(x + " está dentro do intervalo");
            } else {
                foraDoIntervalo = foraDoIntervalo + 1;
                System.out.println(x + " está fora do intervalo");
            }
        }
        System.out.println(dentroDoIntervalo + " Dentro do intervalo 10,20");
        System.out.println(foraDoIntervalo + " Fora do intervalo 10,20");
        teclado.close();
    }
}
