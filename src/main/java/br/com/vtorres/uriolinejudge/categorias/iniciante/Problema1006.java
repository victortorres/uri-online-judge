package br.com.vtorres.uriolinejudge.categorias.iniciante;

import java.util.Scanner;

public class Problema1006 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        double a = converterString2Double(teclado.next());
        double b = converterString2Double(teclado.next());
        double c = converterString2Double(teclado.next());
        calcularValor(a, b, c);

    }

    private static double converterString2Double(String valorIn) {
		double valorInConvertido = Double.valueOf(valorIn);
    	return ((valorInConvertido < 0.0 || valorInConvertido > 10.0) ? 0.0 : valorInConvertido);
	}

	private static void calcularValor(double a, double b, double c) {
        double[] peso = {2.0, 3.0, 5.0};
        double x = ((a * peso[0]) + (b * peso[1]) + + (c * peso[2])) / (peso[0] + peso[1] + peso[2]);

        System.out.printf("MEDIA = %.1f\n", x);
    }
}
