<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>站点列表</h3>
	<div id="toolbar">
		<button id="btnQuery">查询</button>
		<a href="insert">添加</a>
	</div>
		${pageContext.request.contextPath}
	<table id="stationGrid" border="1" cellpadding="4" cellspacing="0">
		<tr>
			<th>站号</th>
			<th>站名</th>
		</tr>
		<div id="stationGridContent">
			<c:forEach items="${stationList}" var="station">
				<tr>
					<td>${station.stationNo}</td>
					<td>${station.stationNam}</td>
					<td>${station.lastUpdateTime}</td>
					<td>${station.dateTime}</td>
				</tr>
			</c:forEach>
		</div>
	</table>
<script type="text/javascript">
	$("#btnQuery").click(function(){
		$.ajax({
			url: "station/findByWhere",
			type: "GET",
			data: {},
			success: function(stationList) {
				$("#stationGrid")
				stationList

			}
		});
	});
</script>
</body>
</html>