
import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);
    Calculadora calculadora = new Calculadora();

    int opcao;
    float a = 0, b = 0;
    boolean podeRodar;

    public void MenuPrincipal(){

        System.out.println("Olá bem-vindo(a) a calculadora:");
        System.out.println("Escolha a operacao:" +
                "\n1. Adição" +
                "\n2. Subtracao" +
                "\n3. Multiplicacao" +
                "\n4. Divisao" +
                "\n5. Potencialização" +
                "\n6. Racionalizar");

        podeRodar = true;
        opcao = sc.nextInt();

        if(podeRodar) {
            System.out.print("Digite o primeiro valor: ");
            a = sc.nextFloat();
            System.out.print("Digite o segundo valor: ");
            b = sc.nextFloat();

        }
        switch(opcao){
            case 1:
                //Bloco execultavel;
                System.out.println(calculadora.Somar(a, b));
                break;
            case 2:
                System.out.println(calculadora.Subtrair(a, b));
                break;
            case 3:
                System.out.println(calculadora.Multiplicar(a, b));
                break;
            case 4:
                System.out.println(calculadora.Dividir(a, b));
                break;
            case 5:
                System.out.println(calculadora.Potencializar(a, (int) b));
                break;
            case 6:
                System.out.println(calculadora.Racionalizar(a));
                break;
            default:
                System.out.println("Nenhuma opercao...");
                break;
        }

        podeRodar = false;
        sc.close();
    }
}
