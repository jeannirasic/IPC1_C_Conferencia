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
public class PagoPayPal implements PagoInterface{
    private String email;
    private String password;

    public PagoPayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    @Override
    public boolean pagar(double montoPago) {
        if(email.equals(null) || password.equals(null)){
            System.out.println("No se pudo realizar el pago con paypal");
            return false;
        }else{
            System.out.println("Se realizo el pago con paypal");
            return true;
        }
    }

    @Override
    public void obtenerDetallePago() {
        System.out.println("El usuario: " + this.email + " ha realizado el pago con PayPal");
    }
    
}
