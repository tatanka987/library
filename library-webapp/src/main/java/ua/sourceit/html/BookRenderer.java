package ua.sourceit.html;

import ua.sourceit.businessobject.Book;

public class BookRenderer {

	public static String toHtml(Book book) {
		StringBuilder html = new StringBuilder("<div>");
		html.append("<table>").append("<tr>").append("<td>");
		html.append("<h2>").append(book.getId()).append("</h2>");
		html.append("</td>").append("<td>");
		html.append("<h4><a href=\"details.jsp?bookid="+book.getId()+"\">")
			.append(book.getBookName()).append("</a></h4>");
		html.append("<h5>").append(book.getAuthor()).append("</h5>");
		html.append("</td>").append("</tr>").append("</table>");
		return html.append("</div>").toString();
	}
	
	public static String toDetailedHtml(Book book) {
		StringBuilder html = new StringBuilder("<div>");
		html.append("<table>").append("<tr>").append("<td>");
		html.append("</td>").append("<td>");
		html.append("<h3><a href=\"details.jsp?bookid="+book.getId()+"\">")
			.append(book.getBookName()).append("</a></h3>");
		html.append("<h5>").append( "�����: " + book.getAuthor()).append("</h5>");
		html.append("<h5>").append( "��� �������: " + book.getYear() + " �.").append("</h5>");
		html.append("<h5>").append("��������: ").append("</h5>");
		html.append("<h5>").append(book.getSummary()).append("</h5>");
		html.append("<h4><a href=\"update.jsp?bookid="+book.getId()+"\">")
			.append("<button type=\"button\">").append("������������� ���������� � �����").append("</button></a>") 
			.append(" <a href=\"delete_warning.jsp?bookid="+book.getId()+"\">")
			.append("<button type=\"button\" style=\"background-color: #FC2847\">").append("������� �����").append("</button></a></h4>");
		html.append("</td>").append("</tr>").append("</table>");
		return html.append("</div>").toString();
	}
	public static String toUpdateBookHtml(Book book) {
		StringBuilder html = new StringBuilder();
		html.append("<form ").append("action=\"update_done.jsp\"").append("method=\"post\" ").append("accept-charset=\"UTF-8\"").append(">");
		html.append("<table ").append("border=\"0\">")
			.append("<tr>")
			.append("<td ").append("valign=\"top\"").append(">").append("���.�:").append("</td>")
			.append("<td ").append("valign=\"top\"").append(">").append("<input type=\"text\"").append("size = \"10\"")
			.append("name=\"id\"").append("readonly ").append("style=\"background: #FEF4D7\"").append("value=\"" + book.getId() + "\"").append(">").append("</td>")
			.append("</tr>");
		html.append("<tr>")
			.append("<td ").append("valign=\"top\"").append(">").append("�����:").append("</td>")
			.append("<td ").append("valign=\"top\"").append(">").append("<input type=\"text\"").append("size = \"100\"")
			.append("name=\"author\"").append("required ").append("value=\"" + book.getAuthor() + "\"").append(">").append("</td>")
			.append("</tr>");
		html.append("<tr>")
			.append("<td ").append("valign=\"top\"").append(">").append("�������� �����:").append("</td>")
			.append("<td valign=\"top\"").append(">").append("<input type=\"text\"").append("size = \"100\"")
			.append("name=\"name\"").append("required ").append("value=\"" + book.getBookName() + "\"").append(">").append("</td>")
			.append("</tr>");
		html.append("<tr>")
			.append("<td ").append("valign=\"top\"").append(">").append("��� �������:").append("</td>")
			.append("<td valign=\"top\"").append(">").append("<input type=\"text\"").append("size = \"4\"")
			.append("name=\"year\"").append("required ").append("value=\"" + book.getYear() + "\"").append(">").append("</td>")
			.append("</tr>");
		html.append("<tr>")
			.append("<td ").append("valign=\"top\"").append(">").append("������� ����������:").append("</td>")
			.append("<td valign=\"top\"").append(">").append("<textarea required name=\"summary\"")
			.append("cols=\"100\"").append("rows=\"5\"").append(">").append("" + book.getSummary() + "").append("</textarea>").append("</td>")
			.append("</tr>");
		html.append("<tr>")
			.append("<td ").append("valign=\"top\" align=\"center\"").append(">").append("<input ").append("type=\"reset\" style=\"background: #FC2847\"").append("value=\"���������� ��������� ��������\">").append("</td>")
	 		.append("<td ").append("valign=\"top\" align=\"center\"").append(">").append("<input ").append("type=\"submit\"").append("value=\"���������\">").append("</td>")
	 		.append("</tr>");
		html.append("</table>").append("</form>");
		return html.toString();
	}
}
