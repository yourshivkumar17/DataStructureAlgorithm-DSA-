public class DailyTemperature {
    public static int[] dailyTemperatures(int[] t) {
        Stack<Integer> s = new Stack<>();
        int[] res = new int[t.length];
        for(int i =0; i<t.length; i++) {
            while(!s.isEmpty() && t[i] > t[s.peek()]) {
                int index = s.pop();
                res[index] = i - index;
            }
            s.push(i);
        }
        return res;
    }
    
}
