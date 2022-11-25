package Desafio2.PacoteControle;

import Desafio2.PacoteModelo.Cliente;
import Desafio2.PacoteModelo.Veiculo;

public class Principal {
    public static void main(String[] args){
    Cliente user = new Cliente();
    Veiculo carro = new Veiculo();

    user.setNome("Chico Nabudonosor Anísio");
    System.out.println("Nome: " + user.getNome());
    user.setCpf("328.123.647-10");
    System.out.println("CPF: " + user.getCpf());
    user.setEmail("Chicotudo@gmail.com");
    System.out.println("Email: " + user.getEmail());
    user.setEndereco("Rua 1 do lado da Rua 2");
    System.out.println("Endereço: " + user.getEndereco());
    user.setFone(998371238);
    System.out.println("Telefone: " + user.getFone());
    System.out.println("-------------------------------");
    carro.setFabricante("Toyota");
    System.out.println("Fabricante do Veiculo: " + carro.getFabricante());
    carro.setModelo("Corolla 2.0 Altis Premium CVT");
    System.out.println("Modelo: " + carro.getModelo());
    carro.setPlaca("POC-4769");
    System.out.println("Placa: " + carro.getPlaca());
    carro.setCor("Branco");
    System.out.print("Cor: " + carro.getCor());
    carro.setAno(2023);
    System.out.println("   || Ano: " + carro.getAno());
    }
}