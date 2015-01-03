<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8"
				import="ua.sourceit.service.BookService,
				ua.sourceit.service.impl.BookServiceImpl,
				ua.sourceit.html.BookRenderer,
				ua.sourceit.businessobject.Book" %>

<%! private BookService service = new BookServiceImpl(); %>

<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Книга добвалена</title>
<body>
	<BODY BGCOLOR=#FEF4D7>
	<h1>Книга успешно добавлена</h1>

 <% String author = request.getParameter("author"); 
	String name = request.getParameter("name");
	Integer year = Integer.parseInt(request.getParameter("year"));
	String summary = request.getParameter("summary"); %>

	<% service.addBook(0, author, name, year, summary); %>
	
	<h3><a href="index.jsp">Вернуться к списку книг</a></h3>
	
</body>
</html>