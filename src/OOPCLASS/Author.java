package OOPCLASS;

import AccessModifier.Library;

public class Author  {
     public String name;
     private int age;

     public  void info(){
         System.out.printf(this.name+"  "+this.age);

     }

     private void  info2(){
         System.out.printf(this.name+"  "+this.age);
     }

}
