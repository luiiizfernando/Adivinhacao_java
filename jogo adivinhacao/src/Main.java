import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int numeroSecreto = new Random().nextInt(100), chute, tentativas = 5, contador = 1;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Bem vindo ao jogo de advinhação. Você tem 5 tentativas para acertar o número.");
        while (tentativas >= 1)
        {
            System.out.printf("Digite um número de 0 a 100: ");
            chute = leitura.nextInt();
            if(chute == numeroSecreto)
            {
                System.out.println("Parabéns! Você acertou o número. Em " + contador + " Tentativa(s).");
                break;
            }
            else
            {
                contador++;
                tentativas--;
                if(chute > numeroSecreto)
                {
                    System.out.println("Você errou o número. O número digitado é maior que o número secreto.");
                    System.out.println("Você tem " + tentativas + " Tentativa(s) restantes");
                }
                else
                {
                    System.out.println("Você errou o número. O número digitado é menor que o número secreto.");
                    System.out.println("Você tem " + tentativas + " Tentativa(s) restantes");
                }
                if (contador == 5)
                {
                    System.out.println("O número sorteado era: " + numeroSecreto);
                }
            }
        }


    }
}