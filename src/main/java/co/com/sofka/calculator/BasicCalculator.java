package co.com.sofka.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
  private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

  public BasicCalculator(){}

  public Long sum(Long number1, Long number2) {
    logger.info( "Summing {} + {}", number1, number2 );
    return number1 + number2;
  }

  public Long sub(Long number1, Long number2) {
    logger.info( "Subtracting {} - {}", number1, number2 );
    return number1 - number2;
  }

  public Long mult(Long number1, Long number2) {
    logger.info( "Multipliying {} * {}", number1, number2 );
    return number1 * number2;
  }

  public Double div(Double number1, Double number2) {
    if(number2 == 0){
      logger.info( "Cannot divide by zero. {} / {}", number1, number2 );
      return Double.NaN;
    }
    logger.info( "Dividing {} / {}", number1, number2 );
    return number1 / number2;
  }
}
