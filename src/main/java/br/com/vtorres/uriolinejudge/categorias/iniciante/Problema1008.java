package br.com.vtorres.uriolinejudge.categorias.iniciante;

import java.util.Scanner;

public class Problema1008 {

    public static void main(String[] args){
    	Object[] entrada = entrada();
        double retorno = calcularValor(entrada);
        saida(object2Integer(entrada[0]), retorno);
    }

    private static void saida(int codigo, double valorSalario) {
    	System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", codigo, valorSalario);
	}

	private static Object[] entrada() {
        Scanner teclado = new Scanner(System.in);
        int a = converterString2Integer(teclado.next());
        int b = converterString2Integer(teclado.next());
        double c = converterString2Double(teclado.next());
        
        Object[] entrada = {a, b, c};
        return entrada;
	}

	private static double converterString2Double(String valorIn) {
		double valorInConvertido = Double.valueOf(valorIn);
    	return valorInConvertido;
	}
	
	private static int converterString2Integer(String valorIn) {
		int valorInConvertido = Integer.valueOf(valorIn);
    	return valorInConvertido;
	}	

	private static double calcularValor(Object[] entrada) {
		int horas = object2Integer(entrada[1]);
		double valor = object2Double(entrada[2]);
		
        double x = horas * valor;
        
        return x;
    }

	private static int object2Integer(Object object) {
		if(object instanceof Integer) {
			return Integer.valueOf(object.toString());
		}
		return 0;
	}
	
	private static double object2Double(Object object) {
		if(object instanceof Double) {
			return Double.valueOf(object.toString());
		}
		return 0;
	}	
}
