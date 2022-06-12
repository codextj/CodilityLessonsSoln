function solution(N) {
    // to handle negative numbers
    // (N >>> 0).toString(2)
    
    const binN = (N).toString(2);
    let zeroCount = 0;
    let longestGap = 0;
    
    for( let i = 0; i < binN.length; i++ ){
        if( binN[i] == '1' ) {
            longestGap = Math.max(longestGap, zeroCount);
            zeroCount = 0;
            continue;
        }
        
        zeroCount++;
    }
    return longestGap;
}


console.log(solution(5))
console.log(solution(1))
console.log(solution(8))
console.log(solution(9))
console.log(solution(328))