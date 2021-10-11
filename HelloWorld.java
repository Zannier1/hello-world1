import java.util.Date;

public class HelloWorld {
    public static void main(String[] args){
        String word = ("Hello World2.");
        double price = 10.99;
        Date now = new Date();
        System.out.println(word);
        System.out.println("The price is: " + price);
        System.out.println("The time is: " + now);
        System.out.println("The length of word is " + word.length());
        if(word.length()>12){
            System.out.println("Message is too long.");
        }
        else {
            System.out.println("Is all good man.");
        }
        
       
    }
}

//javac HelloWorld.java && java HelloWorld