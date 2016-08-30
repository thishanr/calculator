/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

import java.io.IOException;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;


class Public {
    static Logger logger=Logger.getRootLogger();
    public static void main (String[]args) {
        try {
            //ConsoleAppender appender=new ConsoleAppender(new PatternLayout());
            FileAppender appender = new FileAppender(new HTMLLayout(), "log.html");
            logger.addAppender(appender);
            new log().setVisible(true);
            
           
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Public.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

}
