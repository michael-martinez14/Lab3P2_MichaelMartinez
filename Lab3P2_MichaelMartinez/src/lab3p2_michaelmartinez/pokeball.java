/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_michaelmartinez;

/**
 *
 * @author Michael Martínez
 */
public class pokeball extends pokemon {
    
    String color;
    int serie;
    int eficiencia;

    public pokeball(String color, int serie, int eficiencia, String nombre, int numeroEntrada, String naturaleza, boolean atrapado, pokeball pokeball) {
        super(nombre, numeroEntrada, naturaleza, atrapado, pokeball);
        this.color = color;
        this.serie = serie;
        this.eficiencia = eficiencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(int eficiencia) {
        this.eficiencia = eficiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroEntrada() {
        return numeroEntrada;
    }

    public void setNumeroEntrada(int numeroEntrada) {
        this.numeroEntrada = numeroEntrada;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public boolean isAtrapado() {
        return atrapado;
    }

    public void setAtrapado(boolean atrapado) {
        this.atrapado = atrapado;
    }

    public pokeball getPokeball() {
        return pokeball;
    }

    public void setPokeball(pokeball pokeball) {
        this.pokeball = pokeball;
    }

    @Override
    public String toString() {
        return super.toString()+"pokeball{" + "color=" + color + ", serie=" + serie + ", eficiencia=" + eficiencia + '}';
    }
    
    
    
    
}
