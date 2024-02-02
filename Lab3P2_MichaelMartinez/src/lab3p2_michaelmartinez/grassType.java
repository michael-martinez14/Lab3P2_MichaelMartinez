/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_michaelmartinez;

/**
 *
 * @author Michael Martínez
 */
public class grassType extends pokemon {
    
    String habitat;
    int dominio;

    public grassType(String habitat, int dominio, String nombre, int numeroEntrada, String naturaleza, boolean atrapado, lab3p2_michaelmartinez.pokeball pokeball) {
        super(nombre, numeroEntrada, naturaleza, atrapado, pokeball);
        this.habitat = habitat;
        this.dominio = dominio;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getDominio() {
        return dominio;
    }

    public void setDominio(int dominio) {
        this.dominio = dominio;
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

    public lab3p2_michaelmartinez.pokeball getPokeball() {
        return pokeball;
    }

    public void setPokeball(lab3p2_michaelmartinez.pokeball pokeball) {
        this.pokeball = pokeball;
    }

    @Override
    public String toString() {
        return super.toString()+"grassType{" + "habitat=" + habitat + ", dominio=" + dominio + '}';
    }
    
    
}
