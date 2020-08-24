package exemplos;

import java.util.ArrayList;

public class Array2 {

    public static void main(String[] args) {
        
ArrayList<Integer> numeros = new ArrayList<>();
int soma = 0;
int numeroProcurado = 20;

//System.out.println(nomes);

numeros.add(10);
numeros.add(20);
numeros.add(30);
numeros.add(5);

System.out.println(numeros);

for (int i = 0 ; i < numeros.size(); i++){
    soma = soma +numeros.get(i);
   
}

System.out.println("soma = " + soma);

achou = false;
    for (int i = 0 ; i < numeros.size(); i++){
        if (numeros.get(i) == numeroProcurado {
        achou = true;
    
        }

    }

    if (achou) {}
    
}