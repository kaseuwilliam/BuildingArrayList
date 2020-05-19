
public class ArrayListBuilder<E> {

	private E[] data;
	private int sizeOfArray;

	public ArrayListBuilder(int capacity) {

		data = (E[]) new Object[capacity];

		this.sizeOfArray = 0;

	}

	public void add(E string) {

		if (data[data.length-1] != null) {

			increaseCapacity();
		}

		data[sizeOfArray++] = string;

	}

	public void add(E string, int index) {

		if (sizeOfArray == data.length) {

			increaseCapacity();
		}

		if (index < 0 || index >= sizeOfArray) {

			throw new IndexOutOfBoundsException("You tried accessing an index outside of the array size length");
		}

		System.arraycopy(data, index, data, index + 1, sizeOfArray - index);

		data[index] = string;

		sizeOfArray++;
	}

	public void remove(E string) {

		for (int i = 0; i < sizeOfArray; i++) {

			if (data[i].equals(string) && i == 0) {

				if (data.length <= 1) {

					data[i] = null;
				}

				else {

					decreaseCapacity(i);

				}

			} else if(data[i].equals(string)) {
				
				decreaseCapacity(i);
			}
		}

	}

	public E get(int index) {

		if (index < 0 || index >= sizeOfArray) {

			throw new IndexOutOfBoundsException("You tried accessing an index outside of the array size length");
		}

		return data[index];

	}

	public void increaseCapacity() {

		E[] newData = (E[]) new Object[data.length + 1];

		System.arraycopy(data, 0, newData, 0, sizeOfArray);

		data = newData;

	}

	public void decreaseCapacity(int index) {

		System.arraycopy(data, index + 1, data, index, sizeOfArray - index - 1);

		sizeOfArray--;
	}

}