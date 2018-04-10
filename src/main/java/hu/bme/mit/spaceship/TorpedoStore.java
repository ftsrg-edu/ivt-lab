package hu.bme.mit.spaceship;

import java.util.Random;

/**
* Class storing and managing the torpedoes of a ship
*/
public class TorpedoStore {

  private int torpedoes = 0;
  private Random generator = new Random();

  public TorpedoStore(int numberOfTorpedoes){
    this.torpedoes = numberOfTorpedoes;
  }

  public boolean fire(int numberOfTorpedoes){
    if(numberOfTorpedoes < 1 || numberOfTorpedoes > this.torpedoes){
      throw new IllegalArgumentException("numberOfTorpedoes");
    }

    boolean success = false;

    //simulate random overheating of the launcher bay which prevents firing
    double r = generator.nextDouble();

    if (r > 0.01) {
      // successful firing
      this.torpedoes -= numberOfTorpedoes;
      success = true;
    } else {
      // failure
      success = false;
    }

    return success;
  }

  public boolean isEmpty(){
    return this.torpedoes <= 0;
  }

  public int getNumberOfTorpedos() {
    return this.torpedoes;
  }
}
