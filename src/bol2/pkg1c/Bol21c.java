/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2.pkg1c;

import java.util.Scanner;

/**
 *
 * @author plagoromani
 */
public class Bol21c {

    
    public static void main(String[] args) {
        //entrada por teclado
        float base,altura;
        Scanner obx = new Scanner(System.in);
        System.out.println("teclea base :");
        base = obx.nextFloat();
        System.out.println("teclea altura :");
        altura = obx.nextFloat (); 
        System.out.println("area = "+ base*altura/2);
    
    }
    
}
