import java.util.Scanner;

public class NotasAlteradas {
    public static void main(String[] args) {
        Double n1, n2, n3, media;
        int notaDireto, notaMediaFinal, notaProvaFinal;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a nota mínima para passar direto:");
        notaDireto = scanner.nextInt();

        System.out.println("Informe a nota mínima para fazer prova Final:");
        notaProvaFinal = scanner.nextInt();

        System.out.println("Informe a nota mínima para passar com Média Final");
        notaMediaFinal = scanner.nextInt();

        System.out.println("Informe a primeira nota:");
        n1 = scanner.nextDouble();

        System.out.println("Informe a segunda nota:");
        n2 = scanner.nextDouble();

        System.out.println("Informe a terceira nota:");
        n3 = scanner.nextDouble();

        media = (n1 + n2 + n3) / 3;

        if (media >= notaDireto) {
            System.out.println("O aluno passou direto.");
        } else if( media >= notaProvaFinal) {
            System.out.println("O aluno ficou de prova final.");

            System.out.println("Insira a nota da prova final:");
            Double mediaFinal = scanner.nextDouble();

            if(((mediaFinal + media) / 2) > notaMediaFinal){
                System.out.println("O aluno passou.");
            }else {
                System.out.println("O aluno reprovou.");
            }
        }else{
            System.out.println("O aluno reprovou.");
        }
    }
}
