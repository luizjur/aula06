package exemplos;

public class App {

    public static void main(String[] args) {

        Funcionario func1 = new Funcionario (); // cria um funcionario a partir de um modelo
        Funcionario func2 = new Funcionario ("Joao", 2000);
        Gerente ger1 = new Gerente("Carlos", 3000, 10); //eu tenho que utilizar três parametros porque no construtor tem três parametros


        func1.setNome ("Emerson");
        String nome = func1.getNome();
        System.out.println("Funcionario: " + nome);

    

        ger1.setNome ("PAduan");
        nome = ger1.getNome();
        System.out.println("Gerente: " + nome);


        func2.aumentarSalario(0.1);
        System.out.println(func2.imprimir());
        ger1.aumentarSalario(0.1);
        System.out.println(ger1.imprimir());
     
        
    }
    
}