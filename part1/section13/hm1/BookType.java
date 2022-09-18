package part1.section13.hm1;

public enum BookType {
	HISTORY("history"), BIOGRAPHY("biography"), SCIENTIFIC("scientific"), FICTION("fiction"), NOVEL("novel");

	private String description;

	private BookType(String description) {
		this.description = description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
