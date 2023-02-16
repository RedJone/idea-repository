public class test6 {
    public static void main(String[] args) {

    }

    // 用于计算首位为100、101、110、111时，包含“101”的字符串的个数
    public static int clculate(String str){

        int sum =0;  // 用于存放100、101、110、111开头的，包含“101”的字符串的个数

        String sub = str.substring(3);  // 取除了头部3位数的剩余部分
        // num1为 101 11111111
        int num1 = Integer.parseInt("101"+"111111111".substring(0,str.length()-3),2);
        // num2为 101 00000000
        int num2 = Integer.parseInt("100"+"111111111".substring(0,str.length()-3),2);

        sum += num1 - num2;   // 101 开头的数字的总个数

        return  sum;
    }
}
