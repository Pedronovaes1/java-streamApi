package functional;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SuplierExample {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá, seja bem vindo";

        //usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .collect(Collectors.toList());

        //imprimir saudações
        listaSaudacoes.forEach(System.out::println);
    }
}
