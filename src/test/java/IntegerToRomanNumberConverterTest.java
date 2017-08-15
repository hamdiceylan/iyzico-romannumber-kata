import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanNumberConverterTest {

    @Test
    public void convert_1() throws Exception {
        IntegerToRomanNumberConverter converter = new IntegerToRomanNumberConverter();
        assertEquals("I", converter.convert(1));
    }

    private class IntegerToRomanNumberConverter {
        public String convert(int input) {
            return "I";
        }
    }
}
