package com.example.unidades;

import java.util.HashSet;
import java.util.Set;

public class Unidades {

    //---------------------------------------------------//
    //--------------------ATRIBUTOS----------------------//

    static int Unidades[] = {7, 77,21, 28, 48, 42, 49, 56, 62, 70};

    //-------------------------------------------------------------------------------------------//
    //------------------------------------------MAIN---------------------------------------------//

    public static void  main( String[] args){

        Set<Integer> unidades = new HashSet<>();

        for (int n=0; n< Unidades.length; n++){
            unidades.add(Unidades[n]%10);
        }
        System.out.println(unidades.toString());
    }
}