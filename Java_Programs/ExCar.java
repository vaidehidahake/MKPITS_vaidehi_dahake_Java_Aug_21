//wap to create a class Car having fields modelno, color, make and methods start,stop.
class Car {

	String modal;
	String color;

	public void start() {
		System.out.println("car is started");
	}

	public void stop() {
		System.out.println("car is stopped");
	}
}


 class ExCar
 {
	  public static void main(String[] arg)
	  	{
	  		Car c1=new Car();
	  		c1.modal="breeza";
	  		c1.color="black";
	  		System.out.println("modal = " + c1.modal);
	  		System.out.println("color = " + c1.color);
	  		c1.start();
	  		c1.stop();
	  	}
	  }
