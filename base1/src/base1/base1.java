
package base1;

//parent class created
class base1 {

	int i, j;

	// default constructor created
	base1() {
		System.out.println("This is default constructor of base class");
	}

	// parameterized constructor created
	base1(int i, int j) {
		this.i = i;
		this.j = j;
		System.out.println("This parameterized constructor of base class");
	}
}
