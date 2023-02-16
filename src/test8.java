import java.util.ArrayList;
import java.util.Stack;

public class test8 {
    public static void main(String[] args) {
          /*输入：asteroids = [5,10,-5]
        输出：[5,10]
        解释：10 和 -5 碰撞后只剩下 10 。 5 和 10 永远不会发生碰撞。*/

        //int[] asteroids = new int[]{5,10,-5};
        int[] asteroids = new int[]{-2,-1,1,2};
        // 1.1 首先声明一个栈，遇到正数则入栈，遇到负数则和栈顶的数进行比较
        Stack<Integer> stackPositive = new Stack<>();
        // 1.2 声明另一个栈，存入负数
        Stack<Integer> stackNective = new Stack<>();

        // 2.遍历数组，将正负数分别填入相应的栈内
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>0){
                stackPositive.push(asteroids[i]);
            }else if(asteroids[i]<0){
                stackNective.push(asteroids[i]);
            }
        }

        // 3. 对栈内正负数的大小进行比较，大的留下，小的去掉
        while ( stackNective.size()>0 && stackPositive.size()>0 ){
            int positive = Math.abs(stackPositive.peek());
            int nective = Math.abs(stackNective.peek());
            if(positive > nective){
                stackNective.pop();
            }else if(positive < nective){
                stackPositive.pop();
            }else {
                stackPositive.pop();
                stackNective.pop();
            }
        }

        // 4. 将栈内剩下的值存放到 list内
        ArrayList<Integer> list = new ArrayList<>();
        if(stackNective.size() > 0 ){
            int len = stackNective.size();
            for(int i=0;i<len;i++){
                list.add(stackNective.pop());
            }
        }
        if(stackPositive.size() > 0 ){
            int len = stackPositive.size();
            for(int i=0;i<len;i++){
                list.add(stackPositive.pop());
            }
        }

        int[] result = new int[list.size()];

        for(int i=0,j=list.size()-1;i<list.size();i++,j--){
            result[j] = list.get(i);
            System.out.println(result[j]);
        }
        //        System.out.println(stack.size());
//        int len = stack.size();
//        for(int i =0;i<len;i++){
//            System.out.print(stack.pop()+",");
//        }

//        System.out.println(result[j]);
//       // return result;
//        System.out.println("]");
    }
}
