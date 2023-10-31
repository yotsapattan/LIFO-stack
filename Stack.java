import java.util.ArrayList;

public class Stack<D> extends ArrayList<D> {

	private int capacity;
	private ArrayList<D> stack;

	public Stack() {
		this.stack = new ArrayList<D>();
		this.capacity = Integer.MAX_VALUE;
	}

	public Stack(int capacity) {
		this.stack = new ArrayList<D>();
		this.capacity = capacity;
	}

	public boolean push(D object) {
		if (stack.size() < capacity) {
			stack.add(object);
			return true;
		} else {
			return false;
		}
	}

	public D pop() {
		if (stack.isEmpty()) {
			return null;
		}
		D item = stack.remove(stack.size() - 1);
		return item;
	}

	public D peek() {
		if (stack.isEmpty()) {
			return null;
		}
		return stack.get(stack.size() - 1);
	}

	public D[] toArray() {
		if (stack.isEmpty()) {
			return null;
		}
		return stack.toArray((D[]) new Object[stack.size()]);
	}

	public String toString() {
		String result = "";
		for (int i = stack.size() - 1; i >= 0; i--) {
			result += "|" + stack.get(i).toString() + "|" + "\n";
		}
		return result + "===";
	}
}
