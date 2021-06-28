import java.io.File;

public interface Properties {

    String ROOT_DIR = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" +File.separator + "resources";
    String USER_FILE_PATH = ROOT_DIR + File.separator+ "user.csv";
    String BOOKS_FILE_PATH = ROOT_DIR + File.separator+ "book.csv";
}
