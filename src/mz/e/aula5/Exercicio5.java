/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.e.aula5;
import java.util.Scanner;

/**
 *
 * @author Valter Massango
 */
public class Exercicio5 {
    public static void main (String[]args){
        //declaração de variáveis
        String nome, apelido;
        
         //Entrada de dados
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite nome:");
        nome = entrada.next();
        
        System.out.print("Digite apelido:");
        apelido = entrada.next();
        
        System.out.println(nome + " "+ apelido);
      }
    
}
