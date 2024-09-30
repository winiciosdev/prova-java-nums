import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        List<Integer> valores = new ArrayList<>();
        int valor;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Digite um valor (negativo para encerrar): ");
            valor = l.nextInt();
            valores.add(valor); 

            if (valor < 0) {
                break;
            }

            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        }

        
        System.out.println("Números inseridos: " + valores);

    
        if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        } else {
            System.out.println("Nenhum valor positivo foi inserido.");
        }

        l.close();
    }
}
