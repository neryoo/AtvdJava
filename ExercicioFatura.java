/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciofatura;

import java.util.Scanner;

public class ExercicioFatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o valor total da fatura: ");
        double valorTotal = scanner.nextDouble();
        System.out.println("Informe o número de parcelas: ");
        int numParcelas = scanner.nextInt();
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Informe o percentual de desconto pelo pagamento antecipado (%): ");
        double percentualDesconto = scanner.nextDouble();
        System.out.println("Informe o percentual de multa (%) em cada parcela em  caso de atraso no pagamento:.");
        double percentualMulta = scanner.nextDouble();
        System.out.println("--------------------------------------------------------------------------------------------------");
        
        double desconto = (percentualDesconto / 100) * valorTotal;
        double valorComDesconto = valorTotal - desconto;
        double valorParcela = valorComDesconto / numParcelas;
        double multaPorParcela = (percentualMulta / 100) * valorParcela;
        double valorParcelaComMulta = valorParcela + multaPorParcela;
        
        System.out.println("Valor total com desconto: R$ " + valorComDesconto);
        System.out.println("Valor de cada parcela com multa: R$ " + valorParcelaComMulta);
        System.out.println("Multa por parcela: R$ " + multaPorParcela);
        
        scanner.close();

        
    }
}


     