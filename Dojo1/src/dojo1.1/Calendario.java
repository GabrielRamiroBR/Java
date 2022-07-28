import java.util.Scanner;
import java.util.Calendar;

public class Calendario {
    public static void main(String[] args) {
        int anoUsuario;
        int diasUsuario;
        Scanner scanner = new Scanner(System.in);
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);


        System.out.println("Insira o ano:");
        anoUsuario = scanner.nextInt();

        System.out.println("Insira os dias que se passaram:");
        diasUsuario = scanner.nextInt();

        if (anoUsuario % 2 == 0) {
            System.out.println("Paridade: Par");
        }else {
            System.out.println("Paridade: Ímpar.");
        }
        
        if (anoUsuario % 4 == 0 && anoUsuario % 100 != 0 || anoUsuario % 400 == 0) {
            System.out.println("Bissexto: true");
        } else {
            System.out.println("Bissexto: false");
        }
        
        int diferenca = Math.abs(anoAtual - anoUsuario);
        System.out.println("Distância: " + diferenca);

        
            int ano = anoUsuario + (diasUsuario/360);
            int mes = (diasUsuario % 360) / 30 + 1;
            int dia = 0;
            if ((diasUsuario % 30) == 0){
                dia = (diasUsuario % 360) % 30 + 1;
            } else {
                dia = (diasUsuario % 360) % 30;
            }
    
            System.out.printf("Data: %d/%d/%d\n", dia,mes,ano);
            System.out.println("Dias para acabar o ano: " + (360 - (diasUsuario % 360)));
        }
        
   }
