public class DemoFormat{
	public static void main(String[] args){
	
	String a = "Degree";
	String b = "Radians";
	String c = "Sine";
	String d = "Cosine";
	String e = "Tangent";

	System.out.printf("%s", a);
	System.out.printf("%12s", b);
	System.out.printf("%12s", c);
	System.out.printf("%12s", d);
	System.out.printf("%12s\n", e);

	int degrees = 30;
	double radians = Math.toRadians(degrees);
	double sin = Math.sin(radians);
	double cos = Math.cos(radians);
	double tan = Math.tan(radians);

	System.out.printf("%d", degrees);
	System.out.printf("         %.4f", radians);
	System.out.printf("         %.4f", sin);
	System.out.printf("    %.4f", cos);
	System.out.printf("     %.4f\n", tan);
 
	degrees = 60;
	radians = Math.toRadians(degrees);
	sin = Math.sin(radians);
	cos = Math.cos(radians);
	tan = Math.tan(radians);

	System.out.printf("%d", degrees);
	System.out.printf("         %.4f", radians);
	System.out.printf("         %.4f", sin);
	System.out.printf("    %.4f", cos);
	System.out.printf("     %.4f\n", tan);
	}
}