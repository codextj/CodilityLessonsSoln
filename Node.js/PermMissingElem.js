/*Author : codextj | tanmayjain.cs@gmail.com */

function solution(A) {
    // write your code in JavaScript (Node.js 8.9.4)

    let sum = 0;
    for (let num of A) {
        sum += num
    }

    N = A.length + 1;
    expectedSum = N * (N + 1) / 2
    return expectedSum - sum;
}