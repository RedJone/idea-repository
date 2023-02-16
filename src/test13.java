public class test13 {
    public static void main(String[] args) {
        /*
        小王经常飞国际航班，给定一个 24 小时制（小时:分钟 “HH:MM”）的行程列表，
        找出列表中任意两个行程的最小时差并以分钟数表示。

        输入：timePoints = ["23:59","00:00"] 输出：1

        */
        String[] timePoints = new String[]{"00:10","23:59","10:00"};

        // 用来装转化成分钟的数据
        int[] time = new int[timePoints.length];
        // 1.先将小时分钟分别提取出来，将其转化成分钟进行比较
        for(int i=0;i<timePoints.length;i++){
            String[] split = timePoints[i].split(":");
            int hour = Integer.parseInt(split[0]);
            int minitus = Integer.parseInt(split[1]);
            if(hour == 0 ){
                hour = 24;
            }
            minitus += hour*60;
            time[i] = minitus;
        }

        int min = Integer.MAX_VALUE;  // 存放最小的时差
        // 2.对两个分钟做差后，输出时差
        for(int i=0;i<time.length;i++){
            for(int j=i+1;j<time.length;j++){
                int num = Math.abs(time[i] - time[j]);  // 对列表内的数据做差
                min = Math.min(num,min);
            }
        }

        System.out.println(min);

    }

}
