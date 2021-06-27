package connection;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Connection {
    public static void writeToFileOneLine(String path, String logLine) {
        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter(path, true))) {
            bw.newLine();
            bw.write(logLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Long getNumberOfRecords(String path){
        try {
            String lastLine = Files.lines(Paths.get(path)).
                    reduce((a,b)-> b).orElse(null);
            if (lastLine == null) {
                //TODO throw Exception?
                return -1L;
            } else {
                lastLine = lastLine.substring(0, lastLine.indexOf(","));
                if ("id".equals(lastLine)) return 0L;
                return Long.valueOf(lastLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
