
package base1;

//default class created
class sub1 extends base1 {

	int i, j;

	// default constructor invokes default parent constructor first
	sub1() {
		// super();
		System.out.println("This is default constructor of derived class");
	}

	// parameterized constructor invokes default parent constructor first
	sub1(int i) {
		this.i = i;
		System.out.println("This is parameterised constructor (1) of derived class");
	}

	// parameterized constructor invokes parameterized parent constructor first
	sub1(int i, int j) {
		super(i, j);
		this.i = i;
		this.j = j;
		System.out.println("This is parameterised constructor (2) of derived class");
	}
}
