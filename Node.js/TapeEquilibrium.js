/*Author : codextj | tanmayjain.cs@gmail.com */

function solution(A) {
    // write your code in JavaScript (Node.js 8.9.4)

    if ( A.length == 2 ) {
        return Math.abs(A[0] - A[1]);
    }

    let sum = 0;
    for (let num of A) {
        sum += num;
    }

    let leftPartition = A[0];
    let rightPartition = sum - A[0];
    let minDiff = Math.abs(leftPartition - rightPartition);
    // console.log(leftPartition, rightPartition)
    for (let i=1; i<A.length-1; i++) {
        leftPartition += A[i];
        rightPartition -= A[i];
        // console.log(leftPartition, rightPartition)
        let this_diff = Math.abs(leftPartition - rightPartition);
        minDiff = Math.min(minDiff, this_diff);
    }
    return minDiff;
}