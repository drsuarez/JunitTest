package weapon.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class WeaponListTesting {

	@Test
	public void test() {
		Weapon weapon = new Weapon();
		List<String> list =  new ArrayList<String>();
		list.add("AK47");
		list.add("Sniper");
		list.add("M15");
		list.add("Pistol");
		list.add("Machine Gun");
		assertEquals(list, weapon.weaponList());
		
	}

}
