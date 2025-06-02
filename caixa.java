import java.util.Scanner;
import java.util.Locale;

public class caixa{
public static void main(String[] args){
Locale.setDefault(Locale.US);
Scanner entrada = new Scanner(System.in);
System.out.println("-----------------");
System.out.println("Bem vindo, cliente.");
System.out.println("1 - Ver saldo.");
System.out.println("2 - Depositar.");
System.out.println("3 - Sacar.");
System.out.println("4 - Sair.");
System.out.println("-----------------");
System.out.println("O que deseja? Digite o número");
int num = entrada.nextInt();
switch(num){
case 1:
double saldo;
System.out.println("Seu saldo é " + saldo);
break;

case 2:
System.out.println("Quanto gostaria de depositar? ");
double deposito = entrada.nextDouble();
saldo += deposito;
break;

case 3:
System.out.println("Quanto gostaria de sacar? ");
double saque = entrada.nextDouble();
if(saque <= saldo){
saldo -= saque;
System.out.println("Saque feito. Seu saldo agora é de " + saldo);
}
else
System.out.println("Saldo insuficiente.");
break;
case 4:
break;
default:
System.out.println("Opção invalida.");
}
}
}