/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez_andrescruz;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author MBanegas
 */
public abstract class Pieza {

    String nombre;
    String color;

    public Pieza(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract ArrayList posiblesMovimientos(JButton[][] Matriz);
    
    public ImageIcon getIcon() {
        if (!nombre.equals("") && !color.equals("")) {            
            return new ImageIcon(getClass().getResource("/imagenes/" + nombre + color + ".png"));            
        } else {
            return new ImageIcon("AlfilBlanco.png");
        }
    }
}
