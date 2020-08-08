<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>图书列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
	<link href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
	<link href="${pageContext.request.contextPath }/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" media="screen">

    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.js" charset="UTF-8"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>

    <script type="application/javascript">
        $(function () {
                $.ajax({
                    methods:"get",
                    url:"http://localhost:8080/goods/findAllGoods",
                       success: function (data) {
                            var glist = $("#glist");
                            $(data).each(function (index) {
                                var tbody = "<tr><td>"+ this.goodsName +"</td><td>"+ this.category.cname +"</td><td>"+ this.goodsNumber +"</td><td>"+ this.goodsPrice +"</td><td>"+ this.guaranteePeriod +"</td><td>修改 删除</td>\</tr>";
                                glist.append(tbody)
                            })
                       }
                })
            })
    </script>
</head>
<body>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading text-center">
            <h2>商品列表</h2>
        </div>

        <div class="panel-body">
            <table class="table table-hover">
                <thead>
					<tr>
						<th>商品名称</th>
						<th>所属分类</th>
						<th>商品数量</th>
						<th>商品价格</th>
						<th>保质期</th>
						<th>操作</th>
					</tr>
                </thead>
				
                <tbody id="glist">

                </tbody>
            </table> 
        </div>

        
    </div>
</div>
</body>
</html>

