package org.dio;

public class Main {
    public static void main(String[] args) {
        Cliente felipe = new Cliente();
        felipe.setNome("felipe");

        Conta cc = new ContaCorrente(felipe);
        Conta poupanca = new ContaPoupanca(felipe);

        cc.depositar(200);
        cc.transferir(200, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}