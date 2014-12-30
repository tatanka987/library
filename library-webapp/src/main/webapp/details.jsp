<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"
		import="ua.sourceit.service.BookService,
				ua.sourceit.service.impl.BookServiceImpl,
				ua.sourceit.html.BookRenderer,
				ua.sourceit.businessobject.Book" %>

<%! private BookService service = new BookServiceImpl(); %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Детальная информация о книге </title>
</head>
<body>
	<BODY BGCOLOR=#FEF4D7>
	<h3><a href="index.jsp"> << Вернуться к списку книг</a></h3>

	<h2>О книге </h2>

	<% Book book = service.getBook(Integer.parseInt(request.getParameter("bookid")));%>

	<%= BookRenderer.toDetailedHtml(book) %><br>

	<h3><a href="index.jsp"> << Вернуться к списку книг</a></h3>
</body>
</html>
