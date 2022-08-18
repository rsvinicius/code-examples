package lambda

import com.example.lambda.Calculator
import org.junit.jupiter.api.Test

class CalculatorTests {
    @Test
    fun calculate() {
        //With interface
        val calculator = Calculator { x, y -> x * y }
        println(calculator.calculate(5, 2))

        //Without interface
        val calculator2 = { x: Int, y: Int -> x * y }
        println(calculator2(5, 2))
    }
}