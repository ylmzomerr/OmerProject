package Facebook;

public class Facebook {
  String  username;
  String password, name;
  int age, numberoffriends;
  public Facebook(String username, String password){
      this.username=username;
      if(password.contains(username)){
          System.out.println("Password contained username.");
          this.password="password";
      }else {

          this.password=password;
      }
  }

    public Facebook(String userName, String password, String name) {
        this(userName,password);

        name = name.replace(" ","");

        boolean valid = true;

        for(int i=0; i < name.length(); i++) {
            if(!Character.isLetter(name.charAt(i)))  {
                valid = false;
                break;
            }
        }

        if(valid) {
            this.name = name;
        } else {
            System.out.println("Invalid name");
            this.name = "no name";
        }

    }

    public Facebook(String username, String password,String name,int age,int numberoffriends){
       this(username,password,name);
       if(age<0){
           System.out.println("invalid Age");
       }else {
           this.age=age;
       }
       if (numberoffriends>0&&numberoffriends<500){
           this.numberoffriends=numberoffriends;
       }else {

           System.out.println("Invalid Freinds number");
       }

    }
    public void info(){
        System.out.println("Name : "+this.name);
        System.out.println("Username : "+this.username);
        System.out.println("Age : "+this.age);
        System.out.println("Number of friends : "+this.numberoffriends);
    }
    public boolean sendFriendRequest(Facebook user){

         if(user.numberoffriends<500&&this.numberoffriends<500){
             System.out.println("Request sent");
             user.numberoffriends++;
             this.numberoffriends++;
             return  true;
         }else if(user.numberoffriends>500){
             System.out.println("You have reached the limit of friends.");
             return false;
         }else if(this.numberoffriends>500){
             System.out.println(user.name+" cannot accept any more friend request.");
             return false;
         }else {
             return false;

         }


    }
}
