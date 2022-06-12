/*Author : codextj | tanmayjain.cs@gmail.com */

function solution(A) {
     write your code in JavaScript (Node.js 8.9.4)

    N = A.length;
    seen = new Set();
    expected_sum = N  (N+1)  2
    sum = 0;
    for (let n of A){
        if (seen.has(n)) {
             there are duplicates
            return 0
        }
        seen.add(n);
        sum += n
    }

    return expected_sum == sum  1  0;
}