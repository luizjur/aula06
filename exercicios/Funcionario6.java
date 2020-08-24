package exercicios;


public class Funcionario6 {

        public Funcionario6(String nome, double qtdHora, double valorHora){  // é um segundo construtor
        this.nome = nome;
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;

    private String nome;
    private double valorHora;
    private double qtdHora;
    private double salario;

   


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    {

    public void setSalario (double salario){
        if(salario > 0){
        this.salario = salario;
        }
    }

    public double getqtdHora() {
        return qtdHora;
    }

    public void setqtdHora (double qtdHora){
        if(qtdHora > 0){
            this.qtdHora = qtdHora;
        }
    }

     public double getvalorHora() {
        return valorHora;
    }

    public void setvalorHora (double valorHora){
        if(valorHora > 0){
            this.valorHora = valorHora;
        }
    }

    public double calculaSalario(){
        salario = qtdHora * valorHora;
        return salario;
    }

    public String exibirDados(){
        return "Funcionario:" + nome + "\Horas trabalhadas: " + qtdHoras + "\Valor hora: " + valorHora + "salario: " + salario();
    }

}