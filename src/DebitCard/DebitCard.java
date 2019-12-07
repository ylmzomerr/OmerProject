package DebitCard;

public class DebitCard {
    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    Double balance;

    public DebitCard(long cardNumber,String holderName,Double balance){

        if(String.valueOf(cardNumber).length()==16){
         this.cardNumber=cardNumber;
         this.holderName=holderName;
         this.balance=balance;
        }else {
            System.out.println("invalid card number");
        }
    }

    public DebitCard(long cardNumber,String holderName,Double balance,int pin,String cardType){

      if(cardType.equals("Master")||cardType.equals("Visa")){
          this.cardNumber=cardNumber;
          this.holderName=holderName;
          this.balance=balance;
          this.pin=pin;
          this.cardType=cardType;

      }
    }

    public void infoPrint(){
        if(cardType!=null){

        System.out.println("Card number = " + this.cardNumber );
        System.out.println("holderName= " + this.holderName );
        System.out.println("cardType = " + this.cardType);
        System.out.println("balance = " + this.balance );
       }

    }
}
