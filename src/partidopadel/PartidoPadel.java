package modelo;

import java.io.Serializable;

public class PartidoPadel implements Serializable {

    private String pareja1;
    private String pareja2;
    private String marcador;

    public PartidoPadel(String pareja1, String pareja2, String marcador) {
        this.pareja1 = pareja1;
        this.pareja2 = pareja2;
        this.marcador = marcador;
    }

    public String getPareja1() {
        return pareja1;
    }

    public String getPareja2() {
        return pareja2;
    }

    public String getMarcador() {
        return marcador;
    }

    @Override
    public String toString() {
        return pareja1 + " vs " + pareja2 + " -> " + marcador;
    }
}
