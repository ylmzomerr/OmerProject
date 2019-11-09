package Methods;


public class ReturnMethods {
    public static void main(String[] args) {
        System.out.println(Usercheck("james123","password"));

    }
public static boolean Usercheck(String username, String password){
        if (username.equals("james123")&&password.equals("password")){
            return true;
        }else{
            return false;
        }
}
}
