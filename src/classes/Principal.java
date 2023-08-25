package classes;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {

        ////////////////////////////////////////////////////////////////
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> numerosPares = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        numeros.forEach(numerosPares);

        ////////////////////////////////////////////////////////////////
        
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).toList();

        listaSaudacoes.forEach(System.out::println);

        ////////////////////////////////////////////////////////////////
        
        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros2.stream().map(n -> n * 2).toList();

        numerosDobrados.forEach(System.out::println);

        ////////////////////////////////////////////////////////////////
        
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);

        ////////////////////////////////////////////////////////////////
        
        List<Integer> numeros3 = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> somar = Integer::sum;

        int resultado = numeros.stream().reduce(0, Integer::sum);

        System.out.println("A soma dos números é: " + resultado);

    }

}
