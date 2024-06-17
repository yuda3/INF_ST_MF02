<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="cpath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    <script>
        function showTitle(button){
            let row = button.closest("tr");
            let title = row.querySelector("td:nth-child(2)").textContent;
            document.getElementById("searchTitle").textContent="Selected Book Title:" + title;
        }
    </script>
</head>
<body>

<div class="container-fluid mt-3">
    <h1>Java Spring Full Stack Developer</h1>
    <p>Resize the browser window to see the effect.</p>
    <p>The first, second and third row will automatically stack on top of each other when the screen is less than 576px wide.</p>

    <div class="container-fluid">

        <div class="card">
            <div class="card-header">Java Spring Framework</div>
            <div class="card-body">
                <div class="row">
                    <div class="col-sm-2 mb-2">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Left</h4>
                                <p class="card-text">Some example text. Some example text.</p>
                                <a href="#" class="card-link">Card link</a>
                                <a href="#" class="card-link">Another link</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-7 mb-2">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Book List</h4>
                                <p class="card-text">Show Book List</p>
                                <table class="table table-bordered table-hover">
                                    <thead>
                                    <tr>
                                        <th>NUMBER</th>
                                        <th>TITLE</th>
                                        <th>PRICE</th>
                                        <th>AUTHOR</th>
                                        <th>PAGE</th>
                                        <th>SEARCH</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="book" items="${list}">
                                        <tr>
                                            <td>${book.num}</td>
                                            <td>${book.title}</td>
                                            <td>${book.price}</td>
                                            <td>${book.author}</td>
                                            <td>${book.page}</td>
                                            <td><button class="btn btn-sm btn-info" onclick="showTitle(this)">Search</button></td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-3">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Result</h4>
                                <p class="card-text" id="searchTitle"></p>
                                <a href="#" class="card-link">Card link</a>
                                <a href="#" class="card-link">Another link</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="card-footer text-center">Java Spring Full Stack Developer</div>
        </div>

    </div>
</div>

</body>
</html>