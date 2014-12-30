<%@ page language="java" contentType="text/html; charset=UTF-8"
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
<title>Внимание!!! Удаление книги!!!</title>
</head>
<body>
	<BODY BGCOLOR=#FEF4D7>
	
	<h4><a href="javascript:history.back()"> << Отмена</a></h4>
	<h1><font color="red">Вы действительно хотите удалить следующую книгу?</font> </h1>

	<% Book book = service.getBook(Integer.parseInt(request.getParameter("bookid")));%>

	<form action="delete_done.jsp" method="post">
    <h3> Инв.№ :
    <input type="text" size = "4" name="id" value="<%= book.getId()%>"  style="background: #FEF4D7" readonly ></h3>
    <h3> Название книги: <%= book.getBookName() %> (<%= book.getYear()%> г.)</h3> 
    <h3> Автор: <%= book.getAuthor()%></h3> 
    
    <input type="submit" value="Подтвердить" style="background: #FC2847"></form>

	
	<h4><a href="javascript:history.back()"> << Отмена</a></h4>


</body>
</html>