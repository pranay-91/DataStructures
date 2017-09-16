import datastructures.MaxPQ;

public class DemoRunner {
    public static void main(String []args) {
        MaxPQ<Integer> mpq = new MaxPQ(10);
        mpq.insert(1);
        mpq.insert(4);
        mpq.insert(5);
        mpq.insert(3);
        mpq.insert(2);
        mpq.insert(8);
        mpq.insert(9);
        mpq.insert(6);

        for(int i=0;i<7; ++i) {
            System.out.println("Max: " + mpq.delMax());
        }
        
        System.out.println("\nEnd of the program.");
    }
}