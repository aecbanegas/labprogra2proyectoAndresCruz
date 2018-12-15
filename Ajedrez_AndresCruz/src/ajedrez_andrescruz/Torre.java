/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez_andrescruz;

import java.util.ArrayList;

/**
 *
 * @author MBanegas
 */
public class Torre extends Pieza{

    public Torre( String color,int X,int Y) {
        super("Torre", color,X,Y);
    }

    @Override
    public ArrayList<Posicion> posiblesMovimientos(Pieza[][] Matriz) {
        ArrayList<Posicion> posiciones = new ArrayList();
        for(int i=super.getPosX()+1; i<8; i++){ 
            try{
                if(Matriz[i][super.getPosY()]!=null){
                    if(!Matriz[i][super.getPosY()].getColor().equals(super.getColor())){
                        posiciones.add(new Posicion(i, super.getPosY()));
                    }
                    break;
                }else {
                    posiciones.add(new Posicion(i, super.getPosY()));
                }
            }catch(Exception e){
            System.err.println("error en reina");
                    e.printStackTrace();
            }
        }        
        for(int i=super.getPosX()-1; i>=0 ; i--){ 
            try{
                if(Matriz[i][super.getPosY()]!=null){
                    if(!Matriz[i][super.getPosY()].getColor().equals(super.getColor())){
                        posiciones.add(new Posicion(i, super.getPosY()));
                    }
                    break;
                }else {
                    posiciones.add(new Posicion(i, super.getPosY()));
                }
            }catch(Exception e){
            System.err.println("error en reina");
                    e.printStackTrace();
            }
        }        
        for(int i=super.getPosY()+1; i<8; i++){ 
            try{
                if((Matriz[super.getPosX()][i]!=null)){
                    if((!Matriz[super.getPosX()][i].getColor().equals(super.getColor()))){
                        posiciones.add(new Posicion(super.getPosX(), i));
                    }
                    break;
                }else {
                    posiciones.add(new Posicion(super.getPosX(), i));
                }
            }catch(Exception e){
            System.err.println("error en reina");
                    e.printStackTrace();
            }
        }
        for(int i=super.getPosY()-1; i>=0; i--){ 
            try{
                if(Matriz[super.getPosX()][i]!=null){
                    if((!Matriz[super.getPosX()][i].getColor().equals(super.getColor()))){
                        posiciones.add(new Posicion(super.getPosX(), i));
                    }
                    break;
                }else {
                    posiciones.add(new Posicion(super.getPosX(), i));
                }
            }catch(Exception e){
            System.err.println("error en reina");
                    e.printStackTrace();
            }
        }
        return posiciones;
    }
    
}
