package com.example.unidades;

public class Punto {

    //----------------------------------------------------//
    //----------------------ATRIBUTOS---------------------//

    private double x;
    private double y;

    //-------------------------------------------------------------------------------------------//
    //-----------------------------------CONSTRUCTOR---------------------------------------------//

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //-------------------------------------------------------------------------------------------//
    //-----------------------------------GETTERS & SETTERS---------------------------------------//

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


}
