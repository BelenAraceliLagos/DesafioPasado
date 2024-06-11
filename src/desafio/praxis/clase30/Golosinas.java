package desafio.praxis.clase30;

import java.util.Map;
import java.util.TreeMap;

public class Golosinas {
    public static void main(String[] args) {

        Map<String, Integer> golosinas = new TreeMap<>();

        golosinas.put("Chocman", 100);
        golosinas.put("Trululu", 100);
        golosinas.put("Centella", 100);
        golosinas.put("Kilate", 50);
        golosinas.put("Miti-Miti", 30);
        golosinas.put("Traga-Traga", 150);
        golosinas.put("Tableton", 5);

        System.out.println(golosinas);

        for (Map.Entry<String, Integer> entry : golosinas.entrySet()) {
            if (entry.getValue() < 100) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " pesos");
            }
        }
    }
}
