package aula4;

public class ContaCorrente {

    String titular;
    double saldo;
    int numeroConta;

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        } else {
            System.out.println("Erro: Valor inválido.");
        }
    }

    public void sacar(double valor){
        if(valor > 0 && saldo >= valor){
            this.saldo -= valor;
        } else {
            System.out.println("Erro: Não é possível realizar o saldo.");
        }
    }

    public void transferir(ContaCorrente destino, double valor){
        if(valor > 0 && valor <= this.saldo){
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Erro: Depósito inválido.");
        }
    }

    public void getSaldo(){
        System.out.println("Titular: " + this.titular);
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
    }

}
