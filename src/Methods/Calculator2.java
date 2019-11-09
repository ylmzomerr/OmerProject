package Methods;

public class Calculator2 {
    public static void main(String[] args) {
        System.out.println(Calculator(9,5,'%'));
    }
    public static int Calculator(int num1,int num2,char ch){
        switch (ch){
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '%':
                return num1 % num2;
            default:
                System.out.println("invalid operator");
                return 0;
        }

    }
}
