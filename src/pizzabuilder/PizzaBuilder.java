/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzabuilder;

/**
 *
 * @author mrebelladofernandez
 */
public class PizzaBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizza miPizzaHawaiana;
        miPizzaHawaiana = new Builder(500, 350).setGrPinha(100).createPizza();
        

    }

}
