package exercicios;

public class App6 {

    public static void main(String[] args) {

        Funcionario6 func6 = new Funcionario6 ("Jose", 40, 10);
        FuncionarioSenior funcSr = new FuncionarioSenior ("Joao", 40, 20, 10);
        
        //func6.setNome ("Jose");
        //String nome = func6.getNome();
               
        //funcSr.setNome ("Joao");
        //nome = funcSr.getNome();
        //System.out.println("Funcionario Senior: " + nome);
        
        
        System.out.println(func6.exibirDados());
        System.out.println(funcSr.exibirDados());

    }
    
}