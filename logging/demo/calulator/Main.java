
package logging.demo.calulator;

import static java.lang.System.out;
import java.util.logging.Level;


public class Main 
{   
    public static void main(String[] args) 
    {
        Log logger = new Log();
        
        logger.getLogger().log(Level.INFO, "Instatiating calculator object");
        Calculator cal = new Calculator(logger.getLogger());
        logger.getLogger().log(Level.INFO, "Instatiated calculator object");
        
        logger.getLogger().log(Level.INFO, "Calling add method");
        int result = cal.add(4, 10);
        logger.getLogger().log(Level.INFO, "Returned from add method");

        logger.getLogger().log(Level.INFO, "Printing addition result to console");
        out.println(result);
        
        
        logger.getLogger().log(Level.INFO, "Calling substract method");
        result = cal.substract(45, 10);
        logger.getLogger().log(Level.INFO, "Returned from substract method");

        logger.getLogger().log(Level.INFO, "Printing addition result to console");
        out.println(result);
        
        logger.getLogger().log(Level.INFO, "Exiting program");
    }
    
}
