/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p1_diegodiaz;

/**
 *
 * @author diego
 */
public class Nave {
    
    public String nombre;
    public String tipo;
    public int vida;
    public int escudo;
    public int poderAtaque;
    public int velocidad;

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVida() {
        return vida;
    }

    public int getEscudo() {
        return escudo;
    }

    public int getPoderAtaque() {
        return poderAtaque;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public void setPoderAtaque(int poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Nave: " +  nombre + 
                "| tipo: " + tipo + 
                "| vida: " + vida + 
                "| escudo: " + escudo + 
                "| poderAtaque: " + poderAtaque + 
                "| velocidad: " + velocidad;
    }

    public Nave(String nombre, String tipo, int vida, int escudo, int poderAtaque, int velocidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.escudo = escudo;
        this.poderAtaque = poderAtaque;
        this.velocidad = velocidad;
    }
    
    
    
}

