package kata_5656b6906de340bd1b0000ac;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoToOneTest {

    @Test
    public void test() {
        System.out.println("longest Fixed Tests");
        assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));
        assertEquals("abcdefghilnoprstu", TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("acefghilmnoprstuy", TwoToOne.longest("inmanylanguages", "theresapairoffunctions"));
    }
}
