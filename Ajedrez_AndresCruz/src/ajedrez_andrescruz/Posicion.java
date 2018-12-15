/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez_andrescruz;

/**
 *
 * @author MBanegas
 */
public class Posicion {
    int X;
    int Y;

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public Posicion(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    @Override
    public String toString() {
        return "Posicion{" + "X=" + X + ", Y=" + Y + '}';
    }
    
}
