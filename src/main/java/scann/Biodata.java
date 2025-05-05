package scann;

import java.util.Scanner;

public class Biodata
{
        public static void main(String[] args)
        {
            Scanner scan= new Scanner(System.in);

            System.out.println("Enter the Name");
            String name=scan.nextLine();
            System.out.println("MY NAME :"+name);

            System.out.println("Enter the age");
            String age=scan.nextLine();
            System.out.println("Age:-"+age);

            System.out.println("Enter the Gender");
            String Gender=scan.nextLine();
            System.out.println("Gender:-"+Gender);

            System.out.println("Enter the Address");
            String address=scan.nextLine();
            System.out.println("Address:-"+address);

            System.out.println("Enter the DOB");
            String DOB=scan.nextLine();
            System.out.println("Date Of Birth:-"+DOB);

            System.out.println("Enter the Qualification");
            String degree=scan.nextLine();
            System.out.println("Qualification:-"+degree);

            System.out.println("Enter the Experience");
            String exp=scan.nextLine();
            System.out.println("Year of Experience:-"+exp);

            System.out.println("Enter the Position");
            String pos=scan.nextLine();
            System.out.println("ROLE:-"+pos);
        }
        }

