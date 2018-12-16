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
public class Rey extends Pieza{

    public Rey(String color,int X,int Y) {
        super("Rey", color,X,Y);
    }

    @Override
    public ArrayList<Posicion> posiblesMovimientos(Pieza[][] Matriz) {
        ArrayList<Posicion> posiciones = new ArrayList();
        for(int i=super.getPosX()-1; i<=super.getPosX()+1; i++){
            for(int j=super.getPosY()-1; j<=super.getPosY()+1; j++){                 
                if(i != super.getPosX() || j != super.getPosY()){
                    try{                        
                        if(!Matriz[i][j].getColor().equals(super.getColor())){
                            posiciones.add(new Posicion(i, j)); 
                        }
                    }catch(Exception e){
                        posiciones.add(new Posicion(i, j));
                    }
                }
            }
        }
        return posiciones;
    }
    
}
