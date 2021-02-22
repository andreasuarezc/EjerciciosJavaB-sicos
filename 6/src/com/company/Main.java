package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    int x;
        ArrayList<Integer> par = new ArrayList<Integer>();
        ArrayList<Integer> impar = new ArrayList<Integer>();
        for(x=0; x<=100; x++){
            if (x%2 ==0){
                par.add(x);
            }else{
                impar.add(x);
            }
        }
        System.out.println("La lista de números par es:");
        System.out.println(par);
        System.out.println("La lista de npuemros impar es");
        System.out.println(impar);
    }
}
