import java.lang.*;
public class Student{
    String USN,NAME,BRANCH,PHONE_NO;
        public static void main(String[] args)
    {
        Student S1 = new Student();
        Student S2 = new Student();
        Student S3 = new Student();
        Student S4 = new Student();

        S1.USN = "21BTRCM011";
        S1.NAME = "EKRAJ GHIMIRE";
        S1.BRANCH = "MACT";
        S1.PHONE_NO = "8904006160";

        System.out.println("First Student Details Are As Fllows: ");

        System.out.println("USN =" + S1.USN);
        System.out.println("NAME =" + S1.NAME);
        System.out.println("BRANCH =" + S1.BRANCH);
        System.out.println("PHONE_NO =" + S1.PHONE_NO);

        S2.USN = "21BTRCM001";
        S2.NAME = "RAM";
        S2.BRANCH = "MACT";
        S2.PHONE_NO = "9234234225";

        System.out.println("\nSecond Student  Details Are As Fllows: ");

        System.out.println("USN =" + S2. USN);
        System.out.println("NAME =" + S2. NAME);
        System.out.println("BRANCH =" + S2. BRANCH);
        System.out.println("PHONE_NO =" + S2. PHONE_NO);

        S3.USN = "21BTRCM002";
        S3.NAME = "XYZ";
        S3.BRANCH = "MACT";
        S3.PHONE_NO = "2342556812";

        System.out.println("\nThird Student Details Are As Fllows: ");

        System.out.println("USN =" + S3. USN);
        System.out.println("NAME =" + S3. NAME);
        System.out.println("BRANCH =" + S3. BRANCH);
        System.out.println("PHONE_NO =" + S3. PHONE_NO);

        S4.USN = "21BTRCM012";
        S4.NAME = "John";
        S4.BRANCH = "MACT";
        S4.PHONE_NO = "8364599447";

        System.out.println("\nFourth Student Details Are As Fllows: ");

        System.out.println("USN =" + S4. USN);
        System.out.println("NAME =" + S4. NAME);
        System.out.println("BRANCH =" + S4. BRANCH);
        System.out.println("PHONE_NO =" + S4. PHONE_NO);

    }
}
