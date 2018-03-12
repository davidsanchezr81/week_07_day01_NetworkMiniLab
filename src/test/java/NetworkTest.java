import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetworkTest {

    Network network;
    Desktop desktop;

    @Before
    public void before() {
        network = new Network("CodeClan", 2);
        desktop = new Desktop("Keith's Desktop", "Apple", "Macbook Pro");
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan", network.getName());
    }

    @Test
    public void deviceListStartsEmpty() {
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void canConnectDesktop() {
        network.connect(desktop);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void cannotConnetDesktop(){
        network.connect(desktop);
        network.connect(desktop);
        network.connect(desktop);
        assertEquals(2, network.deviceCount());
    }

    @Test
    public void shouldEmptyDeviceListAfterDisconnectingAll() {
        network.connect(desktop);
        network.disconnectAll();
        assertEquals(0, network.deviceCount());
    }


    @Test
    public void hasFreeSlots() {
        network.connect(desktop);
        assertEquals(1, network.howManyFreeSlots());
    }
}
