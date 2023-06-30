package org.suraj;

import java.util.Map;
import java.util.TreeMap;

class App implements Comparable<App>{
	private String eId;
	private String id ;
	
	public App(String eId, String id) {
		this.eId = eId;
		this.id = id;
	}

	public String geteId() {
		return eId;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "App [eId=" + eId + ", id=" + id + "]";
	}
	
	@Override
	public int compareTo(App o) {
		String app1 = eId.concat(id);
		String app2 = o.geteId() + o.getId();
		return app1.compareTo(app2);
	}
	
}

public class Main {

	public static void main(String[] args) {
		Map <App, String> listMap = new TreeMap<>();
		listMap.put(new App("1", "01"), "Suraj");
		listMap.put(new App("1", "02"), "Raja");
		listMap.put(new App("1", "03"), "Sachin");
		listMap.put(new App("1", "04"), "Meeet");
		listMap.put(new App("2", "01"), "Shiv");
		listMap.put(new App("2", "02"), "Arjun");
		listMap.put(new App("2", "03"), "Ravan");
		listMap.put(new App("3", "01"), "krishna");
		listMap.put(new App("3", "02"), "Hello");
		listMap.put(new App("2", "03"), "Ram");
		listMap.put(new App("1", "01"), "Nikunj");
		for (Map.Entry<App, String> list : listMap.entrySet()) {
			System.out.println(list);
		}
	}

}
