package br.com.vtorres.uriolinejudge.categorias.iniciante;

import java.math.BigDecimal;
import java.util.Scanner;

public class Problema1005 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        double a = converterString2Double(teclado.next());
        double b = converterString2Double(teclado.next());
        calcularValor(a, b);

    }

    private static double converterString2Double(String valorIn) {
		double valorInConvertido = Double.valueOf(valorIn);
    	return ((valorInConvertido < 0.0 || valorInConvertido > 10.0) ? 0.0 : valorInConvertido);
	}

	private static void calcularValor(double a, double b) {
        double[] peso = {3.5, 7.5};
        double x = ((a * peso[0]) + (b * peso[1])) / (peso[0] + peso[1]);

        System.out.printf("MEDIA = %.5f\n", x);
    }
}
