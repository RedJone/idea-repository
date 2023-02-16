import java.util.Scanner;

public class test4 {   //1463347
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int shor = n1<n2 ? n1 :n2;
        int lon = n1<n2 ? n2 :n1;
        int sum =0;
        long  l1 = System.currentTimeMillis();

        for(int i =shor;i<=lon;i++){
            String binaryString = Integer.toBinaryString(i);
            if(binaryString.contains("101")){
                continue;
            }
            sum++;
        }
        System.out.println(sum);
        System.out.println(System.currentTimeMillis()-l1);

    }
}
