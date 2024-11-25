
package ec.edu.espoch.practicas;

import Clases.Producto;

/**
 *
 * @author PERSONAL
 */
public class PracticaS {

    public static void main(String[] args) {
        Producto[] prod = new Producto[2];
        prod[0] = new Producto("escoba", "2003", 1.50);
        prod[1] = new Producto("zapatos", "2005", 5.00);
        
        for (Producto producto : prod) {
            System.out.println(producto);
            
            
                    
            
        }
    }
}
