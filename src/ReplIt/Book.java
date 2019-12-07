package ReplIt;

/**
 * Represents an individual copy of a book
 */

public class Book {
    //instance variables for Book object
    private String author;
    private String title;
    private int id;
    private int pages;
    //static variable to track number of books with unknown author
    private static int unknownAuthors;

    public static void main(String[] args) {
       Book book=new Book();
       book.setAuthor("");
        System.out.println(book.author);
    }
    /**
     Utility static method: capitalize
     accepts a String and then returns in capitalized form(first uppercase - rest lowecase)
     if argument is empty, it returns an empty String ""
     capitalize("jAVa") => "Java"
     capitalize("HTML") => "Html"
     capitalize("") => ""
     This method will be used in setAuthor(), setTitle() methods
     */
    public static String capitalize(String word) {

        if(!word.isEmpty()){

            return word.substring(0,1).toUpperCase()+ word.substring(1,word.length()).toLowerCase();
        }
        return null;
    }

    /**
     Utility static method: isTitleWord
     -This method will be used in setTitle() method
     -Accepts a words to check if it is a part of the title or just an article etc.
     - The method returns false => if word parameter is one of articles, coordinate conjunctions, or prepositions. See full list below
     -else method returns true
     Articles:
     "a" , "an", "the"
     Coordinate conjunctions:
     "and", "but", "for", "nor", "or", "so", "yet"
     Most common single-word English prepositions:
     "at", "by", "in", "into", "near", "of", "on", "to", "than", "via"

     isTitleWord("Apple") => true
     isTitleWord("a") => false
     isTitleWord("BUT") => false
     isTitleWord("THE") => false
     isTitleWord("neaR") => false
     isTitleWord("java") => true

     */
    public static Boolean isTitleWord(String word) {
        if(!word.isEmpty()){
            word=word.toLowerCase();
            switch (word){
                case "a" : return false;
                case "an" :return false;
                case  "the" :return false;
                case  "and" :return false;
                case  "but" :return false;
                case  "for" :return false;
                case  "nor" :return false;
                case  "or" :return false;
                case  "so" :return false;
                case  "yet" :return false;
                case  "at" :return false;
                case  "by" :return false;
                case  "in" :return false;
                case  "into" :return false;
                case  "near" :return false;
                case  "of" :return false;
                case  "on" :return false;
                case  "to" :return false;
                case  "than" :return false;
                case  "via" :return false;




            }
        }

        return true;

    }

    /**
     * No args constructor. Stays empty
     */
    public Book() {
    }

    /**
     * 4 args constructor. accepts id, author, title, pages
     * CALLS SETTER methods to assign to instance variables.
     * ex: setId(id);
     * It does NOT directly assign to the instance variable
     * ex: NO => this.id = id;
     */
    public Book(int id, String author, String title, int pages ) {
        setId(id);
        setAuthor(author);
        setTitle(title);
        setPages(pages);


    }

    /**
     * setAuthor method will be used to set value to private author of the Book
     * @param author : String
     * Conditions:
     *    => if parameter author is value is empty, 1) "Unknown" is assigned to instance variable author
     *                                             2) static unknownAuthors is incremented by one.
     *    => Each word in Book author's name should be capitalized. CALL capitalize method
     *  Example:
     *  Book b = new Book();
     *  b.setAuthor("mArufJon temirov"); => assigns "Marufjon Temirov" to this.author
     *  b.setAuthor("ironMAN"); => assigns "Ironman" to this.author
     *  b.setAuthor("") => assigns "Unknown" to this.author and unknownAuthors++
     */
    public void setAuthor(String author) {
        if(author.isEmpty()){
            unknownAuthors++;
            this.author="Unknown";
            System.out.println(unknownAuthors);
        }else{
            String[] temp=author.split(" ");
            String temp2="";
            for(int i=0; i<temp.length;++i){
                temp2=temp2+capitalize(temp[i])+" ";

            }
            this.author=temp2.substring(0,(temp2.length()-1));
        }


    }

    /**
     * setTitle method will be used to set value to private title of the Book
     * @param title : string
     * Conditions:
     *   => if title is single word, capitalize it and assign to this.title.
     *   => if title is empty, assign "" to this.title (<- we will handle this in Shelf class properly)
     *   => You need to capitalize each word of title except articles, coordinate conjunctions, or prepositions.
     *              See full list in isTitleWord method, they need to be all lowercase.
     *              -> Call isTitleWord() method to check if a word needs to be capitalized or not.
     *              -> Call capitalize method to capitalize title words.
     *   => First word is always capitalized regardless if it is article etc.
     *   Ex:
     *      Book book = new Book();
     *      book.setTitle("MaruF The cool"); => "Maruf the Cool" is assigned to this.title
     *
     *      book.setTitle("the Chronicles OF TrumP"); => "The Chronicles of Trump" is assigned to this.title
     *
     *
     */
    public void setTitle(String title) {
        String[] temp=title.split(" ");
        String temp2="";
        for(int i=0;i<temp.length;++i) {
            if (isTitleWord(temp[i])&&i+1!=temp.length) {


                temp2 = temp2 + capitalize(temp[i]) + " ";


            }else if(i+ 1==temp.length&&isTitleWord(temp[i])) {
                temp2 = temp2 + capitalize(temp[i]) ;
            }else if(!isTitleWord(temp[i])){
                temp2=temp2+temp[i].toLowerCase()+" ";
            }else if(i==0){
                temp2 = temp2 + capitalize(temp[i]) + " ";
            }
        }

        this.title=temp2;

    }

    /**
     * toString instance method, String representation of the Book object
     * @return String
     * Format includes author, title, id, pages of the Book object:
     * Book[author=Marufjon T, title=Selenium Cookbook, id=10, pages=300]
     */
    public String toString() {


        return "";

    }


    /**
     * Getter methods for static unknownAuthors
     * @returns unknownAuthors value
     */
    public static int getUnknownAuthors(){


        return 0;
    }

    /**
     * Getter methods for private pages
     * @returns pages value
     */
    public int getPages() {


        return this.pages;
    }

    /**
     * Setter method for private pages. No conditions
     * @param pages
     */
    public void setPages(int pages) {
        this.pages=pages;


    }

    /**
     * public Getter method for private author
     */
    public String getAuthor() {

        return this.author;
    }


    /**
     * public Getter method for private title
     */
    public String getTitle() {


        return this.title;
    }


    /**
     * public Getter method for private id
     */
    public int getId() {


        return this.id;
    }
    /**
     * public setter method for private id
     */
    public void setId(int id) {

        this.id=id;

    }


}
