/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author jonathan
 */
public class TestUserprofile {
    
   public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name:");
        String userName = scan.nextLine();
        System.out.println();
         System.out.print("Pick genres: Comedy,Drama,Action,Mystery:");
         String genres = scan.nextLine();
         System.out.println("userProfile was created");
   } 
   
}
