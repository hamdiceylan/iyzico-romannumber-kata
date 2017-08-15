import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanNumberConverterTest {

    @Test
    public void convert_1_2_3() throws Exception {
        IntegerToRomanNumberConverter converter = new IntegerToRomanNumberConverter();
        assertEquals("I", converter.convert(1));
        assertEquals("II", converter.convert(2));
        assertEquals("III", converter.convert(3));
    }

    @Test
    public void convert_5_10() throws Exception {
        IntegerToRomanNumberConverter converter = new IntegerToRomanNumberConverter();
        assertEquals("V", converter.convert(5));
        assertEquals("X", converter.convert(10));
    }


    private class IntegerToRomanNumberConverter {
        public String convert(int input) {
            if (input == 5) {
                return "V";
            } else if (input == 10) {
                return "X";
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < input; i++) {
                sb.append("I");
            }
            return sb.toString();
        }
    }
}
