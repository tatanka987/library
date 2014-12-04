<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"
		import="ua.sourceit.service.BookService,
				ua.sourceit.service.impl.BookServiceImpl,
				ua.sourceit.html.BookRenderer,
				ua.sourceit.businessobject.Book" %>

<%! private BookService service = new BookServiceImpl(); %>

<html>
<body>
<BODY BGCOLOR=#FEF4D7>
<h4><a href="javascript:history.back()">Назад</a></h4>

<h2>О книге </h2>
<% double parameter = Double.parseDouble (request.getParameter("bookid")); %>
<% int bookid = (int)parameter; %>
<% Book book = service.getBook(bookid);
	
%>
<%= BookRenderer.toDetailedHtml(book) %><br>
<h4><a href="javascript:history.back()">Назад</a></h4>
</body>
</html>
