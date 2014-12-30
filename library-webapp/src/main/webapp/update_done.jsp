<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"
				import="ua.sourceit.service.BookService,
				ua.sourceit.service.impl.BookServiceImpl,
				ua.sourceit.html.BookRenderer,
				ua.sourceit.businessobject.Book" %>

<%! private BookService service = new BookServiceImpl(); %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Готово</title>
</head>
<body>
	<BODY BGCOLOR=#FEF4D7>
	<h1>Информация о книге обновлена</h1>

 <% Integer id = Integer.parseInt(request.getParameter("id"));
 	String author = request.getParameter("author"); 
	String name = request.getParameter("name");
	Integer year = Integer.parseInt(request.getParameter("year"));
	String summary = request.getParameter("summary"); %>

	<% service.updateBook(id, author, name, year, summary); %>
	
	<h3><a href="index.jsp"> << Вернуться к списку книг</a></h3>
	
</body>
</html>