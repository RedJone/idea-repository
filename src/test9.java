import java.util.Stack;

public class test9 {
    public static void main(String[] args) {

        /*输入：asteroids = [5,10,-5]
        输出：[5,10]
        解释：10 和 -5 碰撞后只剩下 10 。 5 和 10 永远不会发生碰撞。*/

        int[] asteroids = new int[]{10,2,-5};
        // 1.首先声明一个栈，遇到第一个数则先入栈
        Stack<Integer> stack = new Stack<>();
        stack.push(asteroids[0]);

        // 2.直到栈内数据为空，则把后一个比较值放入栈内
        for (int i = 1; i < asteroids.length; i++) {
            //System.out.println(stack.peek() * asteroids[i]);
            if (stack.peek() * asteroids[i] > 0) {   // 如果第二个值和第一个值符号相同，则继续入栈
                stack.push(asteroids[i]);
                continue;
            } else {  // 如果第下一个值和栈顶值符号不相同，则比较绝对值大小
                Integer pop = Math.abs(stack.peek());   // 取出栈顶的数
                if (Math.abs(asteroids[i]) > pop) {   // 如果栈顶的数小，则继续比较
                    // 并继续和剩下的栈内数据进行比较
                    stack.pop();
                    while (!stack.empty() && Math.abs(asteroids[i]) > Math.abs(stack.peek())) {
                        stack.pop();
                    }
                    if (stack.empty()) { // 如果栈内数都被清空了，则将这个数放入栈内
                        stack.push(asteroids[i]);
                    }
                    continue;
                } else if (Math.abs(asteroids[i]) < pop) {  // 如果栈顶的数大，则继续循环
                    continue;
                } else { //一样大，则两个都丢弃
                    stack.pop();
                    continue;
                }

            }

        }

//        int len = stack.size();
//        for (int j = 0; j < len; j++) {
//            System.out.print(stack.pop() + ",");
//        }
        int len = stack.size();
        int[] result = new int[len];
        for(int i=0,j=len-1;i<len;i++,j--){
            result[j] = stack.pop();
            System.out.println(result[i]);
        }

//        System.out.println(result[j]);
        //System.out.print("[");
        // System.out.println(stack.size());
//        int[] result = new int[stack.size()];
//        for(int i=0,j=stack.size()-1;i<stack.size();i++,j--){
//            result[j] = stack.pop();
//        }
//       // return result;
//        System.out.println("]");
    }
}
