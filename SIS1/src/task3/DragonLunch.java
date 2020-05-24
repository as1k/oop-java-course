package task3;

import java.util.Vector;

class DragonLunch {
	Vector<Person> v = new Vector<Person>();
	public DragonLunch() {
		
        }
	
	public void kidnap(Person p) {
		v.add(p);
        }
	
	public boolean willDragonEatOrNot() {
		int cnt = 0;
		for (int i = 0; i < v.size(); i++) {
            if (v.get(i).getGender() == Gender.MALE)
                cnt++;
            else
                cnt--;
            if (cnt < 0) return true;
        }
        return false;
		}
	
	public static void main(String[] args) {
		DragonLunch lunch1 = new DragonLunch();
		DragonLunch lunch2 = new DragonLunch();
		DragonLunch lunch3 = new DragonLunch();
		DragonLunch lunch4 = new DragonLunch();

		lunch1.kidnap(new Person(Gender.FEMALE));
		lunch1.kidnap(new Person(Gender.FEMALE));
		lunch1.kidnap(new Person(Gender.FEMALE));
		lunch1.kidnap(new Person(Gender.MALE));

		lunch2.kidnap(new Person(Gender.FEMALE));
		lunch2.kidnap(new Person(Gender.MALE));
		lunch2.kidnap(new Person(Gender.FEMALE));
		lunch2.kidnap(new Person(Gender.MALE));
		
		lunch3.kidnap(new Person(Gender.MALE));
		lunch3.kidnap(new Person(Gender.MALE));
		lunch3.kidnap(new Person(Gender.FEMALE));
		lunch3.kidnap(new Person(Gender.FEMALE));

		System.out.println(lunch1.willDragonEatOrNot());
		System.out.println(lunch2.willDragonEatOrNot());
		System.out.println(lunch3.willDragonEatOrNot());
		System.out.println(lunch4.willDragonEatOrNot());
	}
}