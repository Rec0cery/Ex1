import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * This JUnit class represents a very partial test class for Ex1.
 * Make sure you complete all the needed JUnits
 */
public class Ex1Test
{
    @Test
    void computeNumberTest()
    {
        String s2 = "1011b2";
        int v = Ex1.number2Int(s2);
        assertEquals(v,11);
        String s10 = "1011bA";
        v = Ex1.number2Int(s10);
        s2 = Ex1.int2Number(v,2);
        int v2 = Ex1.number2Int(s2);
        assertEquals(v,v2);
        assertTrue(Ex1.equals(s10,s2));
    }

    @Test
    void isBasisNumberTest()
    {
        String[] good = {"1b2", "01b2", "123bA", "ABbG", "0bA"};
        for(int i=0;i<good.length;i=i+1)
        {
            boolean ok = Ex1.isNumber(good[i]);
            assertTrue(ok);
        }
        String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
        for(int i=0;i<not_good.length;i=i+1)
        {
            boolean not_ok = Ex1.isNumber(not_good[i]);
            assertFalse(not_ok);
        }
    }
    @Test
    void int2NumberTest()
    {
        int[] ValuesToConvert = {30, 123, 446, 7789};
        int[] BaseToConvert= {4, 5, 2, 10};
        String[] ValuesAfterConvertion = {"132b4", "443b5", "110111110b2", "7789bA"};
        boolean flag;
        for(int i=0;i<ValuesToConvert.length;i++)
        {
            if((Ex1.int2Number(ValuesToConvert[i], BaseToConvert[i]).equals(ValuesAfterConvertion[i])))
                flag=true;
            else flag=false;
            assertTrue(flag);
        }
    }
    @Test
    void maxIndexTest()
    {
        String[] arr = {"132b4", "443b5", "110111110b2", "7789bA"};
        assertEquals(3, Ex1.maxIndex(arr));
    }
    @Test
    void CheckFormatAfterbTest()
    {
        String[] ValueToCheckAfterB = {"132b44", "443b5", "110111110b-2", "7789bA"};
        boolean[] LegalityOfValueAfterB={false, true, false, true};
        for(int i=0;i<ValueToCheckAfterB.length;i++)
            Assert.assertEquals(Ex1.CheckFormatAfterb(ValueToCheckAfterB[i]), LegalityOfValueAfterB[i]);
    }
    @Test
    void CheckFormatBeforebTest()
    {
        String[] ValueToCheckBeforeB = {"162b4", "443b5", "110121110b2", "7789bA"};
        boolean[] LegalityOfValueBeforeB={false, true, false, true};
        for(int i=0;i<ValueToCheckBeforeB.length;i++)
            Assert.assertEquals(Ex1.CheckFormatBeforeb(ValueToCheckBeforeB[i]), LegalityOfValueBeforeB[i]);
    }
}