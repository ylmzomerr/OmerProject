package Polymorpism2;

public class Person {
    private String name;

    public Person(String name){
        setName( name );
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void info(){
        System.out.println(" Here is the name "+getName());
    }


    public boolean hasSameName(Person otherPerson){
       // if(getName().equalsIgnoreCase( otherPerson.getName() )){
       //     return true;
        // }else {return false;}
        return  this.getName().equalsIgnoreCase( otherPerson.getName() );

    }
}
