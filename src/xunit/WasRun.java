package xunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WasRun extends TestCase {
    public boolean wasRun;
    public boolean wasSetUp;

    public WasRun(String name) {
        super(name);
    }

    @Override
    public void setUp() {
        wasSetUp = true;
    }

    public void testMethod() {
        wasRun = true;
    }
}
