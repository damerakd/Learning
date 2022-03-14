package DynamicProgramming;

import java.util.HashMap;

public class FibMemo {

    HashMap<Long,Long> memo = new HashMap<>();

   public long fibonacci(long n) {

       if (memo.containsKey(n))
           return memo.get(n);

        if (n <= 2)
            return 1;

        memo.put(n, fibonacci(n - 1) + fibonacci(n - 2));

        return memo.get(n);
    }

}
