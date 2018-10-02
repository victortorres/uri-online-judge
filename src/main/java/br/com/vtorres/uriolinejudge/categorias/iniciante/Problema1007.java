package br.com.vtorres.uriolinejudge.categorias.iniciante;

import java.util.Scanner;

public class Problema1007 {

    public static void main(String[] args){

    	int[] entrada = entrada();
        int retorno = calcularValor(entrada);
        saida(retorno);
    }

    private static void saida(int retorno) {
    	System.out.printf("DIFERENCA = %d\n", retorno);
	}

	private static int[] entrada() {
        Scanner teclado = new Scanner(System.in);
        int a = converterString2Double(teclado.next());
        int b = converterString2Double(teclado.next());
        int c = converterString2Double(teclado.next());
        int d = converterString2Double(teclado.next());
        
        int[] entrada = {a, b, c, d};
        return entrada;
	}

	private static int converterString2Double(String valorIn) {
		int valorInConvertido = Integer.valueOf(valorIn);
    	return valorInConvertido;
	}

	private static int calcularValor(int[] entrada) {
        int x = (entrada[0] * entrada[1] - entrada[2] * entrada[3]);
        
        return x;
    }
}
