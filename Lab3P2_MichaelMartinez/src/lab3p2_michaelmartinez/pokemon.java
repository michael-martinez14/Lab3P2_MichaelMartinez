/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_michaelmartinez;

/**
 *
 * @author Michael Martínez
 */
public class pokemon {
    public String nombre;
    public int numeroEntrada;
    public String naturaleza;
    public boolean atrapado;
    public pokeball pokeball;

    public pokemon(String nombre, int numeroEntrada, String naturaleza, boolean atrapado, pokeball pokeball) {
        this.nombre = nombre;
        this.numeroEntrada = numeroEntrada;
        this.naturaleza = naturaleza;
        this.atrapado = atrapado;
        this.pokeball = pokeball;
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
        return "Pokemon || " + "Nombre: " + nombre + " | NumeroEntrada: " + numeroEntrada + " | Naturaleza: " + naturaleza + " | Atrapado: " + atrapado + " | Pokeball || " + pokeball+ " || ";
    }
    
    
}
