package Day11.Threads;

import java.io.Serializable;

public class Studentinfo implements Serializable {
	String name;
	int rid;
	String contact;

	Studentinfo(String n, int r, String c) {
		this.name = n;
		this.rid = r;
		this.contact = c;
	}
}
