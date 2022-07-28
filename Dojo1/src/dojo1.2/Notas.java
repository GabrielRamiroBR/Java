import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Double n1, n2, n3, media;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota:");
        n1 = scanner.nextDouble();

        System.out.println("Informe a segunda nota:");
        n2 = scanner.nextDouble();

        System.out.println("Informe a terceira nota:");
        n3 = scanner.nextDouble();

        media = (n1 + n2 + n3) / 3;

        if (media >= 7) {
            System.out.println("O aluno passou direto.");
        } else if( media >= 4) {
            System.out.println("O aluno ficou de prova final.");

            System.out.println("Insira a nota da prova final:");
            Double mediaFinal = scanner.nextDouble();

            if(((mediaFinal + media) / 2) > 5){
                System.out.println("O aluno passou.");
            }else {
                System.out.println("O aluno reprovou.");
            }
        }else{
            System.out.println("O aluno reprovou.");
        }





    }
}
