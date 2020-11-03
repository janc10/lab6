import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        String namePerson;
        String agePerson;
        String addressPerson;

        System.out.println("Hello. What is your name? ");
        namePerson = scnr.next();
        System.out.print("It's nice to meet you, " + namePerson + ".");


        System.out.print(" How old are you? ");
        agePerson = scnr.next();
        System.out.println("I see that you are still quite young at only " + agePerson + ".");


        System.out.print("Where do you live? ");
        addressPerson = scnr.next();
        System.out.print("Wow! I've always wanted to go to " + addressPerson + ".");
        System.out.print(" Thanks for chatting with me. Bye!");


    }


}
