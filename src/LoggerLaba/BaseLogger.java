package LoggerLaba;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseLogger extends AbstractLogger {
    private File toWrite;

    public BaseLogger(File toWrite) {
        setToWrite(toWrite);
    }

    public BaseLogger(String path) {
        setToWrite(new File(path));
    }

    public void setToWrite(File toWrite) {
        if (!toWrite.exists()) {
            throw new IllegalStateException();
        }
        this.toWrite = toWrite;
    }

    @Override
    protected String constructLogMessage(LogType type, String message) {
        return new StringBuilder()
                .append(getCurFormatDate("yyyy.MM.dd 'at' HH:mm:ss"))
                .append(" ")
                .append(type.toString())
                .append(" : ")
                .append(message)
                .append("\n\n")
                .toString();

    }
    private String getCurFormatDate(String pattern) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        String formattedDate = dateFormat.format(new Date());
        return formattedDate;
    }
    @Override
    protected boolean writeLog(String message) {
        try (FileWriter fileWriter = new FileWriter(toWrite, true)) {
            fileWriter.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
