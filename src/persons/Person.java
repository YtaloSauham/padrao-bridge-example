package persons;

public abstract class Person {
	protected String name;
	protected Integer age;
	protected String document;
	
	public Person(String name, Integer age, String document) {
		this.name = name;
		this.age = age;
		this.document = document;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getDocument() {
		return document;
	}
	
	public void setDocument(String document) {
		this.document = document;
	}
	

}