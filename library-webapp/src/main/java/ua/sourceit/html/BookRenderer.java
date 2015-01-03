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
		html.append("<h5>").append( "Автор: " + book.getAuthor()).append("</h5>");
		html.append("<h5>").append( "Год выпуска: " + book.getYear() + " г.").append("</h5>");
		html.append("<h5>").append("Описание: ").append("</h5>");
		html.append("<h5>").append(book.getSummary()).append("</h5>");
		html.append("<h4><a href=\"update.jsp?bookid="+book.getId()+"\">")
			.append("<button type=\"button\">").append("Редактировать информацию о книге").append("</button></a>") 
			.append(" <a href=\"delete_warning.jsp?bookid="+book.getId()+"\">")
			.append("<button type=\"button\" style=\"background-color: #FC2847\">").append("Удалить книгу").append("</button></a></h4>");
		html.append("</td>").append("</tr>").append("</table>");
		return html.append("</div>").toString();
	}
	public static String toUpdateBookHtml(Book book) {
		StringBuilder html = new StringBuilder();
		html.append("<form ").append("action=\"update_done.jsp\"").append("method=\"post\" ").append("accept-charset=\"UTF-8\"").append(">");
		html.append("<table ").append("border=\"0\">")
			.append("<tr>")
			.append("<td ").append("valign=\"top\"").append(">").append("Инв.№:").append("</td>")
			.append("<td ").append("valign=\"top\"").append(">").append("<input type=\"text\"").append("size = \"10\"")
			.append("name=\"id\"").append("readonly ").append("style=\"background: #FEF4D7\"").append("value=\"" + book.getId() + "\"").append(">").append("</td>")
			.append("</tr>");
		html.append("<tr>")
			.append("<td ").append("valign=\"top\"").append(">").append("Автор:").append("</td>")
			.append("<td ").append("valign=\"top\"").append(">").append("<input type=\"text\"").append("size = \"100\"")
			.append("name=\"author\"").append("required ").append("value=\"" + book.getAuthor() + "\"").append(">").append("</td>")
			.append("</tr>");
		html.append("<tr>")
			.append("<td ").append("valign=\"top\"").append(">").append("Название книги:").append("</td>")
			.append("<td valign=\"top\"").append(">").append("<input type=\"text\"").append("size = \"100\"")
			.append("name=\"name\"").append("required ").append("value=\"" + book.getBookName() + "\"").append(">").append("</td>")
			.append("</tr>");
		html.append("<tr>")
			.append("<td ").append("valign=\"top\"").append(">").append("Год издания:").append("</td>")
			.append("<td valign=\"top\"").append(">").append("<input type=\"text\"").append("size = \"4\"")
			.append("name=\"year\"").append("required ").append("value=\"" + book.getYear() + "\"").append(">").append("</td>")
			.append("</tr>");
		html.append("<tr>")
			.append("<td ").append("valign=\"top\"").append(">").append("Краткое содержание:").append("</td>")
			.append("<td valign=\"top\"").append(">").append("<textarea required name=\"summary\"")
			.append("cols=\"100\"").append("rows=\"5\"").append(">").append("" + book.getSummary() + "").append("</textarea>").append("</td>")
			.append("</tr>");
		html.append("<tr>")
			.append("<td ").append("valign=\"top\" align=\"center\"").append(">").append("<input ").append("type=\"reset\" style=\"background: #FC2847\"").append("value=\"Установить начальные значения\">").append("</td>")
	 		.append("<td ").append("valign=\"top\" align=\"center\"").append(">").append("<input ").append("type=\"submit\"").append("value=\"Сохранить\">").append("</td>")
	 		.append("</tr>");
		html.append("</table>").append("</form>");
		return html.toString();
	}
}
