package br.com.vtorres.uriolinejudge.categorias.iniciante;

import java.util.Scanner;

public class Problema1007 {

    public static void main(String[] args){

    	double[] entrada = entrada();
        double retorno = calcularValor(entrada);
        saida(retorno);
    }

    private static void saida(double retorno) {
    	System.out.printf("MEDIA = %.1f\n", retorno);
	}

	private static double[] entrada() {
        Scanner teclado = new Scanner(System.in);
        double a = converterString2Double(teclado.next());
        double b = converterString2Double(teclado.next());
        double c = converterString2Double(teclado.next());
        
        double[] entrada = {a, b, c};
        return entrada;
	}

	private static double converterString2Double(String valorIn) {
		double valorInConvertido = Double.valueOf(valorIn);
    	return ((valorInConvertido < 0.0 || valorInConvertido > 10.0) ? 0.0 : valorInConvertido);
	}

	private static double calcularValor(double[] entrada) {
        double[] peso = {2.0, 3.0, 5.0};
        double x = ((entrada[0] * peso[0]) + (entrada[1] * peso[1]) + + (entrada[2] * peso[2])) / (peso[0] + peso[1] + peso[2]);
        
        return x;
    }
}
