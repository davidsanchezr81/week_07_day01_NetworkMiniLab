import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InternetRadioTest {

    InternetRadio radio;

    @Before
    public void before(){
        radio = new InternetRadio();
    }

    @Test
    public void canTune(){
        assertEquals("Tuned Radio 1", radio.tune("Radio 1"));
    }
}
