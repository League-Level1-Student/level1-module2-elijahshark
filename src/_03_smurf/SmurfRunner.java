package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf smurf = new Smurf("Papa");
	smurf.eat();
	System.out.println(smurf.getName());
	System.out.println(smurf.getHatColor());
}
}
