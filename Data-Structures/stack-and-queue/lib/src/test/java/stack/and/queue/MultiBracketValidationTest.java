package stack.and.queue;

import org.junit.Test;

import static org.junit.Assert.*;

    public class MultiBracketValidationTest {
        @Test
        public void testMultiBracketValidationEmptyString() {
            assertEquals("Test Empty String",true,MultiBracketValidation.multiBracketValidation(""));
        }

        @Test public void testMultiBracketValidationTrueCases() {

        MultiBracketValidation multiBracketValidation = new MultiBracketValidation();
            assertEquals(true,MultiBracketValidation.multiBracketValidation("{}"));
            assertEquals(true,MultiBracketValidation.multiBracketValidation("{}(){}"));
            assertEquals(true,MultiBracketValidation.multiBracketValidation("()[[Extra Characters]]"));
            assertEquals(true,MultiBracketValidation.multiBracketValidation("(){}[[]]"));
            assertEquals(true,MultiBracketValidation.multiBracketValidation("{}{Code}[Fellows](())"));
        }



        @Test public void testMultiBracketValidationFalseCases() {
            assertEquals(false,MultiBracketValidation.multiBracketValidation("[({}]"));
            assertEquals(false,MultiBracketValidation.multiBracketValidation("(]("));
            assertEquals(false,MultiBracketValidation.multiBracketValidation("{(})"));
            assertEquals(false,MultiBracketValidation.multiBracketValidation("{"));
            assertEquals(false,MultiBracketValidation.multiBracketValidation(")"));
            assertEquals(false,MultiBracketValidation.multiBracketValidation("[}"));
        }
}
