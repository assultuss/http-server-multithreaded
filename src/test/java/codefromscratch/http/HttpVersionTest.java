package codefromscratch.http;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HttpVersionTest {
    @Test
    void getBestCompatibleVersionExactMatch() {
        HttpVersion version = null;
        try {
            version = HttpVersion.getBestCompatibleVersion("HTTP/1.1");
        } catch (BadHttpVersionException e) {
            fail();
        }
        assertNotNull(version);
        assertEquals(version, HttpVersion.HTTP_1_1);
    }
}