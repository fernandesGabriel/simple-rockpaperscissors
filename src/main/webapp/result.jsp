<%@ page import ="java.util.*" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<%
    Map<String, Integer> scoreboard = (TreeMap<String, Integer>) request.getAttribute("scoreboard");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Rock-Paper-Scissors</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

</head>
<body>

    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="mt-5 px-3 mx-auto text-center">
                    <h1 class="display-4">Rock-Paper-Scissors</h1>
                    <h2 class="display-5">We have winners</h2>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-4 offset-lg-4">
                <table class="table mt-5 px-3">
                    <tbody>
                        <c:forEach items="${scoreboard}" var="player">
                            <tr>
                                <th scope="row">${player.key}</th>
                                <td>${player.value}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <div class="row">
            <div class="col-12">
                <div class="px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
                    <a href="go" class="btn btn-outline-dark btn-lg">Play again</a>
                </div>
            </div>
        </div>
    </div>

</body>
</html>