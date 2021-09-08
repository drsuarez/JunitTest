package car.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarJUnitTesing {

	@Test
	public void test() {
		Car car = new Car();
		car.setYearModel(2022);
		car.setCarName("Honda");
		car.setCarColor("Black");
		assertEquals(2022, car.getYearModel());
	}

}
