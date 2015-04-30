
public class StudentArray {
	
	private Student[] a;               
	private int nElems;   
	
	public StudentArray(int max){
		
		a = new Student[max];
		nElems = 0;
		
	}
	public Student find(int id){
		int j;
		for (j = 0; j < nElems; j++)
			if(a[j].getId() == id)
				break;
			if(j == nElems)
				return null;
			else
				return a[j];
		}
	public int max(){
		int max = a[0].getMark();
		
		for (int i = 0; i < nElems; i++){
			if (max < a[i].getMark()){
				max = a[i].getMark();
			}else{
				max = max;
				
			}
			
		}
		return max;
	}
	public int min(){
		int min = a[0].getMark();
		
		for (int i = 0; i < nElems; i++){
			if (min > a[i].getMark()){
				min = a[i].getMark();
			}else{
				min = min;
				
			}
			
		}
		return min;
	}
	
	public void insert(int id, String name, int mark) throws Exception {
		if(find(id)==null){
		a[nElems] = new Student(id, name, mark);
		nElems++;
		}
		else {
			throw new Exception("student id " + id + " already exist");
		}
	}
	public boolean delete(int id){
		int j;
		for (j = 0; j < nElems; j++)
			if(a[j].getId() == id)
				break;
			if(j == nElems)
				return false;
			else {
				for (int k = j; k < nElems; k++)
					a[k] = a[k+1];
				nElems--;
				return true;}
							
		}
		public void display(){
			for (int j1 = 0; j1 < nElems; j1++){
				a[j1].displayStudent();
			
		}
		
	}


}
