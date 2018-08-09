

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);
    Calculadora calculadora = new Calculadora();
    int opcao;
    float a = 0, b = 0;

    public void MenuPrincipal(){
        System.out.println("Olá bem-vindo(a) a calculadora:");
        System.out.println("Escolha a operacao:\n1. Adição\n2. Subtracao");

        opcao = sc.nextInt();

        System.out.print("Digite o primeiro valor: ");
        a = sc.nextFloat();
        System.out.print("Digite o segundo valor: ");
        b = sc.nextFloat();

        switch(opcao){
            case 1:
                System.out.println(calculadora.Somar(a, b));
                break;
            case 2:
                System.out.println(calculadora.Subtrair(a, b));
                break;
        }
    }
}
