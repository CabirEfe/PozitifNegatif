/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class PozitifNegatif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner can = new Scanner(System.in);
        System.out.println("Lütfen Bir Tam Sayı Giriniz: ");
        int sayi = can.nextInt();
        
        
        
        
        if(sayi > 0){
        System.out.println("Girdiğiniz Sayı Pozitif Bir Sayıdır.");
        }
        else if(sayi < 0){
        System.out.println("Girdiğiniz Sayı Negatif Bir Sayıdır.");
        }
        else{
        System.out.println("Girdiğiniz Sayı Sıfırdır.");
        }
        
                        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
