import java.math.BigInteger

fun factorial(n: Int): Int {
    require( n >= 0)
    return if (n == 0) 1 else n * factorial(n - 1)
}

fun fibonacci(n: Int): Int {
    require ( n > 0)
    if (n == 1){
          return  1
        }
    if (n == 2)
        return 1
    else
        return (fibonacci(n-1) + fibonacci(n-2))


}

fun factorial2(n:BigInteger): BigInteger {
    require(n > BigInteger.ZERO)
    tailrec fun loop (n: BigInteger, acc: BigInteger): BigInteger {
        return if ( n == BigInteger.ZERO) acc
        else loop(n-BigInteger.ONE, n*acc)
    }
    return loop( n, BigInteger.ONE )
}
 fun fibonacci2(n: Int): Int {
     tailrec fun loop ( n: Int, i: Int, t: Int):  Int{
         return if (n == 0) t else loop(n-1, i + t, i )
     }
     return loop(n,0, 1)


}

