package hu.bme.mit.spaceship;

import java.util.Random;

/**
* Class storing and managing the torpedoes of a ship
*/
public class TorpedoStore {

  private int torpedoCount = 0;
  private Random generator = new Random();

  public TorpedoStore(int numberOfTorpedos){
    this.torpedoCount = numberOfTorpedos;
  }

  public boolean fire(int numberOfTorpedos){
    if(numberOfTorpedos < 1 || numberOfTorpedos > this.torpedoCount){
      throw new IllegalArgumentException("numberOfTorpedos");
    }

    boolean success = false;

    //simulate random overheating of the launcher bay which prevents firing
    double r = generator.nextDouble();

    if (r > 0.01) {
      // successful firing
      this.torpedoCount -= numberOfTorpedos;
      success = true;
    } else {
      // failure
      success = false;
    }

    return success;
  }

  public boolean isEmpty(){
    return this.torpedoCount <= 0;
  }

  public int getTorpedoCount() {
    return this.torpedoCount;
  }
}
