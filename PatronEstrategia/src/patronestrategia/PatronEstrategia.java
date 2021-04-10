/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronestrategia;

/**
 *
 * @author jeann
 */
public class PatronEstrategia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carrito carrito = new Carrito();
        carrito.agregarProducto(new Producto(1, "Producto 1", 100));
        carrito.agregarProducto(new Producto(2, "Producto 2", 200));
        carrito.agregarProducto(new Producto(3, "Producto 3", 300));
        carrito.agregarProducto(new Producto(4, "Producto 4", 400));
        carrito.agregarProducto(new Producto(5, "Producto 5", 500));
        carrito.agregarProducto(new Producto(6, "Producto 6", 600));
        carrito.agregarProducto(new Producto(7, "Producto 7", 700));
        carrito.agregarProducto(new Producto(8, "Producto 8", 800));
        carrito.agregarProducto(new Producto(9, "Producto 9", 900));
        carrito.agregarProducto(new Producto(10, "Producto 10", 1000));
     
        carrito.pagar(new PagoPayPal("jeannirasic@gmail.com", "123"));
        
        carrito.pagar(new PagoTarjetaCredito("Jeannira Sic", "123456789", "123", "04/25"));
        
    }
    
}
