
package javaapplication15;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter data :");
        boolean check1=sc.hasNextInt();
        boolean check2=sc.hasNextDouble();
        System.out.println("co token khong ?"+check1);
    }
}
