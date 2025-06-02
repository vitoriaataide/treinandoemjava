import java.util.Scanner;
import java.util.Locale;

public class Condicionais {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else if(idade < 0) {
            System.out.println("Digite uma idade válida.");
        }
else{
 System.out.println("Você é menor de idade.");
}

        entrada.close();
    }
}
