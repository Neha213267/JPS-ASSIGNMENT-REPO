import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class TestingQ1Test {
	class JunitQ1 {

	    @Test
	    void findMinMax() {
	        assertAll(
	                () -> assertArrayEquals(new int[]{9, 38}, MinMax.findMinMax(new int[]{9, 10,12, 38, 5, 6})),
	                () -> assertArrayEquals(new int[]{11, 19}, MinMax.findMinMax(new int[]{11, 12, 19, 5, 6})),
	                () -> assertArrayEquals(new int[]{2, 100}, MinMax.findMinMax(new int[]{ 100, 2, 34, 5, 6})));
	    }

	    @Test
	    void findMinMax2() {
	        assertAll(
	                () -> assertEquals("Min is 9 Max is 38", MinMax.findMinMax2(new int[]{9, 10, 12, 38, 5, 6})),
	                () -> assertEquals("Min is 5 Max is 19", MinMax.findMinMax2(new int[]{11, 12, 19, 5, 6})),
	                () -> assertEquals("Min is 2 Max is 100", MinMax.findMinMax2(new int[]{ 100, 2, 34, 5, 6})));
	    }
	}
}
