
public class Link {
	public String school;
	public int numStudent;
	
	public Link next;
	
	public Link(String school, int numStudent){
		this.school = school;
		this.numStudent = numStudent;		
	}
	public void display(){
		System.out.println(school + ": " + numStudent);
	}
	public String toString(){
		return school;
	}
}
