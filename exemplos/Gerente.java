package exemplos;

public class Gerente extends Funcionario{  //estou forçando uma herança da classe funcionario
    private int numFuncionarios;  //numero de funcionarios

    public Gerente(String nome, double salario, int numFuncionarios){
        super(nome, salario); // chama o contrutur da classe base, 
        //só uso o super para chamar alguma coisa na class pai, no caso Funcionario.
        this.numFuncionarios = numFuncionarios;
    }

    public int getNumFuncionarios() { // en geral o metodo é publico
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios){
        if (numFuncionarios > 0 ) {
            this.numFuncionarios = numFuncionarios;    
        }
        
    }
    
}
    
