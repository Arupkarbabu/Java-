import java.util.Scanner;

public class quadratic {
    
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int a ,b,c;
    double r1,r2;

    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();

    r1 =(-b+Math.sqrt(b*b-4*a*c))/(2*a);
    r2 =(-b-Math.sqrt(b*b-4*a*c))/(2*a);
    System.out.println("Root are "+r1+ "  "+r2);

}


}
