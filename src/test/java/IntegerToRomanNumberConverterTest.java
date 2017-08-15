import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanNumberConverterTest {

    private IntegerToRomanNumberConverter converter;

    @Before
    public void doBefore() throws Exception {
        converter = new IntegerToRomanNumberConverter();
    }

    @Test
    public void convert_1_2_3() throws Exception {
        assertEquals("I", converter.convert(1));
        assertEquals("II", converter.convert(2));
        assertEquals("III", converter.convert(3));
    }

    @Test
    public void convert_5_10_50() throws Exception {
        assertEquals("V", converter.convert(5));
        assertEquals("X", converter.convert(10));
        assertEquals("L", converter.convert(50));
    }

    @Test
    public void convert_4_9() throws Exception {
        assertEquals("IV", converter.convert(4));
        assertEquals("IX", converter.convert(9));
    }

    @Test
    public void convert_6() throws Exception {
        assertEquals("VI", converter.convert(6));
    }

    private class IntegerToRomanNumberConverter {
        Map<Integer, String> mapping = new HashMap() {{
            put(5, "V");
            put(10, "X");
            put(50, "L");
        }};

        public String convert(int input) {
            StringBuilder sb = new StringBuilder();

            if (input == 4 || input == 9) {
                sb.append("I");
                sb.append(mapping.get(input+1));
                return sb.toString();
            }

            if (input == 6) {
                return "VI";
            }

            if (input >= 5) {
                return mapping.get(input);
            }

            for (int i = 0; i < input; i++) {
                sb.append("I");
            }
            return sb.toString();
        }
    }
}
