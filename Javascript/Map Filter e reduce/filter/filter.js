function filtraPares(arr) {
    return arr.filter (callback);
    
}

function callback(item) {
    return item % 2 ==0;
}

const meuArray = [1,23,40,24,5,8,9,12];

console.log(filtraPares(meuArray));