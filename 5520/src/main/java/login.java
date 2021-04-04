import  java.util.Scanner;

public class login {
    String bankUsername1 = "";
    String bankUserpwd1 = "";
    String companyUsername1 = "";
    String companyKeystore1 = "";

    public boolean bankLogin(String username, String password){
        if (username == bankUsername1 && password == bankUserpwd1){
            return true;
        }else{
            System.out.println("The username or password is not correct.");
            return false;
        }
    }

    public boolean companyLogin(String username, String keystore){
        if (username == companyUsername1 && keystore == companyKeystore1){
            return true;
        }else{
            System.out.println("The username or password is not correct.");
            return false;
        }
    }
}
