package hello;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by rara on 2017/04/22.
 */
public class HelloTest {

    @Test
    public void testMessage() {
        assertThat(new Hello().message(), is("Hello"));
    }
}
