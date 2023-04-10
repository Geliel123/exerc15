import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor que ganha por hora: ");
        double valorhora = teclado.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mes: ");
        double horastrabmes = teclado.nextDouble();

        double salarioBruto = valorhora * horastrabmes;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totaldescontos = inss + sindicato + ir;
        double salarioliquido = salarioBruto - totaldescontos;

        System.out.println("Salário bruto é:" + salarioBruto);
        System.out.println("inss: " + inss);
        System.out.println("sindicato: " + sindicato);
        System.out.println("ir: " + ir);
        System.out.println("total de descontos: " + totaldescontos);
        System.out.println("Salário liquido: " + salarioliquido);
    }

}
