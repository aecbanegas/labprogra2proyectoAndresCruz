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
public class Caballo extends Pieza{

    public Caballo( String color,int X,int Y) {
        super("Caballo", color,X,Y);
    }

    @Override
    public ArrayList<Posicion> posiblesMovimientos(Pieza[][] Matriz) {
        ArrayList<Posicion> posiciones = new ArrayList();                
        return posiciones;
    }
    
}
