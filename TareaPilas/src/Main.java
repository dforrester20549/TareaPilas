/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author fam.ForresterCalvo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pilas pila = new Pilas();
        pila.push(new trasteSucio("001",5,3));
        pila.push(new trasteSucio("002",3,7));
        pila.push(new trasteSucio("003",8,2));  
        
        pila.listar();
    }
    
}
