import java.util.Scanner;
public class asalSayi {
    public static void main(String[] args) {
        System.out.println("0-100 Arasındaki Asal Sayılar:");
        for(int n=2;n<=100;n++)
        {
            boolean status=true;
            for (int i = 2; i < n; i++)
            {
                if (n % i == 0)
                {
                    status = false;
                    break;
                }
            }
            if(status==true)
            {
                System.out.print(n+" ");
            }
        }
    }
}