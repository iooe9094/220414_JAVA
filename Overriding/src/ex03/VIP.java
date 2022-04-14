package ex03;

public class VIP extends Normal {
	
	@Override
	public void show() {
		id = 1;
		name = "hong";
		rank = "VIP";
		System.out.println("id = " + id + " name = " + name + " rank = " + rank);
	}
}
