
public class Admission {
	
	private int adno; 
    private String name; 
    private String pno;  
    
    public Admission(int adno, String name, String pno){
    	this.adno = adno;
    	this.name = name;
    	this.pno = pno;
    	    	
    }
    public String toString(){
    	return adno + " " + name + " " + pno;
    }
}
