

package calculator;

import junit.framework.TestCase;


public class Multipletest extends TestCase {
    public void test1(){
    calculator c=new calculator();
    assertEquals("Message", 463.0, c.getinstallment(36000, 36, 7));
    
    }
public void test2(){
calculator c= new calculator();
assertEquals("Message -2", 9, c.triple(2));

}
}
