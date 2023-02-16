import java.util.Stack;

public class test7 {
    public static void main(String[] args) {

        /*输入：asteroids = [5,10,-5]
        输出：[5,10]
        解释：10 和 -5 碰撞后只剩下 10 。 5 和 10 永远不会发生碰撞。*/

        int[] asteroids = new int[]{5,10,-5};
        // 1.首先声明一个栈，遇到正数则入栈，遇到负数则和栈顶的数进行比较
        Stack<Integer> stack = new Stack<>();

        // 2.直到栈内数据为空，或数组已经到末尾则结束
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>0){
                stack.push(asteroids[i]);
            }else  if(asteroids[i]<0 && !stack.empty()){
                Integer pop = stack.peek();   // 取出栈顶的正数
                if( Math.abs(asteroids[i])> pop ){   // 如果负数大，则保留负数
                    // 并继续和剩下的栈内数据进行比较
                    stack.pop();
                    while ( !stack.empty() && Math.abs(asteroids[i])> pop ){
                        stack.pop();
                    }
                    continue;
                }else if( Math.abs(asteroids[i])< pop ){  // 如果正数数大，则保留正数数
                   continue;
                }else { //一样大，则两个都丢弃
                    stack.pop();
                    continue;
                }
            }
        }
        //System.out.print("[");
        System.out.println(stack.size());
        int len = stack.size();
        for(int i =0;i<len;i++){
            System.out.print(stack.pop()+",");
        }

//        int[] result = new int[stack.size()];
//        for(int i=0,j=stack.size()-1;i<stack.size();i++,j--){
//            result[j] = stack.pop();
//        }
//       // return result;
//        System.out.println("]");
    }
}
