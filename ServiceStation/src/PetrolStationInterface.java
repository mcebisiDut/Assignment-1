
public interface PetrolStationInterface<T> {

	public Integer count();

	public void enqueue(T vehicle);

	public T dequeue();
	
	public boolean isFull();
	
	public boolean isEmpty();
	
	public void clear();
}
