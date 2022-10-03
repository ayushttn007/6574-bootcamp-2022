public class QuestionTen {

    public static void main(String[] args) {
        System.out.println("execution:");
        String str = "repeat this string ";
        System.out.println(str.repeat(2));

        String complexWhitespacesString = "\u2005\u2005\u2005\u2005  string  stripped. ";
        System.out.println(complexWhitespacesString.strip());
        System.out.println("Is the string blank?");
        System.out.println("\n\u2005   ".isBlank());
        String html =
                "\t<html>\n"+
                        "\t\t<head>\n"+
                        "\t\t\t<body>\n"+
                        "\t\t\t\t<p>This is real Ayush sharma</p>\n"+
                        "\t\t\t</body>\n"+
                        "\t\t</head>\n"+
                        "\t<html>";

        System.out.println(html);
        System.out.println("Strip indent of HTML:");
        System.out.println(html.stripIndent());
        System.out.println("Translate Escapes executed: ");
        System.out.println("\"This is  \\n REAL Ayush sharma move to new line \"");
        System.out.println("\"This is \\n NOT SO REAL ayush sharma move to new line \"".translateEscapes());
        System.out.println("is the string empty?");
        System.out.println("\n\u2005   ".isEmpty());
        System.out.println("Format and Formatted executed:");
        System.out.println(String.format("Format %s","Executed"));
        System.out.println("Formatted %s".formatted("Executed"));




/*execution:
repeat this string repeat this string
string  stripped.
Is the string blank?
true
	<html>
		<head>
			<body>
				<p>This is real Ayush sharma</p>
			</body>
		</head>
	<html>
Strip indent of HTML:
<html>
	<head>
		<body>
			<p>This is real Ayush sharma</p>
		</body>
	</head>
<html>
Translate Escapes executed:
"This is  \n REAL Ayush sharma move to new line "
"This is
 NOT SO REAL ayush sharma move to new line "
is the string empty?
false
Format and Formatted executed:
Format Executed
Formatted Executed*/

    }
}