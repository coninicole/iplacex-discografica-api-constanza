package com.example.discografica.artistas;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "artistas")
public class Artista {

    @Id
    public String id; // Modificador public como pide la pauta
    public String nombre;
    public List<String> estilos;
    public int anioFundacion;
    public boolean estaActivo;

    // Constructor vacío
    public Artista() {
    }

    // Constructor con parámetros
    public Artista(String nombre, List<String> estilos, int anioFundacion, boolean estaActivo) {
        this.nombre = nombre;
        this.estilos = estilos;
        this.anioFundacion = anioFundacion;
        this.estaActivo = estaActivo;
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<String> getEstilos() { return estilos; }
    public void setEstilos(List<String> estilos) { this.estilos = estilos; }

    public int getAnioFundacion() { return anioFundacion; }
    public void setAnioFundacion(int anioFundacion) { this.anioFundacion = anioFundacion; }

    public boolean isEstaActivo() { return estaActivo; }
    public void setEstaActivo(boolean estaActivo) { this.estaActivo = estaActivo; }
}