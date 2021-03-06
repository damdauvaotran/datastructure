
public class ArrayStackTight<E> {
	public Object[] stack;
	public static final int CAPACITY = 1;
	public int top;
	public int maximumElements;

	public static ArrayStackTight<?> New() {
		return new ArrayStackTight<Object>();
	}

	public ArrayStackTight(int maximumElements) {
		this.stack = new Object[maximumElements];
		this.top = -1;
		this.maximumElements = maximumElements;
	}

	public ArrayStackTight() {
		this(CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public ArrayStackTight<E> push(Object o) {
		if (this.size() < this.maximumElements) {
			this.top++;
			this.stack[top] = (E) o;
		} else {
			Object[] tempStack = this.stack;
			this.stack = new Object[++maximumElements];
			for (int i = 0; i < maximumElements-1; i++) {
				this.stack[i] = tempStack[i];
			}
			tempStack = null;
			this.top++;
			this.stack[top] = (E) o;
		}
		return this;
	}

	public ArrayStackTight<E> pop() throws Exception {
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
		ArrayStackTight<String> a = (ArrayStackTight<String>) ArrayStackTight.New();
		a.push("afad").push("afad").push("afad").push("afad").push("afa");
		try {
			System.out.println(a.top());
			System.out.println(a.maximumElements);
			
		} catch (Exception e) {

		}

	}
}
