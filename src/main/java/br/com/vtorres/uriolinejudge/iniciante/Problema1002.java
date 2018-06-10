package br.com.vtorres.uriolinejudge.iniciante;

import java.math.BigDecimal;
import java.util.Scanner;

public class Problema1002 {

    static final double PI = 3.14159;

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        double raio = teclado.nextDouble();

        double area = PI * (raio * raio);

        BigDecimal areaCom4Casas = new BigDecimal(area);

        System.out.println("A="+areaCom4Casas.setScale(4, BigDecimal.ROUND_HALF_EVEN).toPlainString());
    }

}
