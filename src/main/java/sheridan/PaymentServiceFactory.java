/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sheridan;
/**
 *
 * @author ramses
 */
public class PaymentServiceFactory {
    private static PaymentServiceFactory instance = null;
    
    private PaymentServiceFactory( ) {
        
    }
    
    public PaymentService getPaymentService( PaymentServiceType type ) {
        switch ( type ) {
            case CREDIT : return new CreditPaymentService( );
            case DEBIT : return new DebitPaymentService( );
        }
        return null;
    }
    
    
    public static PaymentServiceFactory getInstance( ) {
        if ( instance == null ) {
            instance = new PaymentServiceFactory( );
        }
        return instance;
    }
}
