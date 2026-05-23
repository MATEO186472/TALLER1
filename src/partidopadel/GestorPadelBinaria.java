package persistencia;

import modelo.PartidoPadel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorPadelBinaria {

    private final String archivo = "partidos.dat";

    public void guardar(List<PartidoPadel> partidos) {

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream(archivo));

            oos.writeObject(partidos);

            oos.close();

            System.out.println("Archivo .dat guardado");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }

    public List<PartidoPadel> cargar() {

        List<PartidoPadel> partidos = new ArrayList<>();

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream(archivo));

            partidos = (List<PartidoPadel>) ois.readObject();

            ois.close();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }

        return partidos;
    }
}
