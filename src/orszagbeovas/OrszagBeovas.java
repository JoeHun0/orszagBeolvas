/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orszagbeovas;

/**
 *
 * @author Diak
 */
public class OrszagBeovas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tasks t = new Tasks();
        t.beolvas("orszagok.txt");
        System.out.println(t.biggerThanTenmillion());
        System.out.println(t.averagePopulation());
        System.out.println(t.colors());
        System.out.println(t.isSmallerThanFivemillion());
        System.out.println(t.gap());
        
    }
    
}
