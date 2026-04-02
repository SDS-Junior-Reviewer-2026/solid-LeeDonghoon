package vehicle;


import greeter.GreeterTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {
    @Test
    public void test_sample() {
        Vehicle vehicle = new Vehicle(10);
        assertEquals(10, vehicle.getRemainingFuel()); 
    }

    @Test
    void accelerate_1_time() {
        //arrange
        Vehicle vehicle = new Vehicle(10);

        //act
        vehicle.accelerate();

        assertEquals(9, vehicle.getRemainingFuel());
    }

    @Test
    void accelerate_AND_refuel() {
        //arrange
        Vehicle vehicle = new Vehicle(10);
        GasStation gasStation = new GasStation();

        //act
        for (int i=0; i < 5; i++){
            vehicle.accelerate();
        }
        gasStation.reFuel(vehicle);

        //assert
        assertEquals(10, vehicle.getRemainingFuel());
    }
}
