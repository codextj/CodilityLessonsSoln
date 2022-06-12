/*Author : codextj | tanmayjain.cs@gmail.com */

function solution(A, K) {
    // write your code in JavaScript (Node.js 8.9.4)

    K = K % A.length
    return A.splice(A.length - K).concat(A);
}