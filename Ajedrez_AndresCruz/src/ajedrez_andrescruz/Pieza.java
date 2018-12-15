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
    Posicion pos;
    public Pieza(String nombre, String color,int X,int Y) {
        this.nombre = nombre;
        this.color = color;
        pos=new Posicion(X, Y);
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
    
        public void setPosX(int pos){
        this.pos.setX(pos);
    }
        
    public int getPosX(){
        return this.getPosicion().getX();
    }
    
    public void setPosY(int pos){
        this.pos.setY(pos);
    }
    
    public int getPosY(){
        return this.getPosicion().getY();
    }
    
     public Posicion getPosicion() {
        return pos;
    }
     
    public abstract ArrayList<Posicion> posiblesMovimientos(Pieza[][] Matriz);
    
    public ImageIcon getIcon() {
        if (!nombre.equals("") && !color.equals("")) {            
            return new ImageIcon(getClass().getResource("/imagenes/" + nombre + color + ".png"));            
        } else {
            return new ImageIcon("AlfilBlanco.png");
        }
    }
}
