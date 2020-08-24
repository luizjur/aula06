package exemplos;

public class Gerente extends Funcionario { // estou forçando uma herança da classe funcionario
    private int numFuncionarios; // numero de funcionarios
    private double bonus;

    public Gerente(String nome, double salario, int numFuncionarios) {
        super(nome, salario); // chama o contrutur da classe base,
        // só uso o super para chamar alguma coisa na class pai, no caso Funcionario.
        this.numFuncionarios = numFuncionarios;
    }

    public int getNumFuncionarios() { // en geral o metodo é publico
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        if (numFuncionarios > 0) {
            this.numFuncionarios = numFuncionarios;
        }
    }

    @Override
    public String imprimir() {
        /*
         * forma 1: acesso diretamente um dado protected, e um metodo publico e um
         * metodo local
         */
        // return "Funcionario" + nome + "salario: " + getSalario() + "numFunc" +
        // numFuncionarios;

        /*
         * forma2: utilizar o metodo da classe base e editar o que for diferente
         */
        return super.imprimir() + " numFunc: " + numFuncionarios + " bonus: " + bonus;
    }

    @Override
    public void aumentarSalario(double perc){
        //solução 1
        super.aumentarSalario(perc + 0.2);

        //solução 2, bonus para o mês do aumento
        bonus = getSalario() * 0.2;
        super.aumentarSalario(perc);
    }

    
    
}
