
package datastructures;

public class MaxPQ<Key extends Comparable<Key>>
{
    private Key[] pq;
    private int N=0;

    public MaxPQ(int n) {
        pq = (Key[])new Comparable[n+1];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    // 1 + logN compares
    public void insert(Key key) {
        pq[++N] = key;
        swim(N); 
    }

    // 2logN compares
    public Key delMax() {
        Key max = pq[1];
        exhcange(1,N--);
        sink(1);
        pq[N+1] = null;
        return max;
    }

    private void swim(int k) {
        while(k>1 && less(k/2,k)){
            exhcange(k, k/2);
            k = k/2;
        }
    }

    private void sink(int k) {
        while(2*k<=N){
            int j = 2*k;
            if(j<N && less(j, j+1)) ++j;
            if(!less(k,j)) break;
            exhcange(k,j);
            k = j;
        }
    }

    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    private void exhcange(int i, int j) {
        Key temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }
}