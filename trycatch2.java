import java.util.Scanner;

public class trycatch2 {
    
    public static void main(String[] args) {
        Scanner scnAltura = new Scanner(System.in);
        System.out.println("Digite a altura");
        double altura = scnAltura.nextDouble();

        Scanner scnLargura = new Scanner(System.in);
        System.out.println("Digite a largura");
        double largura = scnLargura.nextInt();

        System.out.println("O metro quadrado é de " + (largura * largura));

        scnAltura.close();
        scnLargura.close();   
     }

}
