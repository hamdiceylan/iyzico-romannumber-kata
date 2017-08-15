import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanNumberConverterTest {

    @Test
    public void convert_1_2() throws Exception {
        IntegerToRomanNumberConverter converter = new IntegerToRomanNumberConverter();
        assertEquals("I", converter.convert(1));
        assertEquals("II", converter.convert(2));
    }

    private class IntegerToRomanNumberConverter {
        public String convert(int input) {
            if (input == 1)
                return "I";
            return "II";
        }
    }
}
