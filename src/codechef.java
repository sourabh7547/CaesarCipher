import java.util.Scanner;

public class codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int x = sc.nextInt();int res;
            if(x%5!=0)
                System.out.println(-1);
            else {
                res =(x/10+(x%10/5));
                System.out.println(res);

            }

        }
    }
}
