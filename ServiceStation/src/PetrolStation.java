import java.util.Arrays;

public class PetrolStation<T> implements PetrolStationInterface<T> {

	private T[] cars;
	private Integer size;
	private Integer front;

	public PetrolStation() {
		size = 0;
		front = 0;
		cars = (T[]) new Object[2];
	}

	public void enqueue(T vehicle) {
		if (isFull()) {
			cars = expandSize();
		}

		cars[size] = vehicle;
		size++;
	}

	public T dequeue() {
		if (!isEmpty()) {
			// what do we do when front reaches head
		}

		T vehicle = cars[front];
		front++;

		return vehicle;
	}

	public Integer count() {
		return (size - front);
	}

	public boolean isFull() {
		return (size == cars.length);
	}

	public boolean isEmpty() {
		return (count() == 0);
	}

	public void clear() {
		size = 0;
	}

	private T[] expandSize() {
		return Arrays.copyOf(cars, 2 * size);
	}
}
