package sec03.exam01_multi_type_parameter;

// 제네릭 타입 : 타입을 패러미터로 갖는 클래스 or 인터페이스
public class Product<T, M> {
	private T kind;
	private M model;
	
	public T getKind() { return this.kind; }
	public M getModel() { return this.model; }
	
	public void setKind(T kind) { this.kind = kind; }
	public void setModel(M model) { this.model = model; }
}

