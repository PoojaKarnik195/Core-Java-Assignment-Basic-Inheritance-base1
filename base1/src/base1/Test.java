
package base1;

/**
 * @author Pooja Karnik Program to perform single level inheritance having constructors with different parameters
 *
 */
//testing constructor invocation 
class Test {

	// passing different parameters to constructors
	public static void main(String[] args) {

		sub1 s1 = new sub1();
		sub1 s2 = new sub1(10);
		sub1 s3 = new sub1(10, 20);
	}
}
