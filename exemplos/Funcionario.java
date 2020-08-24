package exemplos;

public class Funcionario {

    protected String nome;
    private double salario;
    
   

    public Funcionario() { //contrutor default (eu não passo nenhum padrao)
        salario = 0 ; //não precisa porque quando cria um contrutor vem tudo zerado

    }

    // Overload, (sobre carga de metodos) pelo menos um parametro tem que ser diferente.
    public Funcionario(String nome, double salario){  // é um segundo construtor
        this.nome = nome;
        this.salario = salario;

    }
    
// convenção
// para obter o valor de um atributo, dou o nome para o  método
// iniciando com o get (para retornar alguma coisa)
// seguido do nome do atributo com uso do CamelCase
//Para alterar o valor de um atributo inicio o metodo com o nome set
// seguindo o nome do atributo com uso do CamelCase

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario (double salario){
        if(salario > 0){
            this.salario = salario;
        }
    }

    public String imprimir(){
        return "Funcionario" + nome + "salario: " + String.format("%.2f" , salario);
    }

    public void aumentarSalario (Double perc){
        // salario = salario + salario * perc;
        // salario = salario * (1 + perc);
        salario *= (1 + perc);
        }

}