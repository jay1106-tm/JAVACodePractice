// https://leetcode.com/problems/maximum-total-importance-of-roads/

import java.util.*;
class Leetcode_8825 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] roads = new int[n][2];
        for(int[] i:roads) {
            i[0] = sc.nextInt();
            i[1] = sc.nextInt();
        } 
        Solution answer = new Solution();
        int N = sc.nextInt();
        long ans = answer.maximumImportance(N, roads);
        System.out.print(ans);
    }
}

class Solution {
    public long maximumImportance(int n, int[][] roads) {
        /*int M = roads[0].length;
        int N = roads.length;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<M; j++) {
                int city = roads[i][j];
                freq.put(city,freq.getOrDefault(city,0)+1);
            }
        }
        long[] count = new long[n];
        for(int i = 0; i<n; i++) {
            count[i] = freq.getOrDefault(i,0);
        }
        Arrays.sort(count);
        long sum = 0;
        for(int i = n-1; i>=0; i--) {
            sum += (long)count[i]*(i+1);
        }
        return sum;*/
        int[] freq = new int[n];
        for(int[] i:roads) {
            freq[i[0]]++;
            freq[i[1]]++;
        }
        Arrays.sort(freq);
        long sum = 0;
        for(int i = n-1; i>=0; i--) {
            sum += (long)freq[i]*(i+1);
        }
        return sum;
    }
}