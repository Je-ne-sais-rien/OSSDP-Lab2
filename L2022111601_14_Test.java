import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class L2022111601_14_Test {
    /*
     *  1. 字符串长度为小于 4
     *  2. 字符串长度为 4 ~ 11, 且有合理的解
     *  3. 字符串长度为等于 12, 且有合理的解
     *  4. 字符串长度为等于 12, 但无合理的解
     *  5. 字符串长度为大于 12
     */

    Solution solution = new Solution();

    @Test
    public void tc1() {
        List<String> result = solution.restoreIpAddresses("123");
        assertEquals(List.of(), result);
    }

    @Test
    public void tc2() {
        List<String> result = solution.restoreIpAddresses("101023");
        assertEquals(List.of(
            "1.0.10.23", 
            "1.0.102.3", 
            "10.1.0.23", 
            "10.10.2.3", 
            "101.0.2.3"), result);
    }

    @Test
    public void tc3() {
        List<String> result = solution.restoreIpAddresses("255255255255");
        assertEquals(List.of("255.255.255.255"), result);
    }

    @Test
    public void tc4() {
        List<String> result = solution.restoreIpAddresses("256256256256");
        assertEquals(List.of(), result);
    }

    @Test
    public void tc5() {
        List<String> result = solution.restoreIpAddresses("1234567890123");
        assertEquals(List.of(), result);
    }
}
