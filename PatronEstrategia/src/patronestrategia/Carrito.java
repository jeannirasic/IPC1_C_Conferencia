/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronestrategia;

import java.util.LinkedList;

/**
 *
 * @author jeann
 */
public class Carrito {
    private LinkedList<Producto> productosCarrito = new LinkedList<Producto>();
    
    public void agregarProducto(Producto producto){
        this.productosCarrito.add(producto);
    }
    
    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i < this.productosCarrito.size(); i++){
            total += this.productosCarrito.get(i).getPrecio();
        }
        return total;
    }
    
    public void pagar(PagoInterface metodoPago){
        double total = this.calcularTotal();
        boolean pagoCorrecto = metodoPago.pagar(total);
        if(pagoCorrecto){
            metodoPago.obtenerDetallePago();
        }
    }
}
