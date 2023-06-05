package br.contaBanco;

import org.jetbrains.annotations.NotNull;

public class ContaTerminal {
    private int numeroConta;

    private String agencia;

    private String nome_cliente;

    private double saldo;

    public String validarAgencia(@NotNull String agencia){
        if (agencia.length() < 5) {
            StringBuilder agenciaFormatada = new StringBuilder();
            String c = "";
            for (int i = 0; i <= 3; i++) {
                if (i <= 2) {
                    c = String.valueOf(agencia.charAt(i));
                    agenciaFormatada.append(c);
                } else {
                    c = String.valueOf(agencia.charAt(i));
                    agenciaFormatada.append("-").append(c);
                    agencia = agenciaFormatada.toString();
                    System.out.println(agencia);
                }}
        } else {return "Valor inválido!";
        }
        return agencia;
    }


    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int conta) {
        this.numeroConta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
