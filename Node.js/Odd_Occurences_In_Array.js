function solution(A) {
    // write your code in JavaScript (Node.js 8.9.4)
    const match = new Set();

    for (let num of A) {
        if( match.has(num) ) {
            match.delete(num);
        } else {
            match.add(num);
        }
    }
   
    return Array.from(match.keys())[0];
}