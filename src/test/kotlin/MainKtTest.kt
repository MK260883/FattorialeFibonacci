
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import java.math.BigInteger
import kotlin.random.Random

class MainKtTest {

    @Test
    fun testFactorial0() {
      assertEquals(1, factorial(0))

    }
    @Test
    fun testFactorial() {

        val n = Math.abs(Random.nextInt(0,10))
        assertEquals( factorial(n), n*factorial(n - 1))


    }
    @Test
    fun testFactorialNegative() {

        assertThrows(IllegalArgumentException::class.java) {factorial(-1)}

    }

    @Test
    fun testFibonacci1() {
        assertEquals(1, fibonacci(1))

    }
    @Test
    fun testFibonacci() {
        val n = 8
        println(fibonacci(n))
        assertEquals( fibonacci(n), fibonacci(n-1) + fibonacci(n-2))


    }
    @Test
    fun testFibonacciNegative() {

        assertThrows(IllegalArgumentException::class.java) {fibonacci(-1)}

    }

    @Test
    fun testFactorial2() {

        val n = 10_000L.toBigInteger()
        println(factorial2(n))
        assertEquals( factorial2(n), n*factorial2(n - BigInteger.ONE))


    }

    @Test
    fun testFibonacci2() {
        val n: Int = Math.abs(Random.nextInt(0, 50))
        println(fibonacci2(n))
        assertEquals( fibonacci2(n), fibonacci2(n-1) + fibonacci2(n-2))


    }

}

