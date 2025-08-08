package loops;

public class chartypes {

	public static void main(String[] args) {
		String name="Dinesh Veluru";
		String name1="Nithesh Veluru";
		String name2="diinesh veluru";
		String sentence = "Java is powerful. Java is popular.";
				System.out.print("length is "+name.length());
				System.out.print("\nCharAt "+name.charAt(0));
				System.out.print("\n sub string "+name.substring(6));
				System.out.print("\n sub string "+name.substring(0,10));
				System.out.print("\n concat"+name.concat(name1));
				System.out.print("\n uppercase"+name.toUpperCase());
				System.out.print("\n lowercase"+name.toLowerCase());
				System.out.println("\nequals : " + name.equals(name1));
				System.out.println("\ncompareTo: " + name.compareTo(name1)); 
				System.out.println("\ncompareToIgnoreCase: " + name.compareToIgnoreCase(name2));
				System.out.println("\nindexOf:"+ name.indexOf("Veluru"));
				System.out.println("\nlastIndexof: " + name.lastIndexOf("u"));
				System.out.println("\nstartsWith: " + name.startsWith("Dine"));
		        System.out.println("startsWith(\"Vel\"): " + name.startsWith("Vel"));
		        System.out.println("endsWith(\"Veluru\"): " + name.endsWith("Veluru"));
		        System.out.println("endsWith(\"Dinesh\"): " + name.endsWith("Dinesh"));
		        System.out.println("Original Name: " + name);
		        String replacedChar = name.replace('e', 'E');
		        System.out.println("replace('e', 'E'): " + replacedChar);
		        String replacedSubstr = name.replace("Veluru", "Reddy");
		        System.out.println("replace(\"Veluru\", \"Reddy\"): " + replacedSubstr);
		        System.out.println("\nOriginal Sentence: " + sentence);
		        String replacedAll = sentence.replaceAll("Java", "Python");
		        System.out.println("replaceAll(\"Java\", \"Python\"): " + replacedAll);
				


	}

}
