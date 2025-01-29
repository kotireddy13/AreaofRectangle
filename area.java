import java.util.Scanner;

public class area {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length: ");
        float breadth=sc.nextFloat();
        System.out.println("Enter Width: ");
        float length=sc.nextFloat();
        sc.close();
        System.out.println("Area of Rectangle:"+(breadth*length));
       
    }
}
