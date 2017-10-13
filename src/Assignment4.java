/*
   @author Camila Arbaiza

   CSC 201-004N

   Professor Tanes Kanchanawanchai

   Assignment 4 problem 4.4

   The purpose of this program is to compute the  area of a hexagon using the
    following formula:  Area = (6 * s^2)/ (4 * tan(PI/6))

   */
import java.util.Scanner;

public class Assignment4 {


    public static void main (String [] args){

        double s;          // side of the hexagon
        double a;          // area of the hexagon
        Scanner input = new Scanner(System.in);   // Scanner


        System.out.println("Enter the side: ");
        s = input.nextDouble();

        a = getArea(s);


        System.out.print("The area of the hexagon is ");
        System.out.printf("%2.2f", a);

    }//end main

    /**
     * The getArea method uses the formula to calculate the area of a hexagon
     *
     * @param side    side of the hexagon
     * @return area   area of the hexagon
     */
    public static double getArea(double side){

        double area;

        //use formula that calculates area of a hexagon
        area = (6 * (Math.pow(side, 2)))/(4 * (Math.tan((Math.PI)/6)));

    return area;}
}//end Assignment 4 class
