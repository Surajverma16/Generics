package org.suraj;


abstract class Lock{
	public abstract boolean isUnlocked(String key);
}
public class Door {
	
	Lock lock = new Lock() {
		
		@Override
		public boolean isUnlocked(String key) {
			if(key.equals("abc")) {
				return true;
			}else {				
				return false;
			}

		}
	};

	public Lock getLock() {
		return lock;
	}

}
