class Exercise0 {
	// Xikai Liu, NUID: 001521786
	// All classes have creation indicator in their constructors.
	// When not provided, a random id will be generated for identification.
	public static void main(String[] args) {
		System.out.println("program start...");
		Car mycar = new Car(9899);
		Car mycar1 = new Car();
		Car mycar2 = new Car(98991);
		Satellite mySat1 = new Satellite();
		Satellite mySat2 = new Satellite(123);
		Satellite mySat3 = new Satellite();
		Refrigerator myRefrige1 = new Refrigerator();
		Refrigerator myRefrige2 = new Refrigerator();
		Refrigerator myRefrige3 = new Refrigerator();
		Camera myCam = new Camera(128);
		Camera myCam1 = new Camera(28);
		Camera myCam2 = new Camera(18);
		Microwave myMW = new Microwave();
		Microwave myMW2 = new Microwave(123);
		Microwave myMW3 = new Microwave(321);
		Phone myPhone = new Phone();
		Phone myPhone13 = new Phone(12);
		Phone myPhone12 = new Phone(13);
		Mouse myMouse = new Mouse();
		Mouse myMouse2 = new Mouse(12);
		Mouse myMouse3 = new Mouse(13);
		Lamp myLamp1 = new Lamp();
		Lamp myLamp2 = new Lamp(2);
		Lamp myLamp3 = new Lamp(3);
		Headphone myHeadphone = new Headphone();
		Headphone myHeadphone1 = new Headphone();
		Headphone myHeadphone2 = new Headphone();
		Student me = new Student();
		Student you = new Student(43);
		Student he = new Student(24);
		System.out.println("program end.");
	}
}
class Car {
	// Car is a class with 2 nested classes
	int id;
	int width;
	int height;
	int length;
	int volume;
	String brand;
	String tire;
	Engine engine;
	Interior intetior;
	Car() {
		this.id = (int)Math.round(Math.random()*1000);
		this.intetior = new Interior();
		this.engine = new Engine();
		System.out.println("Car initialized!");
	}
	Car(int id) {
		this.id = id;
		this.intetior = new Interior();
		this.engine = new Engine();
		System.out.println("Car initialized!");
	}
	private class Engine {
		int power;
		int cylinder;
		Engine() {
			System.out.println("Car engine initialized!");
		}
		void run() {}
		void shutdown() {}
	}
	private class Interior {
		String seats;
		String radio;
		String material;
		Interior() {
			System.out.println("Car interior initialized!");
		}
		void adjustSeats() {}
		void toggleRadio() {}
	}
	void drive() {}
	void doorOpen() {}
	void backUp() {}
}
class Camera {
	int id;
	int width;
	int height;
	int length;
	int volume;
	String lens;
	String shutter;
	String aperture;
	String sensor;
	Camera() {
		System.out.println("Camera initialized!");
	}
	Camera(int id) {
		this.id = id;
		System.out.println("Camera initialized!");
	}
	void takePhoto() {}
	void reviewPhoto() {}
	void takeVideo() {}
}
class Microwave {
	int id;
	int width;
	int height;
	int length;
	int volume;
	String door;
	String display;
	String control;
	String radiator;
	Microwave() {
		this.id = (int)Math.round(Math.random()*1000);
		System.out.println("microwave initialized!");
	}
	Microwave(int id) {
		this.id = id;
		System.out.println("microwave initialized!");
	}
	void cook() {}
	void setConfigration() {}
	void timer() {}
}
class Refrigerator {
	int id;
	int width;
	int height;
	int length;
	int volume;
	String door;
	String display;
	String control;
	String compressor;
	Refrigerator() {
		this.id = (int)Math.round(Math.random()*1000);
		System.out.println("refrigerator initialized!");
	}
	Refrigerator(int id) {
		this.id = id;
		System.out.println("refrigerator initialized!");
	}
	void cooling() {}
	void lightOpen() {}
	void doorOpen() {}
}
class Phone {
	int id;
	int width;
	int height;
	int length;
	int volume;
	String botton;
	String display;
	String speaker;
	String microphone;
	Phone() {
		this.id = (int)Math.round(Math.random()*1000);
		System.out.println("phone initialized!");
	}
	Phone(int id) {
		this.id = id;
		System.out.println("phone initialized!");
	}
	void call() {}
	void browsing() {}
	void playGame() {}
}
class Mouse {
	int id;
	int width;
	int height;
	int length;
	int volume;
	String botton;
	String wheel;
	String sensor;
	String port;
	Mouse() {
		this.id = (int)Math.round(Math.random()*1000);
		System.out.println("Mouse initialized!");
	}
	Mouse(int id) {
		this.id = id;
		System.out.println("Mouse initialized!");
	}
	void connect() {}
	void click() {}
	void move() {}
}
class Lamp {
	int id;
	int width;
	int height;
	int length;
	int volume;
	String bottomDeck;
	String lightBulb;
	String onOffSwitch;
	String plug;
	Lamp() {
		this.id = (int)Math.round(Math.random()*1000);
		System.out.println("Lamp initialized!");
	}
	Lamp(int id) {
		this.id = id;
		System.out.println("Lamp initialized!");
	}
	void plugIn() {}
	void turnOn() {}
	void turnOff() {}
}
class Headphone {
	int id;
	int width;
	int height;
	int length;
	int volume;
	String speaker;
	String cable;
	String control;
	String battery;
	Headphone() {
		this.id = (int)Math.round(Math.random()*1000);
		System.out.println("Headphone initialized!");
	}
	Headphone(int id) {
		this.id = id;
		System.out.println("Headphone initialized!");
	}
	void putOnEars() {}
	void play() {}
	void turnOff() {}
}
class Satellite {
	int id;
	int width;
	int height;
	int length;
	int volume;
	String antenna;
	String battery;
	String solarPanel;
	String computer;
	Satellite() {
		this.id = (int)Math.round(Math.random()*1000);
		System.out.println("Satellite initialized!");
	}
	Satellite(int id) {
		this.id = id;
		System.out.println("Satellite initialized!");
	}
	void transmit() {}
	void engineStart() {}
	void engineOff() {}
}
class Student {
	int id;
	int weight;
	int height;
	int grade;
	int name;
	String eyeColor;
	String skinColor;
	String classes;
	String phoneNumber;
	Student() {
		this.id = (int)Math.round(Math.random()*1000);
		System.out.println("Student initialized!");
	}
	Student(int id) {
		this.id = id;
		System.out.println("Student initialized!");
	}
	void study() {}
	void takeClass() {}
	void dropClass() {}
}