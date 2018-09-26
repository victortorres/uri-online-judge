package br.com.vtorres.uriolinejudge.categorias.iniciante;

import java.util.Scanner;

public class Problema1003 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        calcularValor(a, b);

    }

    private static void calcularValor(int a, int b) {
        int x = a + b;

        System.out.println("SOMA = " + x);
    }

}
