<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="ua.sourceit.service.BookService,
				ua.sourceit.service.impl.BookServiceImpl,
				ua.sourceit.html.BookRenderer,
				ua.sourceit.businessobject.Book" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%! private BookService service = new BookServiceImpl(); %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Книга удалена</title>
</head>
<body>
	<BODY BGCOLOR=#FEF4D7>
	
	<h3><a href="index.jsp"> << Вернуться к списку книг</a></h3>
	
	<h3>Выбранная книга удалена</h3>
	<% Integer id = Integer.parseInt(request.getParameter("id"));%>

	<% service.deleteBook(id); %>
	
	<h3><a href="index.jsp"> << Вернуться к списку книг</a></h3>

</body>
</html>