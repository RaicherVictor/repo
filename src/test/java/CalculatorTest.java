import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void add() {
        assertEquals(6,calculator.add(1,5) );
    }

    @Test
    void dif() {
        assertEquals(5,calculator.dif(7,2) );
    }

    @Test
    void div() {
        assertEquals(3,calculator.div(9,3) );
    }

    @Test
    void times() {
        assertEquals(5,calculator.times(1,5) );
    }

    @Test
    void solver() {
        assertEquals(1,calculator.solver(1,5,3,3,1) );
    }
}
