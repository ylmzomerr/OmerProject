package Methods;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(Calculator(9,5,'%'));
    }
    public static int Calculator(int num1,int num2,char ch){
        if(ch=='+'){
            return num1+num2;
        }else  if(ch=='-'){
            return num1-num2;
        }else if(ch=='*'){
            return num1*num2;
        }else if(ch=='/'){
            return num1/num2;
        }else if(ch=='%'){
            return num1%num2;
        }else {
            return -1;
        }
    }
}