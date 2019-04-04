import java.util.Scanner;

public class TriangleInput {

    public static void main(String args[]) {
        while (true) {
            System.out.println("Please enter 3 number lengths for each side of the" +
                    " triangle. Press enter after each number.");
            // Input for sideA. If input is not a double will prompt user for new input
            Scanner sideA = new Scanner(System.in);
            String sA;
            while (true) {
                sA = sideA.nextLine();
                try {
                    Double s1 = Double.valueOf(sA);
                    s1 = Double.parseDouble(sA);
                    break;
                } catch (NumberFormatException ne) {
                    System.out.println("This is not a number.  Please type a number (Side A)");
                }
            }
            System.out.println("Side A: " + (sA));

            // Input for sideA. If input is not a double will prompt user for new input
            Scanner sideB = new Scanner(System.in);
            String sB;
            while (true) {
                sB = sideB.nextLine();
                try {
                    double s2 = Double.valueOf(sB);
                    s2 = Double.parseDouble(sB);
                    break;
                } catch (NumberFormatException ne) {
                    System.out.println("This is not a number.  Please type a number (Side B)");
                }
            }
            System.out.println("Side B: " + (sB));

            // Input for sideA. If input is not a double it will prompt user for new input
            Scanner sideC = new Scanner(System.in);
            String sC;
            while (true) {
                sC = sideC.nextLine();
                try {
                    double s3 = Double.valueOf(sC);
                    s3 = Double.parseDouble(sC);
                    break;
                } catch (NumberFormatException ne) {
                    System.out.println("This is not a number.  Please type a number (Side C)");
                }
            }
            System.out.println("Side C: " + (sC));

            //Set sides of triangle
            double s1 = Double.valueOf(sA);
            double s2 = Double.valueOf(sB);
            double s3 = Double.valueOf(sC);

            //**********************************************************************
            //*********Now determining which type of triangle*************************
            if ((s1 == 0) || (s2 == 0) || (s3 == 0) ||
                    (s1 < 0) || (s2 < 0) || (s3 < 0)) {
                System.out.println("The lengths of the sides of the triangle must be positive");
            } else if (((s1 + s2) < s3) || ((s1 + s3) < s2) || ((s2 + s3) < s1)) {
                System.out.println("Invalid Triangle");
            } else { //check if invalid, else check for what type it is
                Triangle triangle = new Triangle(s1, s2, s3);

                triangle.isEquilateral();
                triangle.isScalene();
                triangle.isIsosceles();
            }

            //Ask if user wishes to continue
            System.out.println("Would you like to continue? Strike 'x' to exit or strike any other key to continue.");
            Scanner sc = new Scanner(System.in);
            String contYoN = sc.nextLine();
            if (contYoN.equals("x")) {
                System.out.println("Thank you!");
                break;
            }
        }
    }
}