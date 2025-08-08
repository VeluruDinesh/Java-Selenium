package health;
class Patient{
	private int Id;
	private String  Name;
	private String Problem ;
	
	public Patient(int id ,String name,String problem) {
		this.Id=id;
		this.Name=name;
		this.Problem=problem;
		
	}
	public int getId() {
		return Id;
		}
	public String getName() {
		return Name;
		}
	public String getProblem() {
		return Problem;
		}
	
	
}

