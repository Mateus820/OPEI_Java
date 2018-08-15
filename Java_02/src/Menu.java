
import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);
    Calculadora calculadora = new Calculadora();

    int opcao;
    float a = 0, b = 0;
    boolean podeRodar;

    public void MenuPrincipal(){
        System.out.println("Olá bem-vindo(a) a calculadora:");
        System.out.println("Escolha a operacao:\n1. Adição\n2. Subtracao\n3. Multiplicacao\n4. Divisao");

        podeRodar = false;
        opcao = sc.nextInt();

        switch(opcao){
            case 1:
                //Bloco execultavel;
                System.out.println(calculadora.Somar(a, b));
                podeRodar = true;
                break;
            case 2:
                System.out.println(calculadora.Subtrair(a, b));
                podeRodar = true;
                break;
            case 3:
                System.out.println(calculadora.Multiplicar(a, b));
                podeRodar = true;
                break;
            case 4:
                System.out.println(calculadora.Dividir(a, b));
                podeRodar = true;
                break;
                default:
                    System.out.println("Nenhuma opercao...");
                    break;
        }

        if(podeRodar) {
            System.out.print("Digite o primeiro valor: ");
            a = sc.nextFloat();
            System.out.print("Digite o segundo valor: ");
            b = sc.nextFloat();

        }
        podeRodar = false;
        sc.close();
    }
}
