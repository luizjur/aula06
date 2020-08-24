package exercicios;

public class ContaCorrente extends Conta {
    final double TAXA_DEPOSITO = 0.10;

    public ContaCorrente(int numero){
        super(numero);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor - TAXA_DEPOSITO);
    }

    @Override
    public boolean sacar(double valor) {
        if(valor > 0 && getSaldo() >= valor){
            return super.sacar(valor);
        }else{
            return false;
        }
    }
}