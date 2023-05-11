package class12;

public class Task1 {
    public static void main(String[] args) {


        String userName="tiadorhrue";
        String password="syntax123";
        String confirmedPassword=password;

        if(userName.isEmpty() || password.isEmpty())
        {
            System.out.println("Username or Password cannot be empty");

        }else if(password.length() <= 8)
        {
            System.out.println("Password is too short");

        }else if(password.contains(userName))
        {
            System.out.println("Password cannot contain username");

        }else if(confirmedPassword!=password)
        {
            System.out.println("Passwords do not match");
        }else {
            System.out.println("Your username and password has been created");
        }

    }
}
