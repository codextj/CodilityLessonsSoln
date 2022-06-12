

function solution(X, A) {
    // write your code in JavaScript (Node.js 8.9.4)

    leafPosSet = new Set();

    for (let k=0; k < A.length; k++) {
        let l = A[k];
        if ( 1 <= l <= X ) {
            leafPosSet.add(l);
        }

        if (leafPosSet.size == X) {
            return k;
        }
    }

    return -1;
}