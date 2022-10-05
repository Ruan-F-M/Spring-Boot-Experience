package Aplicacao;

import model.Cliente;
import model.Endereco;
//import java.util.ArrayList;

public class EntregaCartaoApp {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "0000000";
        // dados do endereço

        Cliente cliente = new Cliente();
        /* dados do cliente
        if (cliente.enderecos == null) {
            cliente.enderecos = new ArrayList<Endereco>();
        }
        cliente.enderecos.add(endereco);
        cliente.getEnderecos().add(endereco);
         */
        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereco adicionado com sucesso!");
        } catch (Exception e) {
            System.err.println("Houve um erro ao adcionar endereco: " + e.getMessage());
        }



    }


}
