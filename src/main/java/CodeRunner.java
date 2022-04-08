import org.mindrot.jbcrypt.BCrypt;

public class CodeRunner {
    public static void main(String[] args) {
        String password = "password123";

        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());


        System.out.println("password = " + password);
        System.out.println("hashedPassword = " + hashedPassword);

        boolean passwordsMatch = BCrypt.checkpw("supersecret", hashedPassword);
        System.out.println("passwordsMatch = " + passwordsMatch);

        passwordsMatch = BCrypt.checkpw("password123", hashedPassword);
        System.out.println("passwordsMatch = " + passwordsMatch);
    }
}
