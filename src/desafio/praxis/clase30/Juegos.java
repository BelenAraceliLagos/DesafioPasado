package desafio.praxis.clase30;

import java.util.LinkedList;
import java.util.Queue;

public class Juegos {
    public static void main(String[] args) {

        Queue<String> juegos = new LinkedList<>();

        juegos.add("Tombo");
        juegos.add("Congelado");
        juegos.add("Quemaditas");
        juegos.add("Cachipun");
        juegos.add("Pillarse");

        System.out.println(juegos.size());


    }
}
