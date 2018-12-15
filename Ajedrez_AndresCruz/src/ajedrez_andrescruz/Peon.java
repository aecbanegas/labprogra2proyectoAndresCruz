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
        try{            
            if(this.getPosInicial().getX() == 6){               
                for(int i=super.getPosY()-1; i<= super.getPosY()+1; i++){                    
                    if(i>= 0 && i<8){                        
                        if(Matriz[super.getPosX()-1][i] == null){
                            if(super.getPosY() == i){
                                posiciones.add(new Posicion(super.getPosX()-1,i));
                            }
                        }else if(i != super.getPosY() && !(Matriz[super.getPosY()-1][i].getColor().equals(super.getColor()))){
                            posiciones.add(new Posicion(super.getPosX()-1,i));
                        }
                    }
                }               
                if(this.isPrimermovimiento() == true && Matriz[super.getPosY()][super.getPosX()-2]==null){
                    posiciones.add(new Posicion(super.getPosY(), super.getPosX()-2));
                }
            }else{                
                for(int i=super.getPosY()-1; i<= super.getPosY()+1; i++){
                    if(i>= 0 && i<8){
                        if(Matriz[super.getPosX()+1][i] == null){
                            if(super.getPosY() == i){
                                posiciones.add(new Posicion(super.getPosX()+1,i));
                            }
                        }else if(i != super.getPosY() && !(Matriz[super.getPosY()+1][i].getColor().equals(super.getColor()))){
                            posiciones.add(new Posicion(super.getPosX()+1,i));
                        }
                    }
                }
                if(this.isPrimermovimiento() == true && Matriz[super.getPosY()+2][super.getPosX()] == null){
                    posiciones.add(new Posicion(super.getPosY(), super.getPosX()+2));
                }
            }
        }catch(Exception e){
            System.err.println("error en peon");
            e.printStackTrace();
        }
        return posiciones;
    }
    
}
