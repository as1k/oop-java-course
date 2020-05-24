package task2;

class Problem {

	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder(2, 3);
		Sphere sphere = new Sphere(4);
        Cube cube = new Cube(5);
        System.out.println(cylinder.toString());
        System.out.println(sphere.toString());
        System.out.println(cube.toString());
	}
}