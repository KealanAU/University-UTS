public class CodeMonkey extends Person {
	
	private String language;
	
	public CodeMonkey(String name, String language) {
		super(name);
		this.language = language;
	}
	
	@Override
	public String toString() {
		return super.toString() + " I like to program in " + this.language + ".";
	}
}
