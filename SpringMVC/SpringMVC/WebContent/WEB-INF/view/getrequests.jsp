<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }
        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
        tr:nth-child(even) {
            background-color: #dddddd;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        td {
            background-color: #f2f2f2;
        }
    </style>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <link data-require="bootstrap-css@*" data-semver="3.0.0" rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" />
    <script data-require="angular.js@*" data-semver="1.2.0-rc3-nonmin" src="http://code.angularjs.org/1.2.0-rc.3/angular.js"></script>
    <script src="https://code.jquery.com/jquery-2.2.4.js"></script>
    <title>Contracts information</title>
</head>

<body>
<h1>Contracts Section</h1>
</body>
<br>
<div id="filterdiv">
    <sec:authorize access="hasRole('MANAGER')">
        <select id="mySelector">
            <option value="All" selected="selected">All</option>
            <option value="Accepted" >Accepted</option>
            <option value="Declined">Declined</option>
            <option value="Pending">Pending</option>
        </select>
    </sec:authorize>
</div>

<form:form action="status" method="post">
    <c:if test="${not empty reqlist}">
        <table id="table" border="1" cellpadding="1">
            <caption>
                <h2>List of Contracts</h2>
            </caption>
            <tr>
                <!--to view sto secretariat-->
                <th>ID</th>
                <th>Username</th>
                <th>Onoma_Sizigou_1</th>
                <th>Onoma_Sizigou_2</th>
                <th>Onoma_Dikigorou_2</th>
                <th>Onoma_Simbolaiografou</th>
                <th>Imerominia</th>
                <th>Topos_Katoikias</th>
                <td>Afm1</td>
                <td>Afm2</td>
                <td>Afm3</td>
                <td>Afm4</td>
                <td>Mitronimo</td>
                <td>Patronimo</td>
                <td>Mitronimo2</td>
                <td>Patronimo2</td>
                <td>Dieuthinsi</td>
                <td>Dieuthinsi2</td>
                <td>Tekna</td>
                <td>Epimelia</td>
                <th style="width: 1000px; font-size: 16px; line-height: 1.5;">episimo simfonitiko</th>
                <th style="width: 1000px; font-size: 16px; line-height: 1.5;">episimo simfonitiko simbolaografou</th>
                <th>State</th>



                <sec:authorize access="hasRole('SIMBOLAIOGRAFOS')">
                    <th>Actions</th>
                </sec:authorize>
            </tr>
            <c:forEach items="${reqlist}" var="contracts">

                <tr>
                    <td><c:out value="${contracts.getId()}" /></td>
                    <td><c:out value="${contracts.getUser().getUsername()}" /></td>
                    <td><c:out value="${contracts.getSub1()}" /></td>
                    <td><c:out value="${contracts.getSub2()}" /></td>
                    <td><c:out value="${contracts.getSub3()}" /></td>
                    <td><c:out value="${contracts.getSub4()}" /></td>
                    <td><c:out value="${contracts.getSub5()}" /></td>
                    <td><c:out value="${contracts.getSub6()}" /></td>
                    <td><c:out value="${contracts.getSub7()}" /></td>
                    <td><c:out value="${contracts.getSub8()}" /></td>
                    <td><c:out value="${contracts.getSub9()}" /></td>
                    <td><c:out value="${contracts.getSub10()}" /></td>
                    <td><c:out value="${contracts.getSub11()}" /></td>
                    <td><c:out value="${contracts.getSub12()}" /></td>
                    <td><c:out value="${contracts.getSub13()}" /></td>
                    <td><c:out value="${contracts.getSub14()}" /></td>
                    <td><c:out value="${contracts.getSub15()}" /></td>
                    <td><c:out value="${contracts.getSub16()}" /></td>
                    <td><c:out value="${contracts.getSub17()}" /></td>
                    <td><c:out value="${contracts.getSub18()}" /></td>
                    <c:out value="${contracts.setTeachername1(contracts.getSub1(), contracts.getSub2(), contracts.getSub3(),contracts.getSub4(), contracts.getSub5(), contracts.getSub6(), contracts.getSub7(), contracts.getSub8(), contracts.getSub9(), contracts.getSub10(), contracts.getSub11(), contracts.getSub12(), contracts.getSub13(), contracts.getSub14(),  contracts.getSub15(), contracts.getSub16(), contracts.getSub17(), contracts.getSub18(), contracts.getTeachername1(), contracts.getTeachername2())}" />
                    <td>
                        <div style="width: 400px; height: auto; word-wrap: break-word;">
                            <c:out value="${contracts.getTeachername1()}" />
                        </div>
                    </td>
                    <c:out value="${contracts.setTeachername2(contracts.getSub1(), contracts.getSub2(), contracts.getSub3(),contracts.getSub4(), contracts.getSub5(), contracts.getSub6(), contracts.getSub7(), contracts.getSub8(), contracts.getSub9(), contracts.getSub10(), contracts.getSub11(), contracts.getSub12(), contracts.getSub13(), contracts.getSub14(),  contracts.getSub15(), contracts.getSub16(), contracts.getSub17(), contracts.getSub18(), contracts.getTeachername1(), contracts.getTeachername2())}" />
                    <td>
                        <div style="width: 450px; height: auto; word-wrap: break-word;">
                            <c:out value="${contracts.getTeachername2()}" />
                        </div>
                    </td>

                    <td name="Status"><c:out value="${contracts.getState()}" /></td>
                    <sec:authorize access="hasRole('SIMBOLAIOGRAFOS')">
                        <td name="buttons">
                            <button  name="accept" class="accept" style="font-size:16px"><span class="glyphicon glyphicon-ok" onmouseover="this.style.color='blue'" onmouseout="this.style.color='black'"></span></button>
                            <button  name="decline" class="decline" style="font-size:16px" ><span class="glyphicon glyphicon-remove" onmouseover="this.style.color='blue'" onmouseout="this.style.color='black'"></span></button>
                        </td>
                    </sec:authorize>
                </tr>
            </c:forEach>
        </table>
    </c:if>
    <input type="hidden" name="id" id="id" >
</form:form>
<c:if test="${empty reqlist}">
    <p>No requests found</p>
</c:if>

<script type="text/javascript">

    $(".accept").click(function() {
        var currentRow = $(this).closest("tr")[0];
        var cells = currentRow.cells;
        var id= cells[0].textContent;
        $("#id").val(id);

    });

    $(".decline").click(function() {
        var currentRow = $(this).closest("tr")[0];
        var cells = currentRow.cells;
        var id= cells[0].textContent;
        $("#id").val(id);

    });

    $(document).ready(function($) {
        $('#mySelector').change(function() {
            $('table').show();
            var selection = $(this).val();
            var dataset = $('#table tbody').find('tr');
            // show all rows first
            dataset.show();
            // filter the rows that should be hidden
            if(selection!="All"){
                dataset.filter(function(index, item) {
                    return $(item).find('td[name ="Status"]').text().indexOf(selection) === -1;
                }).hide();
            }

        });
    });

</script>
</html>