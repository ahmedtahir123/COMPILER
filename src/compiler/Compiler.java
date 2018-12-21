/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author FCC
 */
public class Compiler {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
   
    public static void main(String[] args) throws FileNotFoundException {

LA la=new LA();
la.dec();
la.fun();

Systexanalyzer SA=new Systexanalyzer(la.token);
if(SA.SelectionSet()){
    System.out.println("valid");
}else{
        System.out.println("error in line=" + la.token.get(SA.i).lineno);
    System.out.println("invalid");
}


    }
   
    
    
}
