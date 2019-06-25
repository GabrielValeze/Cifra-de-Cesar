/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifracesar;

import java.util.Scanner;



/**
 *
 * @author Gabriel Valeze
 */
public class Main {

 
    public static void main(String[] args) {
       String palavra="";
       String texto;
       String[] array= new String[2];
       Scanner sc = new Scanner(System.in);
       texto = sc.nextLine();
       
       
       ManipuladorDeTexto manipulador = new ManipuladorDeTexto(texto,0);

       manipulador.fork();
       
       ManipuladorDeTexto manipulador1 = new ManipuladorDeTexto(texto,1);
       
       palavra = manipulador.join() + manipulador1.compute();
       
       System.out.println(palavra);
       
    }
    
}
