/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciooperadorrelacional;

import java.util.Scanner;
    
    public class ExercicioOperadorRelacional {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();
        if (idade > 21) {
            System.out.println("Você tem mais de 21 anos.");
        } else {
            System.out.println("Você tem menos de 21 anos.");
        }
       
        System.out.println("-----------------------------------------------------------");
        System.out.println("Informe o seu salário (R$): ");
        double salario = scanner.nextDouble();
        double salarioMin = 1212.00;
        if (salario > 5 * salarioMin) {
            System.out.println("Seu salário é 5 vezes maior que o salário mínimo.");
        } else {
            System.out.println("Seu salário não é 5 vezes maior que o salário mínimo");
        }
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("Informe sua altura (m): ");
        double altura = scanner.nextDouble();
        if (altura > 1.75) {
            System.out.println("Sua altura é maior que 1,75m!!");
        } else {
            System.out.println("Sua altura não é maior que 1.75m :(");
        }
       
        System.out.println("----------------------------------------------------------");
        System.out.println("Informe seu peso (kg): ");
        double peso = scanner.nextDouble();
        if(peso > 70) {
            System.out.println("Seu peso é maior que 70kg");
        } else {
            System.out.println("Seu peso não é maior que 70 kg");
        }
        
        System.out.println("---------------------------------------------------------");
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        String meuSobrenome = "Nery";
        if(!sobrenome.equals(meuSobrenome)) {
            System.out.println("Seu sobrenome é diferente do meu sobrenome!");
        } else {
            System.out.println("Seu sobrenome é igual ao meu sobrenome!! :)");
        }
        
        System.out.println("Informe seu gênero (M/F): ");
        String genero = scanner.next();
        if (genero.equals("F")) {
            System.out.println("Seu gênero é Feminino!");
        } else {
            System.out.println("Seu gênero é Masculino!");
        }
    
        scanner.close();
        
    }
}
