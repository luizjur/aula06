package exemplos;

import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {
        
ArrayList<String> nomes = new ArrayList<>();

//System.out.println(nomes);

nomes.add("Jurandi");
nomes.add("Luiz");
nomes.add("Silva");

System.out.println(nomes);

for (int i = 0 ; i < nomes.size(); i++){
    System.out.println(nomes.get(i));

}


    }
    
}