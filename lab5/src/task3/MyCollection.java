package task3;

interface MyCollection {
	  void add(Object obj);
	  int size();
	  void clear();
	  Object elementAt(int index);
	  String toString();
	  Object[] toArray();
	  boolean equals(Object anotherObject);
	  int hashCode();
	  Object get(int index);
	  void insertElementAt(int index, Object o);
	  boolean isEmpty();
	  void remove(Object o);
	  int[] sort(int[] arr);
	  int[] duplicate(int[] arr);
	  boolean contains(Object o);
}