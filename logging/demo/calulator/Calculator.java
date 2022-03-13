
package logging.demo.calulator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculator 
{
    private Logger logger;
    
    public Calculator(Logger logger)
    {
        this.logger = logger; 
    }
    
    
    public int add(int a, int b)
    {
        logger.log(Level.INFO, "Returning result from add method");
        return (a + b);
    }
    
    public int substract(int a, int b)
    {
        logger.log(Level.INFO, "Returning result from substract method");
        return (a - b);
    }
    
    public int multiply(int a, int b)
    {
        logger.log(Level.INFO, "Returning result from multiply method");
        return (a * b);
    }
    
    public int divide(int a, int b)
    {
        logger.log(Level.INFO, "Returning result from divide method");
        return (a / b);
    }
    
}
