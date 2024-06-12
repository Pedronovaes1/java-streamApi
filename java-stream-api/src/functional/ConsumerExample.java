package functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ConsumerExample {
    public static void main(String[] args) {
        //Craindo lista de números
        List<Integer> numero = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //usar o consumer para imprimir números pares no Stream
        Consumer<Integer> imprimirNumeroPar = n ->{
            if(n % 2 ==0){
                System.out.println(n);
            }
        };

        numero.stream().filter(n -> n % 2 == 0).forEach(imprimirNumeroPar);

    }
}