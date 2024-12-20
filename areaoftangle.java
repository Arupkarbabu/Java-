import java.util.*;

public class areaoftangle {
    

    public static void main(String[] args) {
        
        float base ,hight,area;

        System.out.println("Enter base and hight");
        Scanner sc =new Scanner(System.in);
        base=sc.nextFloat();
        hight=sc.nextFloat();
        area= (base*hight)/2;

       System.out.println(area);

    }
}
