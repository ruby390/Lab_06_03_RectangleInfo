import java.util.Scanner;
public class rectangleInfo {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        // Varibles
        String trash = "";
        int rectLength = 0;
        int rectWidth = 0;
        // input
        System.out.println("What is the length of your rectangle?");
        if(in.hasNextInt())
        {
            rectLength = in.nextInt();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You said the length was " + trash);
            System.out.println("Run the program again enter a valid amount.");
            System.exit(0);
        }
        System.out.println("What is the width of your rectangle?");
        if(in.hasNextInt())
        {
            rectWidth= in.nextInt();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You said the width was " + trash);
            System.out.println("Run the program again enter a valid amount.");
            System.exit(0);
        }
        // calculations + results
        int rectArea = rectLength * rectWidth;
        int rectPerimeter = rectLength * 2 + rectWidth * 2;
        double rectDiagonal = Math.sqrt(rectLength * rectLength + rectPerimeter * rectPerimeter);
        System.out.println("The area of the rectangle is " + rectArea);
        System.out.println("The perimeter of the rectangle is " + rectPerimeter);
        System.out.println("The diagonal of the rectangle " + rectDiagonal);
    }
}
