<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"
				import="ua.sourceit.service.BookService,
				ua.sourceit.service.impl.BookServiceImpl,
				ua.sourceit.html.BookRenderer,
				ua.sourceit.businessobject.Book" %>

<%! private BookService service = new BookServiceImpl(); %>

<html>
<body>
	<BODY BGCOLOR=#FEF4D7>
	<h1>Здравствуй дорогой читатель!</h1>
	<h2>Для просмотра доступны следующие книги:</h2>
	<h3><a href="addbook.html">Добавить книгу</a></h3>

	
	<% java.util.List <Book> books = service.getAllBooks(); %>
	
	<% for (Book book : books) { %>
	<%= BookRenderer.toHtml(book) %><br>
	<% } %> 
	
	<h3><a href="addbook.html">Добавить книгу</a></h3>
</body>
</html>
