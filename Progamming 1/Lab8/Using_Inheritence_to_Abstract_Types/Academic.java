public class Academic extends Person {
	private String subject;
	
	public Academic(String name, String subject) {
		super(name);
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return super.toString() + " I teach " + this.subject + ".";
	}
}
