/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;
import junit.framework.Assert;



/**
 *
 * @author DILSHAN
 */
public class Test extends Assert {
    public static void main (String [] args ){
        calculator c=new calculator();
        assertEquals("message", 463.0, c.getinstallment(15000, 36, 7));
        
        }

int triple(int i){
    return i*3;
        }
}
