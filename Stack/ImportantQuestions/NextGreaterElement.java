class Solution {
    public static int[] nextGraterElement(int[] a, int [] b) {
        int[] res = new int[a.length];
        
        for(int i=0; i<a.length; i++) {
            res[i] = -1;

            for(int j=0; j<b.length; j++) {
                if(b[j] == a[i]) {
                    for(int k= j+1; k<b.length; k++) {
                        if(b[k] > a[i]) {
                            res[i] = b[k];
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return res;
    }
}