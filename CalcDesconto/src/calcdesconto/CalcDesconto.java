package calcdesconto;

import java.util.Scanner;

public class CalcDesconto {

    public static void main(String[] args) {
        float valorOriginal,porcento,resultado,valor;        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor original do produto:");
        valorOriginal = scanner.nextFloat();
        System.out.print("Digite a porcentagem de desconto: ");
        porcento = scanner.nextFloat();
        resultado = (porcento * valorOriginal)/100;
        valor = valorOriginal - resultado;
        System.out.println("R$"+valor);       
    }
}
