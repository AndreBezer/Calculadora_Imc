package src.entities;

public class imcTerminal {
    private double peso;
    private int altura;

    public String imc(){
        double imc  = (peso / (altura * altura)) * 10000;

        if (imc <= 18.5){
            return "Abaixo do peso " + imc;
        }
        else if (imc >= 18.6 && imc <=24.9){
            return "peso ideal " + imc;
        }
        else if (imc >= 25 && imc <=29.9){
            return "levemente acima do peso " + imc;
        }
        else if (imc >= 30 && imc <=34.9){
            return "Obesidade grau 1 " + imc;
        }
        else if (imc >= 35 && imc <=39.9){
            return "obesidade grau 2 " + imc;
        }
        else{
            return "Obesidade Morbida " + imc;
        }
    }

    public double getPeso(){
        return peso;
    }

    public int getAltura(){
        return altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }
}
