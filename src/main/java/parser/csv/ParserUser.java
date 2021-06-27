package parser.csv;

import entiti.User;

public class ParserUser implements ParserProperties{

    public static String parseUser(User user) {
        StringBuilder contactLine = new StringBuilder();
        contactLine.append(SEPARATOR);
        contactLine.append(user.getFirsName());
        contactLine.append(SEPARATOR);
        contactLine.append(user.getLastName());
        return contactLine.toString();
    }
}
