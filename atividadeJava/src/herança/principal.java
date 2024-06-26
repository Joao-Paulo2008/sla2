/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package herança;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class principal {


    public static void main(String[] args) {

        chefe gerente = new chefe();
        gerente.setNome("Carlos Vieira");
        gerente.setSalario(3000.58);
        gerente.setUsuario("carlos.vieira");
        gerente.setSenha("5523");

        funcionario funcionario = new funcionario();
        funcionario.setNome("Pedro Castelo");
        funcionario.setSalario(1500);

        recepcionista telefonista = new recepcionista();
        telefonista.setNome("Luana Brana");
        telefonista.setSalario(1300.00);
        telefonista.setEstacaoDeTrabalho(20);

        secretaria secretaria = new secretaria();
        secretaria.setNome("Maria Ribeiro");
        secretaria.setSalario(1125.25);
        secretaria.setRamal(5);

        System.out.println("##### Gerente #####");
        System.out.println("Nome.: "+gerente.getNome());
        System.out.println("Salário.: "+gerente.getSalario());
        System.out.println("Usuário.: "+gerente.getUsuario());
        System.out.println("Senha.: "+gerente.getSenha());
        System.out.println("Bonificação.: "+gerente.calculaBonificacao());
        System.out.println();

        System.out.println("##### Funcionário #####");
        System.out.println("Nome.: "+funcionario.getNome());
        System.out.println("Salário.: "+funcionario.getSalario());
        System.out.println("Bonificação.: "+funcionario.calculaBonificacao());
        System.out.println();

        System.out.println("##### Telefonista #####");
        System.out.println("Nome.: "+telefonista.getNome());
        System.out.println("Salário.: "+telefonista.getSalario());
        System.out.println("Estação de Trabalho.: "+telefonista.getEstacaoDeTrabalho());
        System.out.println("Bonificação.: "+telefonista.calculaBonificacao());
        System.out.println();

        System.out.println("##### Secretária #####");
        System.out.println("Nome.: "+secretaria.getNome());
        System.out.println("Salário.: "+secretaria.getSalario());
        System.out.println("Ramal.: "+secretaria.getRamal());
        System.out.println("Bonificação.: "+secretaria.calculaBonificacao());
        System.out.println();
    }

}

