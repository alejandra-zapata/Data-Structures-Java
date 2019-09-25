import java.util.*;

public class Trio <T extends Comparable<T>> {
	
	private T item1, item2, item3;
		
	public Trio(T item1, T item2, T item3) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
	}
	
	public Trio(T item) {
		this(item, item, item);
	}

	public T getItem1() {
		return item1;
	}

	public void setItem1(T item1) {
		this.item1 = item1;
	}

	public T getItem2() {
		return item2;
	}

	public void setItem2(T item2) {
		this.item2 = item2;
	}

	public T getItem3() {
		return item3;
	}

	public void setItem3(T item3) {
		this.item3 = item3;
	}

	@Override
	public String toString() {
		return "Trio [item = " + item1 + ", item2 = " + item2 + ", item3 = " + item3 + "]";
	}
	
	public void reset(T item) {
		setItem1(item);
		setItem2(item);
		setItem3(item);
	}
	
	public int count(T item) {
		int count = 0;
		
		if(item.equals(item1)) {
			count++;
		}
		if(item.equals(item2)) {
			count++;
		}
		if(item.equals(item3)) {
			count++;
		}
		return count;
	}
	
	public boolean hasDuplicates() {
		boolean hasDuplicates = true;
		
		if(item1.equals(item2)) {
			return hasDuplicates;
		}
		if(item1.equals(item3)) {
			return hasDuplicates;
		}
		if(item2.equals(item3)) {
			return hasDuplicates;
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object other) {
		if(other instanceof Trio<?>) {
			Trio<?> otherTrio = (Trio<?>) other;
		
			//Creating arrayList of the 'original' trio and populating it:
			ArrayList<T> trioArray = new ArrayList<T>();
			trioArray.add(this.getItem1());
			trioArray.add(this.getItem2());
			trioArray.add(this.getItem3());
		
			//Creating arrayList of the other trio and populating it:
			ArrayList<T> otherTrioArray = new ArrayList<T>();
			otherTrioArray.add((T) otherTrio.getItem1());
			otherTrioArray.add((T) otherTrio.getItem2());
			otherTrioArray.add((T) otherTrio.getItem3());
		
			//Sorting both arrayLists
			Collections.sort((List<T>) trioArray);
			Collections.sort((List<T>) otherTrioArray);
		
			return trioArray.equals(otherTrioArray);
		}
		return false;
	}
}
