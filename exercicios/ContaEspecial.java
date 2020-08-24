package exercicios;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, double limite){
        super(numero);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && getSaldo() + limite >= valor) {
            return super.sacar(valor);
        }else{
            return false;
        }
    }
}