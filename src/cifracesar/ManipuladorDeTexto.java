/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifracesar;

//import java.util.Scanner;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author Gabriel Valeze
 */
public class ManipuladorDeTexto extends RecursiveTask<String> {
    String retorno,texto;
    int numero;
    String[] array = new String[2];
    
    public ManipuladorDeTexto(String texto, int numero){
        this.texto=texto;
        this.numero=numero;
        
    }
    
    public String[] separador(String texto){
        int tamanhoMetade;
        int tamanhoTexto = texto.length();
        String primeiraMetade = "";
        String segundaMetade = "";
        char aux;
        
        tamanhoMetade = tamanhoTexto/2;
        
        for(int i= 0; i< tamanhoMetade; i++){
            aux=texto.charAt(i);
            primeiraMetade += aux;
        }
        
        for(int i= tamanhoMetade; i< tamanhoTexto; i++){
            aux=texto.charAt(i);
            segundaMetade += aux;
        }
        
        array[0] = primeiraMetade;
        array[1] = segundaMetade;
        
        return array;
    }
    
    public String codificador(String array){
       
        int tamanho=array.length();
        String aux="";
        
        for(int i = 0; i < tamanho; i++){
            aux = aux + (char)(array.charAt(i) + 3);
        }
        
        return aux;
    }

    @Override
    protected String compute() {
        String[] array= new String[1]; 
        array = separador(texto);
        
        retorno = codificador(array[numero]);
                
        return retorno;
    }
    
}
