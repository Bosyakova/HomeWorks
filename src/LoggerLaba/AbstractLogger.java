package LoggerLaba;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;


public abstract class AbstractLogger implements Logger {

    protected abstract String constructLogMessage(LogType type, String message);
    protected abstract boolean writeLog(String message);

    @Override
    public void log(String message) {
        String LogMessage = constructLogMessage(LogType.INFO, message);
        writeLog(LogMessage);
    }
    @Override
    public void log(LogType type, String message) {
        String LogMessage = constructLogMessage(LogType.WARNING, message);
        writeLog(LogMessage);
    }
    @Override
    public void log(Throwable t)   {
        String LogMessage = constructLogMessage(LogType.ERROR, t.getMessage());
        writeLog(LogMessage);
    }
}


