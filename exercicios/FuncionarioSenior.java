package exercicios;

public class FuncionarioSenior extends Funcionario6{
    public double bonus;
    
    public FuncionarioSenior (String nome, double qtdHoras; double valorHoas, double bonus)
    super(nome, qtdHoras, valoHoras);
    this.bonus = bonus;
   
    @Override
    public double salario(){
        double valorBonus = bonus * (getHora()%/10); //a cada 10 horas completas tem um bonos
        setSalario(getqtdHoras() * getvalorHora()) + valorBonus;
        return getSalario();
    }

    
}