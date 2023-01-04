fun fibonacci (n: Int){

    var i = 1
    var fib = 1
    var oldFib = 1

    while (i <= n ){
        if (i <= 2){
            i += 1
            println(fib)
        } else {
            fib = fib + oldFib
            i += 1
            println(fib)
            oldFib = fib - oldFib
        }
    }






}