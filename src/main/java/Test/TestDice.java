package Test;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDice {
    Pocker.Combinations comb1;
    Pocker.Combinations comb2;

    public TestDice() {
        comb1 = new Pocker.Combinations(new int[]{4, 3, 3, 3, 3});
        comb2 = new Pocker.Combinations(new int[]{2, 4, 3, 5, 6});
    }

    @Test
    public void test_combination1() {
        assertEquals(0, comb1.combination1());
        assertEquals(0, comb2.combination1());
    }

    @Test
    public void test_combination2() {
        assertEquals(0, comb1.combination2());
        assertEquals(2, comb2.combination2());
    }

    @Test
    public void test_combination3() {
        assertEquals(12, comb1.combination3());
        assertEquals(3, comb2.combination3());
    }

    @Test
    public void test_combination4() {
        assertEquals(4, comb1.combination4());
        assertEquals(4, comb2.combination4());
    }

    @Test
    public void test_combination5() {
        assertEquals(0, comb1.combination5());
        assertEquals(5, comb2.combination5());
    }

    @Test
    public void test_combination6() {
        assertEquals(0, comb1.combination6());
        assertEquals(6, comb2.combination6());
    }

    @Test
    public void test_combination7() {
        assertEquals(16, comb1.combination7());
        assertEquals(0, comb2.combination7());
    }

    @Test
    public void test_combination8() {
        assertEquals(16, comb1.combination8());
        assertEquals(0, comb2.combination8());
    }

    @Test
    public void test_combination9() {
        assertEquals(0, comb1.combination9());
        assertEquals(0, comb2.combination9());
    }

    @Test
    public void test_combination10() {
        assertEquals(0, comb1.combination10());
        assertEquals(30, comb2.combination10());
    }

    @Test
    public void test_combination11() {
        assertEquals(0, comb1.combination11());
        assertEquals(40, comb2.combination11());
    }

    @Test
    public void test_combination12() {
        assertEquals(0, comb1.combination12());
        assertEquals(0, comb2.combination12());
    }

    @Test
    public void test_combination13() {
        assertEquals(16, comb1.combination13());
        assertEquals(20, comb2.combination13());
    }
}

