import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n2-n1+1;

        String binaryString = Integer.toBinaryString(n2);
        int length = binaryString.length();
        //System.out.println(length);

        if(length <= 3 ){   // 转化为2进制后长度＜4的
            if(n2>=5){
                System.out.println(sum -1);
                return;
            }else {
                System.out.println(sum );
                return;
            }
        }

        String bi1011 = 101+""+"111111111111111111111111".substring(0,length-3);
        String bi1010 = 101+""+"000000000000000000000000".substring(0,length-3);
        String bi1001 = 100+""+"111111111111111111111111".substring(0,length-3);
        int int1011 = Integer.parseInt(bi1011,2);
        int int1010 = Integer.parseInt(bi1010,2);

        System.out.println("sum:"+sum);
        String start = "";

        if( n2 >= int1011 ){
            start = bi1011;
        }else if(n2 >= int1010){
            //start = binaryString;
            int head = n2 - int1010 +1;
            sum -= head;
            int start0 = int1011 >> 1;
            start = Integer.toBinaryString(start0);
            bi1001 = bi1001.substring(0,bi1001.length()-1);
        }else {
            int start0 = int1011 >> 1;
            start = Integer.toBinaryString(start0);
            bi1001 = bi1001.substring(0,bi1001.length()-1);
        }
        System.out.println("sum2:"+sum);

        for(int i= start.length();i>=4;i--){
            int p1 = Integer.parseInt(start, 2);
            int p2 = Integer.parseInt(bi1001, 2);
            sum = sum -  (p1 - p2);

            //String bi = Integer.toBinaryString(p1);
            //int startMid = p1 >> 1;
            //int bi1001Mid = p2 >> 1;
            //start = Integer.toBinaryString(startMid);
           // start = Integer.toBinaryString(start0);
            start = start.substring(0, start.length() - 1);
            bi1001 = bi1001.substring(0,bi1001.length()-1);
//            if(i==4){
//                sum -=1;
//            }

        }
        if(start.length() == 3){   // 转化为2进制后长度＜4的
            sum -= 1;
        }

        System.out.println(sum);


    }
}
