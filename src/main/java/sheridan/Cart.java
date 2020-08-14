/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ramses
 */
public class Cart {
    
    private List <Product> products = new ArrayList<>( );
    private PaymentService service;
    
    public void setPaymentService( PaymentService service ) {
        this.service  = service;
    }
    
    
    public void addProduct( Product product ) {
        products.add( product );
    }
    
    public void payCart( ) {
        double total = 0;
        
       for ( Product product : products ) {
           total += product.getPrice( );
       }
        service.processPayment( total );
    }
}
