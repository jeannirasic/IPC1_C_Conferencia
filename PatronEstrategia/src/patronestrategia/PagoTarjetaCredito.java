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
public class PagoTarjetaCredito implements PagoInterface{
    private String nombre;
    private String numeroTarjeta;
    private String cvv;
    private String fechaExpiracion;

    public PagoTarjetaCredito(String nombre, String numeroTarjeta, String cvv, String fechaExpiracion) {
        this.nombre = nombre;
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public boolean pagar(double montoPago) {
        if(nombre.equals(null) || numeroTarjeta.equals(null) || cvv.equals(null) || fechaExpiracion.equals(null)){
            System.out.println("No se pudo realizar el pago con tarjeta");
            return false;
        }else{
            System.out.println("Se ha realizado el pago con tarjeta de credito");
            return true;
        }
    }

    @Override
    public void obtenerDetallePago() {
        System.out.println("El usuario: " + this.nombre + " ha realizado el pago con tarjeta");
    }
    
    
    
}
