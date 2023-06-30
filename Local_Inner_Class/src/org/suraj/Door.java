package org.suraj;


public class Door {
	
	public String lock(String key) {
		 class Lock{
			public String isLocked(String key) {
				if(key.equals("abc")) {
					return "Door is unlocked";
				}else {
					return "Door is locked";
				}
			}
		}
		return new Lock().isLocked(key);
	}
	
	
}
