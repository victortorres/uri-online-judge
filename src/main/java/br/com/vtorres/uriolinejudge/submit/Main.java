package br.com.vtorres.uriolinejudge.submit;

import java.math.BigDecimal;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) {
 
        Scanner teclado = new Scanner(System.in);
        double a = converterString2Double(teclado.next());
        double b = converterString2Double(teclado.next());
        calcularValor(a, b);
 
    }
    
    private static double converterString2Double(String valorIn) {
		return Double.valueOf(valorIn);
	}

	private static void calcularValor(double a, double b) {
        double[] peso = {3.5, 7.5};
        double x = ((a * peso[0]) + (b * peso[1])) / (peso[0] + peso[1]);
        BigDecimal calculado = new BigDecimal(x);

        System.out.println("MEDIA = " + calculado.setScale(5, BigDecimal.ROUND_HALF_UP).doubleValue());
    }    
 
}
