<%@ page 
	language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="ua.sourceit.service.BookService,
			ua.sourceit.service.impl.BookServiceImpl,
			ua.sourceit.html.BookRenderer,
			ua.sourceit.businessobject.Book" %>
			
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%! private BookService service = new BookServiceImpl(); %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Редактор</title>
</head>
<body>
	<BODY BGCOLOR=#FEF4D7>
	
	<h4><a href="javascript:history.back()"> << Отмена</a></h4>

	<% Book book = service.getBook(Integer.parseInt(request.getParameter("bookid")));%>

	<%= BookRenderer.toUpdateBookHtml(book) %>
	
	<h4><a href="javascript:history.back()"> << Отмена</a></h4>


</body>
</html>