package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class teste {

    public static void main(String[] args) {

        System.out.println("x");
        System.out.println(3);
        System.out.println(false);

        ContaCorrente cc = new ContaCorrente(22,33);
        ContaPoupanca cp = new ContaPoupanca(33,22);
        Cliente cliente = new Cliente();

        System.out.println(cc);
        System.out.println(cp);

        Println();
    }

    private static void Println() {}
    static void println(int a) {}
     static void printls(boolean valor){}

    static void println(Object referencia) {

    }
}
