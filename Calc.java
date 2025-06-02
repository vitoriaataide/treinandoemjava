import java.util.Scanner;
import java.util.Locale;

public class Calc{
public static void main(String[] args){
Locale.setDefault(Locale.US);
Scanner entrada = new Scanner(System.in);

System.out.println("Digite o primeiro número: ");
double num1 = entrada.nextDouble();

System.out.print("Digite o segundo número: ");
double num2 = entrada.nextDouble();

System.out.print("Digite a operação (*,+,-,/): ");
char op = entrada.next().charAt(0);

if(op == '*'){
double resultado = num1*num2;
System.out.println("O resultado é " + resultado);
}
else if(op == '-'){
double resultado = num1-num2;
System.out.println("O resultado é " + resultado);
}
else if(op == '+'){
double resultado = num1+num2;
System.out.println("O resultado é " + resultado);
}
else if(op == '/'){
double resultado = num1/num2;
System.out.println("O resultado é" + resultado);
}
else
System.out.println("Operação ínvalida.");
}
}