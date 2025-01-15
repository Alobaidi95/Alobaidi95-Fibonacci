import java.util.ArrayList;

public class Fibonacci {
    /**
     * Return the nth number of fibonacci sequence.
     * The fibonacci sequence is calculated by adding the previous two numbers in the sequence to obtain the next
     * number. The first two numbers in the whole fibonacci sequence are always 0 and 1.
     * For instance, the sequence starts as:
     * 0 1 1 2 3 5 8 13 21
     * where the 4th number of the sequence would be 3, the 5th number would be 5, the 6th number would be 8, etc.
     *
     * You could either use a for loop to keep track of the current number of the fibonacci sequence as well as the two
     * numbers before it, or you could look up a recursive solution to experiment with recursion for the first time.
     *
     * @param n an iteration of the fibonacci sequence.
     * @return the nth number of fibonacci sequence.
     */
    public int fib(int n){

        // ArrayList <Integer> fibonacci = new ArrayList<>();
        // fibonacci.add(0);
        // fibonacci.add(1);
        // for(int i = 1; i <= n ;i++)
        // {
        //     int next = addTwoNum(fibonacci.get(i-1), fibonacci.get(i));
        //     fibonacci.add(next);
        // }
        // return fibonacci.get(n);

        /////////////////// second approach ///////////////

        // int[] fibonacci = new int[n+1];
        // fibonacci[0] = 0;
        // fibonacci[1] = 1;
        // for(int i = 2 ; i<=n ; i++)
        // {
        //     int next = addTwoNum(fibonacci[i-2], fibonacci[i-1]);
        //     fibonacci[i] = next;
        // }

        // return fibonacci[n];

        /////////////// third approach //////////
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n-2) + fib(n-1);

        
    }

    public int addTwoNum(int first, int second)
    {
        return first+second;
    }
}
