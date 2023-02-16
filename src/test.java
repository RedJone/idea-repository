import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int out =-1;
        for(int i = 0; i < arr.length; i++){
            if(i==0 ){
                int other1 = 1;
                //int other2 = 1;

                for(int j=1;j<arr.length;j++){
                    other1 = other1*Integer.parseInt(arr[j]);
                }
                if( 1 == other1 ){
                    System.out.println(0);
                    return;
                }

            }else if(arr.length-1 == i){
                int other2 = 1;
                for(int k=arr.length-2;k>=0;k--){
                    other2 = other2*Integer.parseInt(arr[k]);
                }
                if( 1 == other2 ){
                    System.out.println(arr.length-1);
                    return;
                }

            }else{
                int right = 1;
                int left = 1;
                for(int w=i+1;w<arr.length;w++){
                    right = right*Integer.parseInt(arr[w]);
                }
                for(int t=0;t<i;t++){
                    left = left*Integer.parseInt(arr[t]);
                }
                if( left == right ){
                    out = i;
                    break;
                }
            }
        }
        System.out.println(out);
    }
}
