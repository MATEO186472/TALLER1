package main;

import modelo.PartidoPadel;
import persistencia.GestorPadelBinaria;
import persistencia.GestorPadelTexto;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<PartidoPadel> partidos =
                new ArrayList<>();

        partidos.add(
                new PartidoPadel(
                        "Juan/Carlos",
                        "Pedro/Luis",
                        "6-4 7-5"
                )
        );

        partidos.add(
                new PartidoPadel(
                        "Ana/Maria",
                        "Laura/Sofia",
                        "6-3 6-2"
                )
        );

        // BINARIO
        GestorPadelBinaria binario =
                new GestorPadelBinaria();

        binario.guardar(partidos);

        List<PartidoPadel> listaBinaria =
                binario.cargar();

        System.out.println("\nDESDE .DAT");

        for (PartidoPadel p : listaBinaria) {

            System.out.println(p);
        }

        // TEXTO
        GestorPadelTexto texto =
                new GestorPadelTexto();

        texto.guardar(partidos);

        List<PartidoPadel> listaTexto =
                texto.cargar();

        System.out.println("\nDESDE .TXT");

        for (PartidoPadel p : listaTexto) {

            System.out.println(p);
        }
    }
}