import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String shor = str1.length()<str2.length() ? str1 : str2;
        String lon = str1.length()<str2.length() ? str2 : str1;
        String result = "";
        String re = "";
        int max = 0;
        for(int i=0;i<shor.length();i++){
            for(int j=shor.length();i<j;j--){
                String s = shor.substring(i,j);
                if(lon.contains(s)){
                    result = "";
                    result +=s;
                    if(result.length()>max){
                        max = result.length();
                        re = result;
                    }
//                    System.out.println(result);
//                    return;
                }
            }

        }
        System.out.println(re);
    }
}
