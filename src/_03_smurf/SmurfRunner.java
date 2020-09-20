package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf smurf = new Smurf("Smurfette");
	smurf.eat();
	System.out.println(smurf.getName());
	System.out.println(smurf.getHatColor());
    System.out.println(smurf.isGirlOrBoy());
}
}
