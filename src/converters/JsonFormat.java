package converters;

import persons.Person;

public class JsonFormat implements Converter {

	@Override
	public String getFormated(Person per) {
		StringBuilder builder = new StringBuilder();
		builder.append("{\n")
			.append("\t\"name\": \"").append(per.getName()).append("\",\n")
			.append("\t\"age\": \"").append(per.getAge()).append("\",\n")
			.append("\t\"document\": \"").append(per.getDocument()).append("\",\n")
		.append("}");
		
		return builder.toString();
	}

}