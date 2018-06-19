
public class TeaMakers {
public static void main(String[] args) {
	TeaBag bobby = new TeaBag("flavor");
	
	Kettle bob = new Kettle();
	bob.getWater();
	bob.boil();
	Cup bobb = new Cup();
	bobb.makeTea(bobby, bob.getWater());
}
}
