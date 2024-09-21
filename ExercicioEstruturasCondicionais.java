/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioestruturascondicionais;

import java.util.Scanner;
 
    public class ExercicioEstruturasCondicionais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String meuNome = "Sabrina";
        int minhaIdade = 22;
        double meuPeso = 55.0;
        double minhaAltura = 1.53;
        String minhaSerie = "Prison Break";
        String minhaMusica = "Taste - Sabrina Carpenter";
        String meuJogo = "GTA";
        System.out.println("------------------------------------");
        
        int contador = 0;
        
        System.out.println("Informe seu nome: ");
        String nome = scanner.next();
        if (nome.equals(meuNome)) {
            System.out.println("Seu nome é igual ao meu nome!");
            contador++;
        } else {
            System.out.println("Seu nome é diferente do meu nome :(");
        }
        
        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();
        if(idade == minhaIdade) {
            System.out.println("Sua idade é igual a minha idade!");
            contador++;
        }else {
            System.out.println("Sua idade não é igual a minha :(");
        }
        
        System.out.println("Informe seu peso (kg): ");
        double peso = scanner.nextDouble();
        if(peso == meuPeso) {
            System.out.println("Seu peso é igual ao meu!!");
            contador++;
        } else {
            System.out.println("Seu peso não é igual ao meu :(");
        }
        
        System.out.println("Informe sua altura (m): ");
        double altura = scanner.nextDouble();
        if(altura == minhaAltura) {
            System.out.println("Sua altura é igual a minha !!");
            contador++;
        } else {
            System.out.println("Sua altura não é igual a minha :(");
        }
        
        System.out.println("Informe sua série favorita: ");
        String suaSerie = scanner.next();
        if(suaSerie.equals(minhaSerie)) {
            System.out.println("sua série favorita é igual a minha!!");
            contador++;
        } else {
            System.out.println("Sua série favorita não é igual a minha :(");
        }
        
        System.out.println("Informe sua música favorita: ");
        String suaMusica = scanner.next();
        if(suaMusica.equals(minhaMusica)) {
            System.out.println("Sua música favorita é igual a minha!!");
            contador++;
        } else {
            System.out.println("Sua música favorita não é igual a minha :(");
        }
        
        System.out.println("Informe seu jogo favorito: ");
        String seuJogo = scanner.next();
        if(seuJogo.equals(meuJogo)) {
            System.out.println("Seu jogo favorito é igual ao meu!!");
            contador++;
        } else {
            System.out.println("Seu jogo favorito não é igual ao meu :(");
        }
        
        if(contador >= 3) {
            System.out.println("Você é muito parecido comigo!!");
        } else {
            System.out.println("Você não se parece comigo :(");
        }
        
        scanner.close();
    }
}
