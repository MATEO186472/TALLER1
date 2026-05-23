package persistencia;

import modelo.PartidoPadel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorPadelTexto {

    private final String archivo = "partidos.txt";

    public void guardar(List<PartidoPadel> partidos) {

        try {

            BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter(archivo));

            for (PartidoPadel p : partidos) {

                bw.write(
                        p.getPareja1() + "," +
                        p.getPareja2() + "," +
                        p.getMarcador()
                );

                bw.newLine();
            }

            bw.close();

            System.out.println("Archivo .txt guardado");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }

    public List<PartidoPadel> cargar() {

        List<PartidoPadel> partidos = new ArrayList<>();

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader(archivo));

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                PartidoPadel p =
                        new PartidoPadel(
                                datos[0],
                                datos[1],
                                datos[2]
                        );

                partidos.add(p);
            }

            br.close();

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }

        return partidos;
    }
}