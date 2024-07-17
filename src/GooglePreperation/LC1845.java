package GooglePreperation;

import java.util.PriorityQueue;

public class LC1845 {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

    public void SeatManager(int n) {
        for (int i = 0; i < n; i++) {
            pq.add(i + 1);
        }
    }

    public int reserve() {
        return pq.remove();
    }

    public void unreserve(int seatNumber) {
        pq.add(seatNumber);
    }
}
/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */

