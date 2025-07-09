import java.util.Scanner;
public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu tu " + i + ": ");
            A[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i];
        }
        System.out.println("Tong cac so trong mang la: " + sum);
        sc.close();
    }
}
