/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

/**
 *
 * @author DILSHAN
 */
public class calculator {
    
    public double getinstallment(double loanAmount,int duration,double intrestRate){
    
    intrestRate =intrestRate/100;
    
    double installment=(loanAmount*(intrestRate/12))/(1-Math.pow((1+intrestRate/12), -duration));
    
    return Math.round(installment);
}
int triple(int i){
       return i*3;
            }
}
