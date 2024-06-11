package desafio.praxis.clase30;

import java.util.ArrayList;

public class Marcas {
    public static void main(String[] args) {

        ArrayList<String> marcas = new ArrayList<>();

        marcas.add("Rinso");
        marcas.add("Econo");
        marcas.add("Pelayo");
        marcas.add("Yupi");
        marcas.add("Klenzo");
        marcas.add("Cerelac");
        marcas.add("Dos en Uno");
        marcas.add("Kodak");
        marcas.add("Srenito");
        marcas.add("Chiclets");

        System.out.println(marcas);

        marcas.add("Blokbaster");
        marcas.add("Carrefor");
        marcas.add("Jetix");

        System.out.println(marcas);

        marcas.set(10, "Blokbuster");

        System.out.println(marcas);

        marcas.remove(11);
        System.out.println(marcas.remove("Carrefor"));

        ArrayList<String> posiblesMarcas = new ArrayList<>();

        posiblesMarcas.add("Peta Zetas");
        posiblesMarcas.add("Hilton");
        posiblesMarcas.add("Odontine");

        marcas.addAll(posiblesMarcas);

        System.out.println(marcas);

        System.out.println(marcas.size());




    }



}
