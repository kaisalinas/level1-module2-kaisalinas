
public class PopcornMaker {
public static void main(String[] args) {
	Popcorn pop = new Popcorn("waffles");
	Microwave hotwave = new Microwave();
	hotwave.putInMicrowave(pop);
	hotwave.setTime(20);
	hotwave.startMicrowave();

}
}
