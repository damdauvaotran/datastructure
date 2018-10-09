
public class ArrayStack<E> {
	public Object[] stack;
	public static final int CAPACITY = 1024;
	public int top;
	public int maximumElements;

	public static ArrayStack<?> New() {
		return new ArrayStack<Object>();
	}

	public ArrayStack(int maximumElements) {
		this.stack = new Object[maximumElements];
		this.top = -1;
		this.maximumElements = maximumElements;
	}

	public ArrayStack() {
		this(CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public ArrayStack<E> push(Object o) throws Exception {
		if (this.size() < this.maximumElements) {
			this.top++;
			this.stack[top] = (E) o;
		} else {
			throw new Exception("Stack overflow");
		}
		return this;
	}

	public ArrayStack<E> pop() throws Exception {
		if (this.size() > 0) {
			this.stack[this.top] = null;
			this.top--;
		} else {
			throw new Exception("Stack empty");
		}
		return this;
	}

	@SuppressWarnings("unchecked")
	public E top() throws Exception {
		if (this.top == -1 && this.stack[this.top] == null) {
			throw new Exception("Stack empty");
		}
		return (E) stack[this.top];
	}

	public int size() {
		return this.top + 1;
	};

	public boolean isEmpty() {
		return this.top < 0;
	}

	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		ArrayStack<String> a = (ArrayStack<String>) ArrayStack.New();
		try {
			a.push("afad");
			System.out.println(a.top());
			System.out.println(a.maximumElements);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
