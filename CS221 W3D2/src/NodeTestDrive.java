

public class NodeTestDrive {
	
	public static void main(String[] args) {
			
		NodeOpr eo = new NodeOpr();
		eo.insert(100, "sima");
		eo.insert(90, "teddy");
		eo.insert(130, "aroga");
		eo.insert(115, "meron");
		eo.insert(76, "Hirut"); 
		eo.insert(95, "yared"); 
		eo.insert(145, "mamoraw"); 
		System.out.println("In-order traversal");
		eo.inOrder(eo.getRoot());
       
		System.out.println("\nNode Exist(100) : " + eo.find(100));
        System.out.println("\nNode Exist(1000) : " + eo.find(1000));
        
        System.out.println("post order traversal ");
		eo.postOrderTraverseTree(eo.getRoot());
	   
		System.out.println("\nNode Exist(115) : " + eo.find(100));
	    System.out.println("\nNode Exist(19) : " + eo.find(1000));
		
        
        Node max=eo.maximum();
        System.out.println("the maximum is  " + max);
        
        Node min=eo.minimum();
        System.out.println("the minmum  " + min);
        
        System.out.println("Leaf nodes: " + eo.countleaf(eo.getRoot()));
        
       
	}
	

}
/*output
In-order traversal
76 , Hirut
90 , teddy
95 , yared
100 , sima
115 , meron
130 , aroga
145 , mamoraw

Node Exist(100) : true

Node Exist(1000) : false
post order traversal 
76,Hirut
95,yared
90,teddy
115,meron
145,mamoraw
130,aroga
100,sima

Node Exist(115) : true

Node Exist(19) : false
the maximum is  mamoraw 145
the minmum  Hirut 76
Leaf nodes: 4*/