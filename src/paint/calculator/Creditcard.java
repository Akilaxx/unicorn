package paint.calculator;

import java.util.Scanner;

public class Creditcard {

    private String fullname;
    private long accountnumber;
    private int cvv;

    public Creditcard(String fullname, long accountnumber, int cvv) {
        this.fullname = fullname;
        this.accountnumber = accountnumber;
        this.cvv = cvv;
    }


    public String getName() {
        return fullname;
    }

    public void setName(String newName) {
        this.fullname = newName;
    }


    public static class Main {

        public static void main(String[] args){
            Scanner pegasus = new Scanner(System.in);
            String length;
            String width;
            String answer;



            System.out.println("Hey there! Please tell me the length of your wall (in meters).");
            length = pegasus.nextLine();
            System.out.println("So your wall is " + length + " meters? Please answer with yes or no.");
            answer = pegasus.nextLine();

            if (answer.equals("yes")) {
                System.out.println("Okay great! Next tell me your wall width.");
                width = pegasus.nextLine();
                System.out.println("So your wall width is " + width + " meters? Please answer with yes or no.");
                answer = pegasus.nextLine();
                if (answer.equals("yes")) {
                    int surfacearea = Integer.parseInt(length)*Integer.parseInt(width);
                    System.out.println("Okay great! From this I can say that your wall surface area is " + surfacearea + " meters sqr.");

                } else {
                    System.out.println("Oops! Please could you tell me your wall width again (in meters)?");
                    width = pegasus.nextLine();
                    System.out.println("Alright so I've noted your wall width down as " + width + " meters.");
                    int surfacearea = Integer.parseInt(length)*Integer.parseInt(width);
                    System.out.println("From this I've calculated that your wall surface area is " + surfacearea + " meters sqr.");
                }
            }
            else {
                System.out.println("Oh no! Please could you tell me the length of your wall again (in meters)?");
                length = pegasus.nextLine();
                System.out.println("Okay so your wall length has been noted down as " + length + " meters, hehe~");
                System.out.println("Now please tell me your wall width!");
                width = pegasus.nextLine();
                System.out.println("Okay so your wall width is " + width + " meters (oh god I hope I got this right). Please answer with yes or no.");
                answer = pegasus.nextLine();
                if (answer.equals("yes")) {
                    int surfacearea = Integer.parseInt(length)*Integer.parseInt(width);
                    System.out.println("Phew! From this I can say that your wall surface area is " + surfacearea + " meters sqr.");
                } else {
                    System.out.println("AAA GOD I'M SORRY!! Please could you tell me what your wall width is again?");
                    width = pegasus.nextLine();
                    int surfacearea = Integer.parseInt(length)*Integer.parseInt(width);
                    System.out.println("I can FINALLY say your wall surface area is " + surfacearea + " meters sqr. Sorry about all those misunderstandings!");
                }
            }
            System.out.println();
            System.out.println("Alright now it's time for the actual paint calculations lol. So on that note, welcome to...");
            System.out.println();
            System.out.println("✧･ﾟ: *✧･ﾟ:*The paint calculator of suffering*:･ﾟ✧*:･ﾟ✧");
            System.out.println("(and yes I'm the paint calculator of suffering incase you haven't realised)");
            System.out.println();
            int surfacearea = Integer.parseInt(length)*Integer.parseInt(width);
            System.out.println("From what I've gathered, the wall you intend to cover with paint is " + length+ " meters tall, " + width + " meters wide, and has a surface area of " + surfacearea + " meters sqr.");
            System.out.println("If that's NOT the case then that's tough because I'm not going through that whole process with you again.");
            System.out.println("Now would you like to use a small can (1.5litres), medium can (3.8litres) or big can (5.3litres)?");








    //        int L = 20;
    //        int W = 50;
    //        int SA = (L*W);
    //        int P = 37;
    //
    //        System.out.println();
    //        System.out.println("✧･ﾟ: *✧･ﾟ:*The paint calculator of suffering*:･ﾟ✧*:･ﾟ✧");
    //        System.out.println();
    //        System.out.println("The length of the wall is " + L + "(Meters).");
    //        System.out.println("The width of the wall is " + W + "(Meters).");
    //        System.out.println("The surface area of the wall is " + SA + "(Meters sqr).");
    //        System.out.println();
    //        System.out.println("One can of paint covers " + P + "(Meters sqr).");
    //        System.out.println();
    //        System.out.println("♥*♡∞:｡.｡You will need " + SA/P + " cans of paint to paint the wall!｡.｡:∞♡*♥");


        }

    }
}
