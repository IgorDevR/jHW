import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        String login1 = "21 символ____________";
        String login2 = "некоректный символ @";
        String correctLogin = "ivan_i";

        String pass1 = "20 символов____________";
        String pass2 = "некоректный символ @";
        String correctPass = "12345_qqq";

        String confirmPass1 = "+___________";
        String correctConfirmPass = "12345_qqq";

        boolean res1 = staticMethod(login1, correctPass, correctConfirmPass);
        boolean res2 = staticMethod(login2, correctPass, correctConfirmPass);

        boolean res3 = staticMethod(correctLogin, pass1, correctConfirmPass);
        boolean res4 = staticMethod(correctLogin, pass2, correctConfirmPass);

        boolean res5 = staticMethod(correctLogin, correctPass, confirmPass1);
        boolean res6 = staticMethod(correctLogin, correctPass, correctConfirmPass);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
        System.out.println(res6);


    }

    static boolean staticMethod(String login, String password, String confirmPassword) {

        Pattern pattern = Pattern.compile(("[a-zA-Z0-9_']+"));
        boolean result = pattern.matcher(login).matches() && pattern.matcher(password).matches()
                && pattern.matcher(confirmPassword).matches();

        try {
            if (login.length() > 20) {
                throw new WrongLoginException();
            } else if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException();
            }
        } catch (WrongLoginException e) {
            result = false;
            throw new WrongLoginException("Логин содержит больше 20 символов", e);

        } catch (WrongPasswordException e) {
            result = false;
            throw new WrongPasswordException("Пароли не совпадают", e);

        } finally {
            return result;
        }
    }


}

class WrongLoginException extends Exception {
    public WrongLoginException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }

    public WrongLoginException() {
    }
}

class WrongPasswordException extends Exception {

    public WrongPasswordException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
    public WrongPasswordException() {
    }
}
