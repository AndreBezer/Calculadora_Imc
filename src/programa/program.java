package src.programa;

import src.entities.imcTerminal;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        imcTerminal i = new imcTerminal();

        System.out.println("Digite seu peso em Kg: ");
        i.setPeso(sc.nextDouble());
        System.out.println("Digite sua altura em cm: ");
        i.setAltura(sc.nextInt());

        System.out.println(i.imc());
        sc.close();
    }
}
