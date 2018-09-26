package br.com.vtorres.uriolinejudge.categorias.iniciante;

import java.math.BigDecimal;
import java.util.Scanner;

public class Problema1005 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        calcularValor(a, b);

    }

    private static void calcularValor(double a, double b) {
        double[] peso = {3.5, 7.5};
        double x = ((a * peso[0]) + (b * peso[1])) / (peso[0] + peso[1]);
        BigDecimal calculado = new BigDecimal(x);

        System.out.println("MEDIA = " + calculado.setScale(5, BigDecimal.ROUND_HALF_UP).doubleValue());
    }
}
