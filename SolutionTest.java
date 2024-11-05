import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
    * 测试用例
    * 等价类划分
    * case 1: 两个因子都是简单的数字（样例测试）
    * case 2: 一个因子为 0
    * case 3: 一个因子为 1
    * case 4: 两个因子都是大数
    * case 5: 两个因子都是个位数
    * case 6: 两个因子相同
 */


class SolutionTest {

    @Test
    void testMultiply_SimpleCases() {
        Solution solution = new Solution();

        // 示例 1
        assertEquals("6", solution.multiply("2", "3"));

        // 示例 2
        assertEquals("56088", solution.multiply("123", "456"));
    }

    @Test
    void testMultiply_EdgeCases() {
        Solution solution = new Solution();

        // 测试一个因子为 0 的情况
        assertEquals("0", solution.multiply("123456789", "0"));
        assertEquals("0", solution.multiply("0", "987654321"));

        // 测试因子为 1 的情况
        assertEquals("987654321", solution.multiply("987654321", "1"));
        assertEquals("123456789", solution.multiply("1", "123456789"));
    }

    @Test
    void testMultiply_LargeNumbers() {
        Solution solution = new Solution();

        // 测试两个大数相乘
        assertEquals("121932631112635269", solution.multiply("123456789", "987654321"));


        assertEquals("100000000000000000000", solution.multiply("10000000000", "10000000000"));
    }

    @Test
    void testMultiply_SingleDigitCases() {
        Solution solution = new Solution();

        // 测试个位数相乘
        assertEquals("1", solution.multiply("1", "1"));
        assertEquals("9", solution.multiply("3", "3"));
        assertEquals("10", solution.multiply("2", "5"));
    }

    @Test
    void testMultiply_SameNumberMultipleTimes() {
        Solution solution = new Solution();

        // 测试同一个数字多次相乘
        assertEquals("100", solution.multiply("10", "10"));
        assertEquals("10000", solution.multiply("100", "100"));
    }
}
