import java.util.PriorityQueue;

class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        for(int i = 0; i < n; i++){
            pq.add(arr[i]);
        }
        long res = 0;
        long ans = 0;
        while(pq.size()!= 1){
            long firstElement = pq.remove();
            long secondElement = pq.remove();
            ans = firstElement + secondElement;
            res += ans;
            pq.add(ans);
        } 
        return res;
    }
}