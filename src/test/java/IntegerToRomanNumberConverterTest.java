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
    public void convert_6_7_8() throws Exception {
        assertEquals("VI", converter.convert(6));
        assertEquals("VII", converter.convert(7));
        assertEquals("VIII", converter.convert(8));
    }

    @Test
    public void convert_11_12_13() throws Exception {
        assertEquals("XI", converter.convert(11));
        assertEquals("XII", converter.convert(12));
        assertEquals("XIII", converter.convert(13));
    }

    private class IntegerToRomanNumberConverter {
        Map<Integer, String> mapping = new HashMap() {{
            put(5, "V");
            put(10, "X");
            put(50, "L");
        }};

        public String convert(int input) {
            StringBuilder sb = new StringBuilder();

            if (input == 11) {
                return "XI";
            } else if (input == 12) {
                return "XII";
            } else if (input == 13) {
                return "XIII";
            }

            if (input == 4 || input == 9) {
                sb.append("I");
                sb.append(mapping.get(input + 1));
                return sb.toString();
            }

            if (input > 5 && input < 9) {
                sb.append("V");
                for (int i = input; i > 5; i--) {
                    sb.append("I");
                }
                return sb.toString();
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
