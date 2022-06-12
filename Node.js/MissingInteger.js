/*Author : codextj | tanmayjain.cs@gmail.com */

function solution(A) {
    // write your code in JavaScript (Node.js 8.9.4)

    A.sort((a, b) => a-b);
    oneIdx = A.findIndex((x)=> x==1);
    if (oneIdx == -1) {
        return 1;
    }
    
    for(let i=oneIdx; i<A.length-1; i++) {
        if (A[i] == A[i+1] || A[i] + 1 == A[i+1]) {
            continue;
        }
        return A[i] + 1;
    }

    return A[A.length-1] + 1;
}