/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package heranca;

import javax.swing.JOptionPane;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class casa {
 public static void main(String[] args) {
        
        heranca en = new heranca();
        
        String cor;
     String bairro;
    String cidade;
      String dono;
      float preco;
      int idade;
        
        
        
    cor = JOptionPane.showInputDialog("Qual a cor da casa?");
    en.setCor(cor);
     bairro = JOptionPane.showInputDialog("Qual o bairro que a casa se encontra?");
     en.setBairro(bairro);
     cidade = JOptionPane.showInputDialog("Qual a cidade?");
     en.setCidade(cidade);
     dono = JOptionPane.showInputDialog("Qual o dono?");
     en.setDono(dono);
     idade = Integer.parseInt(JOptionPane.showInputDialog("quantos anos tem a casa?"));
     en.setIdade(idade);
     preco = Float.parseFloat(JOptionPane.showInputDialog("Qual o preco da casa?"));
     en.setPreco(preco);
     en.status();
    }
}
