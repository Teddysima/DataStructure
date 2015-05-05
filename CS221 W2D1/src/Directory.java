
public class Directory {
	
	public String name;
	public long number; 
	public Directory next;
	
    public Directory(String name, long number) { 
       	this.name = name;
    	this.number = number;		
	}
    public String toString(){
    	return new StringBuilder("Directory [")
    	.append(name)
    	.append(", ")
    	.append(number)
    	.append("]")
    	.toString();
	}




}
