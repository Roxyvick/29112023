import java.util.*;

public class trycatch1 {
    public static void main(String[] args) {
        try {
        Double gravidade = 9.81;
        Scanner scnPeso = new Scanner(System.in);
        System.out.println("Digite seu peso");
        double peso = scnPeso.nextDouble();   
        Scanner scnAltura = new Scanner(System.in);
        System.out.println("Digite sua altura");
        double altura = scnAltura.nextDouble();

        System.out.println(
        "Seu IMC é se " + 
        (peso / (altura * altura ))
        );

        System.out.println(
         "(peso /(Altura * Altura)) (" + peso + 
         " / (" + 
         altura +
         " * " +
         altura +
         " )) " +
         " [ " + altura + " * " + altura + " = " + (altura * altura) + "] "
         );
        scnPeso.close();
        scnAltura.close();
    } catch (Exception e) {
        System.out.println("Não foi possível calcular seu IMC");
    }
}
}