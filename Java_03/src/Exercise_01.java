import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise_01 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n, contador = 0;
        double soma = 0.0, porcentagem = 0;

        System.out.print("Digite o valor \"N\" : ");
        n = sc.nextInt();
        double[] notas = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
            System.out.println(soma);
        }
        double media = soma / n;

        for (int i = 0; i < n; i++){
            if(notas[i] >= media){
                contador++;
            }
        }
        porcentagem = ((100.0 * contador / n));
        System.out.printf("Porcentagem Final:  %.3f", porcentagem);
    }
}
