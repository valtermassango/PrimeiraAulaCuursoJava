/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.e.aula5;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Valter Massango
 */
public class Exercicio3 {
    public static void main (String[]args){
        //declaração de variáveis
        String nome, ocupacao;
        int AnoDeNascimento;
        
        //Entrada de dados
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome:");
        nome = entrada.next();
        
        System.out.print("Digite sua ocupação:");
        ocupacao = entrada.next();
        
        System.out.print("Digite o seu ano de nascimento:");
        AnoDeNascimento=Integer.parseInt(entrada.next()); 
        
        JOptionPane.showMessageDialog(null,"Eu chamo me " + nome + ", sou " + ocupacao + " e tenho " + (2019-AnoDeNascimento) );
    }
}
