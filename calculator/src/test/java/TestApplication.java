import com.example.calculator.HelloApplication;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApplication {
    @Test
    public void TestSum(){
        HelloApplication app= new HelloApplication();
        int output;
        output = HelloApplication.PerfectSum(20,5);
        assertEquals(25,output,0);
    }
}
