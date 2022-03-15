package co.com.sofka.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BasicCalculatorTest {
  private final BasicCalculator basicCalculator = new BasicCalculator();

  @Test
  @DisplayName("Testing sum: 1+1=2")
  public void sum() {
    // Arrange
    Long number1 = 1L;
    Long number2 = 1L;
    Long expectedValue = 2L;
    
    // Act
    Long result = basicCalculator.sum(number1, number2);
    
    // Assert
    assertEquals(expectedValue, result);
  }

  @DisplayName("Testing several sums")
  @ParameterizedTest(name = "{0} + {1} = {2}")
  @CsvSource({
          "0,    1,   1",
          "1,    2,   3",
          "49,  51, 100",
          "1,  100, 101"
  })
  public void severalSums(Long first, Long second, Long expectedResult) {
      assertEquals(expectedResult, basicCalculator.sum(first, second),
                  () -> first + " + " + second + " should equal " + expectedResult);
  }

  @Test
  @DisplayName("Testing sub: 1-1=0")
  public void sub() {
    // Arrange
    Long number1 = 1L;
    Long number2 = 1L;
    Long expectedValue = 0L;
    
    // Act
    Long result = basicCalculator.sub(number1, number2);
    
    // Assert
    assertEquals(expectedValue, result);
  }

  @DisplayName("Testing several subs")
  @ParameterizedTest(name = "{2} - {1} = {0}")
  @CsvSource({
          "1,    0,   1",
          "3,    2,   1",
          "100,  51, 49",
          "101,  100, 1"
  })
  public void severalSubs(Long first, Long second, Long expectedResult) {
      assertEquals(expectedResult, basicCalculator.sub(first, second),
                  () -> first + " - " + second + " should equal " + expectedResult);
  }

  @Test
  @DisplayName("Testing mult: 2*2=4")
  public void mult() {
    // Arrange
    Long number1 = 2L;
    Long number2 = 2L;
    Long expectedValue = 4L;
    
    // Act
    Long result = basicCalculator.mult(number1, number2);
    
    // Assert
    assertEquals(expectedValue, result);
  }

  @DisplayName("Testing several mults")
  @ParameterizedTest(name = "{2} * {3} = {6}")
  @CsvSource({
          "1,    1,   1",
          "1,    0,    0",
          "20,  10, 200",
          "5,    5,  25"
  })
  public void severalMults(Long first, Long second, Long expectedResult) {
      assertEquals(expectedResult, basicCalculator.mult(first, second),
                  () -> first + " * " + second + " should equal " + expectedResult);
  }

  @Test
  @DisplayName("Testing div: 6/3=2")
  public void div() {
    // Arrange
    Double number1 = 6.0;
    Double number2 = 3.0;
    Double expectedValue = 2.0;
    
    // Act
    Double result = basicCalculator.div(number1, number2);
    
    // Assert
    assertEquals(expectedValue, result);
  }

  @DisplayName("Testing several divs")
  @ParameterizedTest(name = "{4} / {2} = {2}")
  @CsvSource({
          "4,     4,      1",
          "3,     2,    1.5",
          "100,  30, 3.3333333333333335",
          "5,     0,      NaN"
  })
  public void severalDivs(Double first, Double second, Double expectedResult) {
      assertEquals(expectedResult, basicCalculator.div(first, second),
                  () -> first + " / " + second + " should equal " + expectedResult);
  }
}
