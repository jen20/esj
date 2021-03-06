package net.eventstore.client;

import java.util.UUID;
import lombok.extern.log4j.Log4j;
import net.eventstore.client.tcp.TcpCommand;
import net.eventstore.client.util.Bytes;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@Log4j
@RunWith(JUnit4.class)
public class UtilityTest {

    @Test
    public void bitCheck() {
        for (TcpCommand c : TcpCommand.values()) {
            //log.info(String.format("%s: mask (byte) = %d (%s)", c, c.getMask(), Bytes.toBinaryString(c.getMask())));
        }
    }

    @Test
    public void uuidCheck() {
        UUID id = UUID.randomUUID();
        byte[] bytes = Bytes.toBytes(id);
        assertEquals(16, bytes.length);
        UUID id2 = Bytes.fromBytes(bytes);
        assertEquals(id, id2);
    }

}
