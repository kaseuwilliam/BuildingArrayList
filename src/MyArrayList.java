public class MyArrayList<E> {
	
	/*
	 * Do not change this initial capacity; it is used by our test cases
	 */
	private static final int INITIAL_CAPACITY = 4;

	/*
	 *  These are protected so that test cases can access them.
	 *  Please do not change the visibility of these fields!
	 */
	protected E[] data;
	protected int size = 0;
	
	public MyArrayList() {
		data = (E[]) new String[INITIAL_CAPACITY];
	}

	/*
	 * Need to implement this in step 5
	 */
	public MyArrayList(E [] arr) {
		
		if(arr== null) {
			
			data = (E[]) new String[INITIAL_CAPACITY];
			
		} else {
		
			data = arr;
		
			size = data.length;
		}
	}
	
	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		else return data[index];
	}
	
	private void increaseCapacity() {
		E [] newData = (E[]) new String[2 * data.length];
		System.arraycopy(data, 0, newData, 0, size);
		data = newData;
	}
	
	/*
	 * This method adds the element to the list.
	 * Except for modifying it to use Java Generics,
	 * DO NOT OTHERWISE CHANGE THIS METHOD
	 * as it is used in testing your code.
	 */
	public void add(E value) {
		if (size == data.length) {
			increaseCapacity();
		}
		data[size++] = value;
	}
	
	public void add(int index, E element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		if (size == data.length) {
			increaseCapacity();
		}
		for (int i = size-1; i >= index; i--) {
			data[i+1] = data[i];
		}
		data[index] = element;
		size++;
	}



	public E remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		E target = data[index];
		for (int i = index; i < size - 1; i++) {
			data[i] = data[i + 1];
		}
		size--;
		
		shrinker();
		//System.out.println("The size is "+size); //we will delete this
		return target;
	}
	

	/*
	 * Need to implement this in Step 2.
	 */
	
	public boolean remove(E obj) {
		
		int indexToRemove=-1;
		
		int sizeToUse = size -1;
		
		for(int i=0; i<size; i++) {
			
			if(data[i].equals(obj)){
				
				indexToRemove=i;
				
				break;
			}
		}
		
		if(indexToRemove>=0) {
			
			E [] newData = (E[]) new String[data.length];
			
			for(int i=0; i<indexToRemove; i++) {
				
				newData[i] = data[i];	
			}
			
			System.arraycopy(data, indexToRemove+1, newData, indexToRemove, size - indexToRemove -1);
			
			data = newData;

			size--;
			
			shrinker();
			
			return true;
			
		} else {
			
			return false;
		}
							
		//return false;
	}
	
	public void shrinker() {
		
		double lengthOfArrayDouble = size * 0.25;
		
		double lengthOfArray = (int) lengthOfArrayDouble;
		
		int sumOfOccupiedElements = 0;
		
		for (int i=0; i<size; i++) {
			
			if( data[i] != null ) {
				
				sumOfOccupiedElements++;
				
				//System.out.println(sumOfOccupiedElements);
			}
		}
		
		if(sumOfOccupiedElements<= lengthOfArray) {
			
			size/=2;
			
			System.arraycopy(data, 0, data, 0, size);
		}
		
	}
	
	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.println(i + ": " + data[i]);
		}
	}
	
	public boolean contains(E obj) {
		for (int i = 0; i < size; i++) {
			if (data[i].equals(obj))
				return true;
		}
		return false;
	}
	
	/*
	 * Need to implement this in Step 4
	 */
	public E set(int index, E obj) {
		
		if(index <0 || index >= size) {
			
			throw new IndexOutOfBoundsException();
		} else {
			
		E newWord = data[index];
		
		data[index] = obj;
		
		return newWord;
		}
	}	
}