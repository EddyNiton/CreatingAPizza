/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Eddy Perez Macias
 */
public class Pere_E_MakingAPizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double diameter;
       double grand;
       double sub;
       double tax;
       Scanner cm = new Scanner(System.in);
       
        System.out.println("Hello, what should be the size of the diameter of your pizza? ");
        diameter = cm.nextDouble();
        if(diameter >= 1 && diameter <=15){
            System.out.println("We are going to make you a ugly little pizza!");
        }
        if(diameter > 15 && diameter < 40){
        System.out.println("This will be disgusting!");
    }
        if(diameter >+ 40){
            System.out.println("WOAHHH, You're gonna need your mom to bring this home!");
        }
        
        sub = diameter * 0.5 + 0.99 + 0.75;
        tax = sub * 0.13;
        grand = sub + tax;
        System.out.println("Hey pig, tax is $" + Math.round(tax*100)/100.0+ " sub total is $"+ Math.round(sub*100)/100.0 +" and grand is $"+ Math.round(grand*100)/100.0);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
