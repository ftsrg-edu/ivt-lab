package hu.bme.mit.spaceship;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GT4500Test {

  private GT4500 ship;

  @Before
  public void init(){
    this.ship = new GT4500();
  }

  @Test
  public void fireTorpedoes_Single_Success(){
    // Arrange

    // Act
    boolean result = ship.fireTorpedoes(FiringMode.SINGLE);

    // Assert
    assertEquals(true, result);
  }

  @Test
  public void fireTorpedoes_All_Success(){
    // Arrange

    // Act
    boolean result = ship.fireTorpedoes(FiringMode.ALL);

    // Assert
    assertEquals(true, result);
  }

}
