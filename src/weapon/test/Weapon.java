package weapon.test;


import java.util.ArrayList;
import java.util.List;

public class Weapon {
	
	public List<String> weaponList() {
		List<String> listWeapon =  new ArrayList<String>();
		listWeapon.add("AK47");
		listWeapon.add("Sniper");
		listWeapon.add("M15");
		listWeapon.add("Pistol");
		listWeapon.add("Machine Gun");
		return listWeapon;
	}

}
