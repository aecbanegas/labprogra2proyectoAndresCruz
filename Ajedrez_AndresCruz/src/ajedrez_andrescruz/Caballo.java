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
        for(int i =super.getPosX()-2; i<= super.getPosX()+2; i=i+4){
            if(i >= 0 && i < 8){
                for(int j=super.getPosY()-1; j<= super.getPosY()+1; j=j+2){
                    if(j > 0 && j < 8){
                        if(!Matriz[j][i].getColor().equals(super.getColor())){
                            posiciones.add(new Posicion(j, i));
                        }
                    }
                }
            }
        }        
        for(int i =super.getPosY()-2; i<= super.getPosY()+2; i=i+4){
            if(i >= 0 && i < 8){
                for(int j=super.getPosX()-1; j<= super.getPosX()+1; j=j+2){
                    if(j > 0 && j < 8){
                        if(!Matriz[i][j].getColor().equals(super.getColor())){
                            posiciones.add(new Posicion(i, j));
                        }
                    }
                }
            }
        }
        return posiciones;
    }
    
}
