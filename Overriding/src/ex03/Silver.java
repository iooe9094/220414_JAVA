package ex03;

public class Silver extends Normal{
	
	@Override
	public void show() {
		id = 3;
		name = "ha";
		rank = "Silver";
		System.out.println("id = " + id + " name = " + name + " rank = " + rank);
}
}
