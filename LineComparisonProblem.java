package day_8_line_comparision;

import java.util.Scanner;

public class LineComparisonProblem {
	
	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of co-ordinate x1");
        int x1=sc.nextInt();
        System.out.println("Enter the value of co-ordinate x2");
        int x2=sc.nextInt();
        System.out.println("Enter the value of co-ordinate y1");
        int y1=sc.nextInt();
        System.out.println("Enter the value of co-ordinate y1");
        int y2=sc.nextInt();
        double a= Math.sqrt((Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2))); //calculating length of a line
        System.out.println("Length of line is -"+" " +a);
    }

}