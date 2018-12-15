/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez_andrescruz;

import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author MBanegas
 */
public class Peon extends Pieza{

    boolean primermovimiento;
    private Posicion posInicial;
    
    public Peon( String color,int X,int Y) {
        super("Peon", color,X,Y);
        posInicial=new Posicion(X,Y);
        primermovimiento=true;
    }

    public boolean isPrimermovimiento() {
        return primermovimiento;
    }

    public void setPrimermovimiento(boolean primermovimiento) {
        this.primermovimiento = primermovimiento;
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

    public Posicion getPos() {
        return pos;
    }

    public void setPos(Posicion pos) {
        this.pos = pos;
    }

    public Posicion getPosInicial() {
        return posInicial;
    }

    public void setPosInicial(Posicion posInicial) {
        this.posInicial = posInicial;
    }
            
    @Override
    public ArrayList<Posicion> posiblesMovimientos(Pieza[][] Matriz) {
        ArrayList<Posicion> posiciones = new ArrayList();
        
        return posiciones;
    }
    
}
