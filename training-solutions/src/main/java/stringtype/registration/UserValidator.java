package stringtype.registration;

public class UserValidator {
    public boolean isValidUsername(String username) {
        return  !(username.length() == 0) ? true : false;
    }

    public boolean isValidPassword(String password1, String password2) {
        return password1.equals(password2) && password1.length() > 7;
    }

    public boolean isValidEmail(String email) {
        return !(email.indexOf("@") == -1) && !(email.indexOf(".") == -1)
                && !(email.substring(0, 1).equals("@"))
                && !(email.substring(email.length() - 1, email.length()).equals("."))
                && (email.indexOf("@") + 1 < email.indexOf("."));
    }
}
