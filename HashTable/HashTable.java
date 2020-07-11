import java.util.*; 

public class HashTable{
	
	public static void main(String...a) throws Exception{
		System.out.println("---Insertion");
		HashTable hashTable = new HashTable();
		hashTable.put(344, "Ahmad");
		hashTable.put(114, "Prem");
		hashTable.put(341, "Anika");
		
		System.out.println("Fetch");
		System.out.println("Name: " + hashTable.get(114));
		System.out.println("Name: " + hashTable.get(344));
		System.out.println("Name: " + hashTable.get(341));
		
		System.out.println("After Update");
		
		hashTable.put(344, "Ahmad Sayeed");
		System.out.println("Name: " + hashTable.get(114));
		System.out.println("Name: " + hashTable.get(344));
		System.out.println("Name: " + hashTable.get(344534365));
		
		System.out.println("Size: " + hashTable.size());
		
		System.out.println("Contains: " + hashTable.contains(0000));
		System.out.println("Contains: " + hashTable.contains(114));
		
		hashTable.remove(114);
		System.out.println("After Remove Contains: " + hashTable.contains(114));
		
		System.out.println("Fetch---------------------");
		System.out.println("Name: " + hashTable.get(114));
		System.out.println("Name: " + hashTable.get(344));
		System.out.println("Name: " + hashTable.get(341));
	}
				
	int size;
	LinkedList<KeyValue>[] array = new LinkedList[9];
						//344		Ahmad
						//114		Prem
						//344		Ahmad Sayeed
	public void put(int key, String value){
		// convert into hash(index)
		int index = hashFunc(key);
		
		if(array[index] == null){
			LinkedList<KeyValue> link = new LinkedList<KeyValue>();
			KeyValue keyValue = new KeyValue(key, value);
			link.add(keyValue);
			array[index] = link;
			
			size++;
		}else{
			LinkedList<KeyValue> link = array[index];
			boolean found = false;
			for(KeyValue keyValue: link){
				if(keyValue.key == key){
					keyValue.value = value;
					found = true;
					break;
				}
			}
			
			if(!found){
				KeyValue keyValue = new KeyValue(key, value);
				link.add(keyValue);
				size++;
			}
			
		}
	}
	
	public String get(int key){
		
		int index = hashFunc(key);
		
		if(array[index] == null)
			return null;
		
		LinkedList<KeyValue> link = array[index];
		for(KeyValue keyValue: link){
			if(keyValue.key == key)
				return keyValue.value;
		}
		
		return null;
	}
	
	public boolean contains(int key){
		return get(key) != null;
	}
	
	public int size(){
		return this.size;
	}
	
	public boolean isEmpty() {
        return size() == 0;
    }
	
	public void remove(int key) throws Exception{
		int index = hashFunc(key);
		if(array[index] == null)
			throw new Exception("Not Item Found");
		
		LinkedList<KeyValue> link = array[index];
		for(KeyValue keyValue: link){
			if(keyValue.key == key){
				link.remove(keyValue);
			}
		}
		
		size--;
	}
	
	private int hashFunc(int key){
		return (key % 10);
	}
	
	private class KeyValue{
		public int key;
		public String value;
		
		public KeyValue(int key, String value){
			this.key = key;
			this.value = value;
		}
	}
}