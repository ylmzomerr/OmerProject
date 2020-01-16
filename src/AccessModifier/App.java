package AccessModifier;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        App instagram=new App("instagram","Social media",123);
        instagram.setReview("it is bad");
        instagram.setReview("it is bad");
        System.out.println(instagram.getListOfreviews());
    }
   private String name, category,description;
   private int rating;
  private   double size;
  private   ArrayList<String> listOfreviews=new ArrayList<>();
  static int numberOfApps=0;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public ArrayList<String> getListOfreviews() {
        return listOfreviews;
    }

    public void setListOfreviews(ArrayList<String> listOfreviews) {
        this.listOfreviews = listOfreviews;
    }

    public App() {
    }
    public App(String name, String category, double size) {
        this.name=name;
        this.category=category;
        this.size=size;
        numberOfApps++;
    }

    public void open (){
        System.out.println(this.name+"   is opening");
    }

    public void close (){
        System.out.println(this.name+"   is closing");
    }

    public void update (){
        System.out.println(this.name+"   is updating");
    }


    public void info() {
        System.out.println( "App{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                ", size=" + size +
                '}');
    }

    public void setReview (String review){
       if(review.length()>=3){
           listOfreviews.add(review);
           System.out.println("succesfully");
       }else System.out.println("failure");
    }

}
