package otherpatterns.unitofwork;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MyLogger {

    /* static fields */
    public static Logger LOGGER;

    static{
        try(FileInputStream ins = new FileInputStream("D:\\patterns\\patterns\\ooppatterns\\src\\main\\resources\\log.config")){
            //config logger
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(ApplicationRunner.class.getName());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
