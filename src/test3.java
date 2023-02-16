import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int shor = n1<n2 ? n1 :n2;
        int lon = n1<n2 ? n2 :n1;
        int sum =0;
        long  l1 = System.currentTimeMillis();

        for(int i =lon;i>=shor;i--){
            String binaryString = Integer.toBinaryString(i);
            if(binaryString.startsWith("101")){
                int length = binaryString.substring(3).length();
                String ss ="";
                String rr ="";
                for(int j=1;j<=length;j++){
                    ss +=1;
                }
                rr = "100"+ss;
                i = Integer.parseInt(rr,2) +1;
                continue;
            }
            if(binaryString.contains("101")){
                //System.out.print(i+",");
                continue;
            }
            sum++;

        }
        //System.out.println();

        System.out.println(sum);
        System.out.println(System.currentTimeMillis()-l1);
    }
}
