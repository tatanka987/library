<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"
		import="ua.sourceit.service.BookService,
				ua.sourceit.service.impl.BookServiceImpl,
				ua.sourceit.html.BookRenderer,
				ua.sourceit.businessobject.Book" %>

<%! private BookService service = new BookServiceImpl(); %>

<html>
<body>
<h1>Hello librarians!</h1>

<h2>The book you have chosen is</h2>
<% double parameter = Double.parseDouble (request.getParameter("bookid")); %>
<% int bookid = (int)parameter; %>
<% Book book = service.getBook(bookid);
	
%>
<%= BookRenderer.toDetailedHtml(book) %><br>
<h2><a href="javascript:history.back()">Back</a></h2>
</body>
</html>
