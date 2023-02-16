import java.util.LinkedList;

public class test10 {
    public static void main(String[] args) {


        int[] asteroids = new int[]{10,-10};

        LinkedList<Integer> linkedList = new LinkedList<>();
        // 1.遍历数组，将数据填入链表
        for(int i=0;i<asteroids.length;i++){
           linkedList.add(asteroids[i]);
        }

        // 2。循环遍历链表，遇到正数，则判断其右侧是否为负数；遇到负数，则判断其左侧是否为正数
        for(int i=0;i<linkedList.size();i++){
            if( linkedList.get(i) > 0 && i!=linkedList.size()-1 ){  // 为正数，且位置不正末尾
                if( linkedList.get(i+1) < 0 ){  // 且其右边的数为负数
                    // 判断两数的大小，保留绝对值大的数，若相等，一并删除
                    Integer positive = Math.abs(linkedList.get(i));
                    Integer negative = Math.abs(linkedList.get(i+1));
                    if( positive > negative ){
                        linkedList.remove(i+1);
                        i = -1;  // i退回原点，重新一轮循环
                    }else if( positive < negative ){
                        linkedList.remove(i);
                        i = -1;
                    }else {  // 相等，则两数一块删除
                        linkedList.remove(i);
                        linkedList.remove(i);
                        i = -1;
                    }

                }

            }
        }

        int[] result = new int[linkedList.size()];
        for(int i=0;i<linkedList.size();i++){
            result[i] = linkedList.get(i);
        }

        System.out.println(linkedList);
    }
}
