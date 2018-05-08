public class Camera extends Machine{

	public void start() {
		System.out.println("Camera started");
		
	}
	
	public void snap() {
		System.out.println("Photo taken.");
	}
	
	public Camera() {
		
	}
 public Camera(Integer id, String color) {
	 super(id, color);
 }
	

	public static void main(String[] args) {
		Machine M1 = new Camera(1,"black"); //up casting
		M1.start();
		M1.stop();
		//M1.snap(); Method undefined
	
		//Camera C1 = new Machine();	
		Camera C1 = (Camera)M1;        //down casting
		C1.start();
		C1.stop();
		C1.snap();
	
	
	}
	
	
	
	
	

	}
