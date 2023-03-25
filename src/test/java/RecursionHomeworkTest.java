import org.assertj.core.api.Assertions;
import org.fasttrackit.RecursionHomework;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RecursionHomeworkTest {
    @Test
    void initClass() {
        RecursionHomework recursionHomework = new RecursionHomework();
    }

    @Test
    @DisplayName("WHEN calling the method THEN the test passes")
    void testCallMethodsumOfFirstIntegerNumbers() {
        RecursionHomework recursionHomework = new RecursionHomework();
        RecursionHomework.sumOfFirstIntegersNumbers(12);
    }

    @Test
    @DisplayName("WHEN calculate sum of first n integers numbers THEN the correct sum is returned")
    void testSumOfFirstIntegersNumbers() {
        RecursionHomework recursionHomework = new RecursionHomework();
        int result = RecursionHomework.sumOfFirstIntegersNumbers(12);
        Assertions.assertThat(result).isEqualTo(78);
    }


    @Test
    @DisplayName("WHEN calling the method THEN the test passes")
    void testCallMethodsumOfFirstEvenIntegers() {
        RecursionHomework recursionHomework = new RecursionHomework();
        RecursionHomework.sumOfFirstEvenIntegers(6);

    }

    @Test
    @DisplayName("WHEN calculate sum of first n even integers numbers THEN the correct sum is returned")
    void testsumOfFirstEvenIntegers() {
        RecursionHomework recursionHomework = new RecursionHomework();
        int result = RecursionHomework.sumOfFirstEvenIntegers(6);
        Assertions.assertThat(result).isEqualTo(12);
        Assertions.assertThat(result).isPositive();
    }

    @Test
    @DisplayName("WHEN calling the method THEN the test passes")
    void testCallMethodPalindromeWordMode1() {
        RecursionHomework recursionHomework = new RecursionHomework();
        RecursionHomework.palindromeWordMode1("mama");

    }

    @Test
    @DisplayName("WHEN the number is palindrom  THEN true is returned")
    void testPalindromeWordMode1() {
        RecursionHomework recursionHomework = new RecursionHomework();
        boolean word = RecursionHomework.palindromeWordMode1("ana");
        Assertions.assertThat(word).isTrue();
        Assertions.assertThat(word).isEqualTo(true);
        Assertions.assertThat(word).isNotNull();

    }

    @Test
    @DisplayName("WHEN calling the method THEN the test passes")
    void testCallMethodSumOfDigitsforNumber() {
        RecursionHomework recursionHomework = new RecursionHomework();
        RecursionHomework.sumOfDigitsforNumber(2347);

    }

    @Test
    @DisplayName("WHEN calculate sum of digit numbers THEN the correct sum is returned")
    void testSumOfDigitsforNumber() {
        RecursionHomework recursionHomework = new RecursionHomework();
        double sum = RecursionHomework.sumOfDigitsforNumber(2347);
        Assertions.assertThat(sum).isPositive();
        Assertions.assertThat(sum).isEqualTo(16);
        Assertions.assertThat(sum).isGreaterThan(1);

    }

    @Test
    @DisplayName("WHEN calling the method THEN the test passes")
    void testCallMethodFibonacciArray() {
        RecursionHomework recursionHomework = new RecursionHomework();
        RecursionHomework.fibonacciArray(3);

    }

    @Test
    @DisplayName("WHEN you need n-th element from fibonacci's array THEN n-th element is returned")
    void testFibonacciArray() {
        RecursionHomework recursionHomework = new RecursionHomework();
        int number = RecursionHomework.fibonacciArray(3);
        Assertions.assertThat(number).isEqualTo(2);
    }
}
