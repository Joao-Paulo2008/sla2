
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class cachorro {

 private String raca;
 private String cor;
 private String porte;
 private int idade;
 private String sexo;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public boolean comer(int qtd){
        
        if (qtd >= 4) {
            
            JOptionPane.showMessageDialog(null, "seu cachorro da raça " +this.raca+" que tem "+this.idade+" anos"+ " com o porte "+this.porte+" comeu o suficiente");
            
            return true;
            
        } else {
            
            JOptionPane.showMessageDialog(null, "seu cachorro da raça " +this.raca+ " que tem "+this.idade+" anos"+ " com o porte "+this.porte+ " tá com fome chega que tá esqui, tem que comer mais "+(4-qtd)+" vezes");
            
            return false;
        }
        
        
    }
    
}
