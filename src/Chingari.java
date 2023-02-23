import java.util.Scanner;

public class Chingari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE COINS OF 10");
        int x = sc.nextInt();
        System.out.println("entr the coins of 5");
        int y = sc.nextInt();
        System.out.println("total Amount =" + (x*10 +  y*5));
    }
}
