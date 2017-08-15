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

    private class IntegerToRomanNumberConverter {
        public String convert(int input) {
            if (input >= 1) {
                StringBuilder sb = new StringBuilder();
                for (int i=0; i<input; i++) {
                    sb.append("I");
                }
                return sb.toString();
            } else {
                if (input == 1)
                    return "I";
                else if (input == 2)
                    return "II";
                return "III";
            }
        }
    }
}
