import java.util.Scanner;
import java.util.Random;

public class Media {
    public static void main (String[] args) {
        int n1,n2,n3,n4,n5, media, numero;
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Insira 5 números inteiros:");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();
        n4 = scanner.nextInt();
        n5 = scanner.nextInt();*/

        n1 = new Random().nextInt(99) + 1;
        n2 = new Random().nextInt(99) + 1;
        n3 = new Random().nextInt(99) + 1;
        n4 = new Random().nextInt(99) + 1;
        n5 = new Random().nextInt(99) + 1;

        media = (n1+n2+n3+n4+n5) / 5;

        System.out.println(media);

        int tentativas = 15;

        do {
            System.out.println("Informe um número para comparar com a media: ");
            numero = scanner.nextInt();

            if (media > numero ) {
                System.out.println("Menor.");
            }else if (media < numero ){
                System.out.println("Maior.");
            }else {
                System.out.println("Acertou.");
            }tentativas --;

            if (tentativas <= 0) {
                System.out.println("Suas tentativas acabaram!");
                break;
            }
        } while (numero != media);

    }    
}
