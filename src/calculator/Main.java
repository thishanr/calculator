/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

import junit.framework.TestSuite;
import junit.textui.TestRunner;


public class Main {

   
    public static void main(String[] args) {
        TestSuite ts=new TestSuite(Multipletest.class);
        TestRunner.run(ts);
  
    }

}
