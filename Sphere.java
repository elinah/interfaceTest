public class Sphere extends Circle{

    public Sphere(double radius, String name){
	super(radius,name);
    }

    public double getVolume(){
	Math.PI * Math.pow(radius, 3) * (4 / 3);
    }

    public String toString(){
	return "FIXME!";
    }
}