package exemplos;

public class App {

    public static void main(String[] args) {

        Funcionario func1 = new Funcionario (); // cria um funcionario a partir de um modelo
        Funcionario func2 = new Funcionario ("Joao", 2000);
        Gerente ger1 = new Gerente("Carlos", 3000, 10); //eu tenho que utilizar três parametros porque no construtor tem três parametros


        func1.setNome ("Emerson");
        String nome = func1.fetNome();
        System.out.println("Funcionario: " + nome);

    

        ger1.setName ("PAduan");
        nome = ger1.getName();
        System.out.println("Gerente: " + nome);



        System.out.pritnln("Func 2:" + func2.getNome());

     
        
    }
    
}