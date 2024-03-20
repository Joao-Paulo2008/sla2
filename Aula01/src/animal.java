
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class animal {

    public static void main(String[] args) {
       
        
        cachorro c = new cachorro();
        
        int x;
        String raca;
        int idade;
        String porte;
        
        
        
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do cachorro?"));
        c.setIdade(idade);
        
        porte = JOptionPane.showInputDialog("Qual o porte do seu cachorro?(PEQUENO-MEDIO-GRANDE)");
        c.setPorte(porte);
        
        
        raca = JOptionPane.showInputDialog("Qaul a raca do cahorro?");
        c.setRaca(raca);
        
        
       x = Integer.parseInt( JOptionPane.showInputDialog("seu cachorro comeu quantas vezes? "));
       c.comer(x); 
        
    }
    
    
}
