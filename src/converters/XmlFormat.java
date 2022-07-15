package converters;

import persons.Person;

public class XmlFormat implements Converter {

	@Override
	public String getFormated(Person per) {
		StringBuilder builder = new StringBuilder();
		builder.append("<name>\n").append(per.getName()).append("</name>\n")
				.append("<age>\n").append(per.getAge()).append("</age>\n")
				.append("<document>\n").append(per.getDocument()).append("</document>\n");
		
		
		return builder.toString();
	}

}