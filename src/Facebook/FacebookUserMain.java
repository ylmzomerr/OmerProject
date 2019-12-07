package Facebook;

import javax.crypto.spec.PSource;

public class FacebookUserMain {
    public static void main(String[] args) {
        Facebook Omer=new Facebook("ylmzomerr","3224", "Omer Yilmaz",32,123);
        Facebook Mehmet=new Facebook("mehmetcelik","32ds4", "Mehmet Yilmaz",31,131);
        System.out.println(Omer.sendFriendRequest(Mehmet));
        Omer.info();;
        Mehmet.info();
    }

}
