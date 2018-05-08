
public class Machine {
	private Integer id;
	private String color;
	
	public void start() {
		System.out.println("Machine id is:" + id);
		System.out.println("Machine color is:" + color);
		System.out.println("Machine Started");
	}
	
	public void stop() {
		System.out.println("Machine Stopped");
	}
	

	public Machine() {
	
	}

   public Machine(Integer id, String color) {
	     this.id = id;
	     this.color = color;
	}



}
