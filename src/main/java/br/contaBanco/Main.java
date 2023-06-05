package br.contaBanco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        String agencia;

        System.out.println("Informe o número da sua conta:");
        conta.setNumeroConta(scan.nextInt());


        do {
            System.out.println("Informe o número da sua agência:");
            String agenciaCliente = scan.next();
            agencia = conta.validarAgencia(agenciaCliente);
        } while (agencia == "Valor inválido!");
            conta.setAgencia(agencia);

        System.out.println("Informe o seu nome:");
        conta.setNome_cliente(scan.next());

        System.out.println("Qual o valor que você deseja depositar para abrir a sua conta?");
        conta.setSaldo(scan.nextDouble());

        System.out.println("Olá " + conta.getNome_cliente() +", obrigada por criar uma conta em nosso banco, sua agência é " +
                "" + conta.getAgencia() + ", conta " + conta.getNumeroConta() + " e seu saldo de R$" + conta.getSaldo() + " já está " +
                "disponível para saque.");


    }}