<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"
				import="ua.sourceit.service.BookService,
				ua.sourceit.service.impl.BookServiceImpl,
				ua.sourceit.html.BookRenderer,
				ua.sourceit.businessobject.Book" %>

<%! private BookService service = new BookServiceImpl(); %>

<html>
<body>
	<h1>Hello librarians!</h1>
	<h2>The list of books is available below:</h2>

	
	<% java.util.List <Book> books = service.getAllBooks(); %>
	
	<% for (Book book : books) { %>
	<%= BookRenderer.toHtml(book) %><br>
	<% } %> 
	
</body>
</html>
