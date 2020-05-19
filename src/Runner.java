import java.util.ArrayList;

public class Runner {

	
	public static void main(String[] arg) {
		
		ArrayList<String> names2 = new ArrayList<String>();
		
		names2.add("Hello");
		names2.add(0, "Ebnig");
		//names2.add(1, "Morning");
		
		//System.out.println(names2);
		
		String [] names = null;
		
		MyArrayList<String> animals = new MyArrayList<String>();
		
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Monkey");
		animals.add("Pig");
		animals.add("Donkey");
		
//		animals.remove("Pig");
//		animals.remove("Monkey");
//		animals.remove("Cat");
		
//		animals.remove(1);
//		animals.remove(2);
		animals.remove(4);
		
//		animals.add("Horse");
//		animals.add("Lion");
		
		animals.print();
		
		System.out.println(animals.size);
		
		//humans.set(0, "William");
		//humans.set(2, "William");
		
		//names[1]= "Pop";
		
//		humans.remove("Pig");
//		humans.remove("Cat");
//		humans.remove("Mike");
//		humans.remove("Dog");
//		humans.remove("Tom");
//		humans.remove("Ryan");
		
		
		
//		MyArrayList<String> animals = new MyArrayList<String>();
//		
//		animals.add("Dog");
//		animals.add("Cat");
//		animals.add("Monkey");
//		animals.add("Pig");
//		
//		animals.remove("Cat");
//		animals.remove("Pig");
//		animals.remove("Dog");
//		animals.remove("Pig");
//		animals.remove("Cat");
//		
//		animals.set(0, "Cat1");
//		
//		for (int i = 0; i < animals.size; i++) {
//        	System.out.println(animals.get(i));
//        }
		
//		System.out.println(animals.get(0));
//		System.out.println(animals.get(1));
//		System.out.println(animals.get(2));
////		System.out.println(animals.get(3));
//		
		

//		ArrayListBuilder<String> animals = new ArrayListBuilder<String>(3);
//		
//		animals.add("Dog");
//		animals.add("Cat");
//		animals.add("Monkey");
//		animals.add("Pig");
//		animals.add("Horse");
//		
//		animals.add("Lion", 3);
//		
//		animals.remove("Dog");
//		
//		System.out.println(animals.get(0));
//		System.out.println(animals.get(1));
//		System.out.println(animals.get(2));
//		System.out.println(animals.get(3));
//		System.out.println(animals.get(4));
	}

}
