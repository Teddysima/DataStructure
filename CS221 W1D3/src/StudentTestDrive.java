
public class StudentTestDrive {

	public static void main(String[] args) {
		
		int maxSize = 100;
		
		StudentArray sa = new StudentArray(maxSize);
	try{	
		sa.insert(01, "Teddy", 90);
		sa.insert(02, "dani", 85);
		sa.insert(03, "selam", 80);
		sa.insert(04, "zeray", 78);
		sa.insert(05, "addis", 56);
		sa.insert(06, "biruk", 87);
		sa.insert(07, "girma", 92);
		sa.insert(01, "Teddy", 90);
		
	}catch (Exception e){
			System.out.println(e.getMessage());		
		}
		
		
		System.out.println("max and min mark befor deletion");
		System.out.println("The maximum mark of the student is " + sa.max() + " The minimum mark " + sa.min());
		
		sa.display();
		
		int searchID = 01;
		Student found;
		
		found = sa.find(searchID);
		if (found != null){
			System.out.println("Found ");
			found.displayStudent();}
			else
				System.out.println("can not found " + searchID );
			System.out.println("Deleting ID # 07 and 03");
			
			sa.delete(07);
			sa.delete(10);
			
			sa.display();
			
			System.out.println("The maximum mark of the student is " + sa.max() + "The minimum mark " + sa.min());
			
			
		}
	}
/*out put
 * student id 1 already exist
max and min mark befor deletion
The maximum mark of the student is 92 The minimum mark 56
 Student name:Teddy
 Student ID:1
 Student mark:90
 Student name:dani
 Student ID:2
 Student mark:85
 Student name:selam
 Student ID:3
 Student mark:80
 Student name:zeray
 Student ID:4
 Student mark:78
 Student name:addis
 Student ID:5
 Student mark:56
 Student name:biruk
 Student ID:6
 Student mark:87
 Student name:girma
 Student ID:7
 Student mark:92
Found 
 Student name:Teddy
 Student ID:1
 Student mark:90
Deleting ID # 07 and 03
 Student name:Teddy
 Student ID:1
 Student mark:90
 Student name:dani
 Student ID:2
 Student mark:85
 Student name:selam
 Student ID:3
 Student mark:80
 Student name:zeray
 Student ID:4
 Student mark:78
 Student name:addis
 Student ID:5
 Student mark:56
 Student name:biruk
 Student ID:6
 Student mark:87
The maximum mark of the student is 90The minimum mark 56
 */

