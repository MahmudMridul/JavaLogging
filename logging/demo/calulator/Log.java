/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logging.demo.calulator;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.text.SimpleDateFormat;


public class Log 
{

    private static final Logger logger = Logger.getLogger("CALCULATOR");

    public Log()
    {
        logger.setLevel(Level.INFO);
        
        try
        {
            Date date =  new Date();
            Timestamp timeStamp = new Timestamp(date.getTime());
            //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss-SSS");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            
            FileHandler fileHandler = new FileHandler(dateFormat.format(timeStamp)+".log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        }
        catch(IOException | SecurityException e)
        {
            logger.log(Level.INFO, "FileHandler couldn't be created");
        }
        
    }

    public Logger getLogger() 
    {
        return logger;
    }
    
    
    
    
}
