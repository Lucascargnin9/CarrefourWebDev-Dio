function validaArray(arr,num) {

    try{

    if(!arr && !num) throw new ReferenceError("Envie os parametrôs");

    if(typeof arr !== 'object') throw new TypeError ("Array precisa ser do tipo object");

    if(typeof num !== 'number') throw new TypeError ("Array precisa ser do tipo number");

    if(arr.lenght !== num) throw new TypeError ("Tamanho invalido");

    return arr;
    }
    catch(e) {
        if(e instanceof ReferenceError){
            console.log("E um ReferenceError")
            console.log(e.message)

        } else if(e instanceof TypeError){
            console.log("E um TypeError")
            console.log(e.message)

        } else if(e instanceof RangeError){
            console.log("E um RangeError")
            console.log(e.message)

        } else {
            console.log("erro nao esperado"+e)
        }
    }

}

console.log(validaArray());