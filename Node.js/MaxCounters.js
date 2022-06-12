/*Author : codextj | tanmayjain.cs@gmail.com */

function solution(N, A) {
    // write your code in JavaScript (Node.js 8.9.4)
    let counters = new Array(N);
    let maxCounter = 0;
    let lastResetVal = 0;

    for (let x of A) {
        if (x >= 1 && x <= N) {
            counters[x-1] = counters[x-1] ? counters[x-1] : 0; // take care of undefined
            if (counters[x-1] < lastResetVal) {
                counters[x-1] = lastResetVal;
            }
             
            counters[x - 1] += 1;
            maxCounter = maxCounter > counters[x - 1] ? maxCounter : counters[x - 1];
        } else {
            lastResetVal = maxCounter;
        }
    }

    for (let x = 1; x <= N; x++) {
        counters[x-1] = counters[x-1] ? counters[x-1] : 0; // take care of undefined
        if ( counters[x-1] < lastResetVal ) {
            counters[x-1] = lastResetVal;
        }
    }

    return counters;
}