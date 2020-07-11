public class BaseArray{
	
	// 10
	
	private int index = -1;
	
	private int elementSize;
	private int[] array;
	
	public BaseArray(int elementSize){
		this.elementSize = elementSize;
		array = new int[this.elementSize];
	}
	
	public void insert(int value){
		index++;
		array[index] = value;
	}
	
	public void insert(int index, int value){
		// Shifting
		// Insert into that particular index
		
		index++;
	}
	
	public void delete(int index){
		// shifting
		for(int i=index; i< this.index; i++){
			array[i] = array[i + 1];
		}
		this.index--;
	}
	
	public void update(int index, int value) throws Exception{
		
		if(isEmpty()){
			throw new Exception("Array is empty.");
		}
		
		// Validate the index
		if(isValidIndex(index)){
			array[index] = value;
		}else{
			throw new Exception("Invalid Index");
		}
	}
	
	public int getArrayLength(){
		return this.elementSize;
	}
	
	public int getElementSize(){
		return index + 1;
	}

	public boolean isEmpty(){
		return (index == -1);
	}
	
	public int getValue(int index) throws Exception{
		
		if(isEmpty()){
			throw new Exception("Array is empty.");
		}
		
		if(isValidIndex(index)){
			return array[index] ;
		}else{
			throw new Exception("Invalid Index");
		}	
	}
	
	private boolean isValidIndex(int index){
		return (index > -1 && (index < elementSize -1));
	}
	
	private boolean isArrayFull(){
		return false;
	}
	
	
	public void print(){
		System.out.println();
			System.out.print("[");
			for(int i=0; i< array.length; i++){
				System.out.print(array[i] + ", ");
			}
			System.out.print("]");
	}
	
	public static void main(String...a) throws Exception{
		BaseArray baseArray = new BaseArray(10);
		System.out.println("----- Before ----");
		System.out.println("Empty: " + baseArray.isEmpty());
		System.out.println("Array Length: " + baseArray.getArrayLength());
		System.out.println("Array Element Size: " + baseArray.getElementSize());
		//System.out.println("Index3 Value: " + baseArray.getValue(3));
		//baseArray.update(2, 300);
		//System.out.println("Index3 Value: " + baseArray.getValue(3));
		baseArray.print();
		System.out.println();
		System.out.println("----- Insert----");
		baseArray.insert(10);
		baseArray.insert(20);
		baseArray.insert(30);
		baseArray.insert(40);
		System.out.println("Empty: " + baseArray.isEmpty());
		System.out.println("Array Length: " + baseArray.getArrayLength());
		System.out.println("Array Element Size: " + baseArray.getElementSize());
		System.out.println("Index2 Value: " + baseArray.getValue(2));
		System.out.println("Index3 Value: " + baseArray.getValue(3));
		
		baseArray.print();
		
		System.out.println();
		System.out.println("----- update----");
		baseArray.update(2, 300);
		baseArray.update(3, 400);
		System.out.println("Index2 Value: " + baseArray.getValue(2));
		System.out.println("Index2 Value: " + baseArray.getValue(3));
		
		baseArray.print();
		
		System.out.println();
		System.out.println("----- Delete----");
		baseArray.delete(0);
		baseArray.print();
		//baseArray.delete(2);
		System.out.println("Array Element Size: " + baseArray.getElementSize());
		baseArray.insert(500);
		baseArray.print();
		
		//baseArray.getValue(24);
		//baseArray.update(14, 300);
	}
}