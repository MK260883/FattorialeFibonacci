fun factorial (n: Int) {

    var i = 1
    var fact =  1.0
    val maxInt = 2000000000.0

    while (i <= n){
        try {
            fact *= i
            i += 1
            if (fact > maxInt ) throw StackOverflowError()
            println(fact.toInt())

        } catch(e: StackOverflowError){
            println("The factorial has exceeded the limits of int")
            break
        }
    }

}