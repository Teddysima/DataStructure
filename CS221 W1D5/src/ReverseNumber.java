
public class ReverseNumber {
	
	private int num;
	
	public ReverseNumber(int num){
		this.num = num;		
	}
	public int reverse(){
		revisedPriorityQ q = new revisedPriorityQ(10);
		
		while (num > 0){
			int r = num % 10;
			q.insert(r);
			num = num / 10;
		}
		
		int res = 0;
		int tmp;

		while (!q.isEmpty()){
			tmp = (int)q.remove();
			res = res * 10 + tmp;
		}
		return res;
	}
	

}
