import java.util.*;
public class Hcf_Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int hcf = calculatehcf(num1, num2);
        int lcm = calculatelcm(num1, num2);
        System.out.println(num1+num2+hcf);
        System.out.println(num1+num2+lcm);

    }

    public static int calculatehcf(int num1, int num2) {
        while(num2 !=0){
            int temp =num2;
            num2 =num1%num2;
            num1 = temp;
        }
        return num1;
    }

    public static int calculatelcm(int num1, int num2) {
        return (num1*num2)/calculatehcf(num1, num2);
    }
}
