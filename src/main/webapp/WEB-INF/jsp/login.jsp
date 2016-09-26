<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=request.getContextPath() %>/" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">   
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">   
<script type="text/javascript" src="easyui/jquery.min.js"></script>   
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="easyui/easyui-lang-zh_CN.js"></script>  
<script type="text/javascript" src="js/login.js"></script>
</head>
<body>
	<div id="login-div">
		<div class="topbut">
			<a href="javascript:drow_login();">登录</a>
			<a href="javascript:drow_register();">注册</a>
		</div>
		<form id="loginInfo" method="post">
			<div>   
		        <label for="user.code">工号:</label>   
		        <input class="easyui-validatebox" type="text" name="user.code" data-options="required:true" />   
		    </div>   
		    <div>   
		        <label for="user.password">密码:</label>   
		        <input class="easyui-validatebox" type="password" name="user.password" data-options="required:true" />   
		    </div>
			<div class="bottombut">
				<input type="submit" value="提交">
				<input type="reset" value="重置">
			</div>
		</form>
		<form id="registerInfo" method="post">
			<div>   
		        <label for="name">姓名:</label>   
		        <input class="easyui-validatebox" type="text" name="name" data-options="required:true" />   
		    </div>   
			<div>   
		        <label for="code">工号:</label>   
		        <input class="easyui-validatebox" type="text" name="code" data-options="required:true" />   
		    </div>  
		    <div>   
		        <label for="pwd">密码:</label>   
		        <input class="easyui-validatebox" type="password" name="pwd" data-options="required:true" />   
		    </div>
			<div class="bottombut">
				<input type="submit" value="提交">
				<input type="reset" value="重置">
			</div>
		</form>
	</div>
	<!-- <div id="register-div" style="display:none">zc</div> -->
</body>
</html>