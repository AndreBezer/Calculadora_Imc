package IMC;

import java.util.Scanner;

class imcTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso, altura;

        System.out.println("Digite o seu peso em Kg, (70,5): ");
        peso = sc.nextDouble();
        System.out.println("Digite a sua altura em metros, (1,75): ");
        altura = sc.nextDouble();

        altura = altura * altura;
        double imc = peso / altura;

        if (imc <= 18.5){
            System.out.println("Abaixo do peso");
        }
        else if (imc >= 18.6 && imc <=24.9){
            System.out.println("peso ideal");
        }
        else if (imc >= 25 && imc <=29.9){
            System.out.println("levemente acima do peso");
        }
        else if (imc >= 30 && imc <=34.9){
            System.out.println("Obesidade grau 1");
        }
        else if (imc >= 35 && imc <=39.9){
            System.out.println("obesidade grau 2");
        }
        else if (imc >= 40){
            System.out.println("Obesidade Morbida");
        }
    }
}