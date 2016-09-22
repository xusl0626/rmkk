$(function(){
/* 	$('#login-div').dialog({    
	    title: 'My Dialog',    
	    width: 400,    
	    height: 200,    
	    closed: false,    
	    cache: false,    
	    modal: true,
	    toolbar:[{
			text:'登录',
			iconCls:'icon-man',
			handler:function(){
				$("#loginInfo").show();
				$("#registerInfo").hide();
			}
		},{
			text:'注册',
			iconCls:'icon-add',
			handler:function(){
				$("#loginInfo").hide();
				$("#registerInfo").show();
			}
		}],
		buttons:[{
			text:'提交',
			handler:function(){
				
			}
		},{
			text:'重置',
			handler:function(){
				$("#registerInfo")[0].reset();
				$("#loginInfo")[0].reset();
			}
		}]
	});  */
	
	/*登录*/
	$('#loginInfo').form({    
	    url:"login",    
	    onSubmit: function(){    
	        return true;
	    },    
	    success:function(data){  
	    	var data = eval('(' + data + ')');
	        alert(data.flag);  
	    }    
	});  
	
	/*注册
	$('#registerInfo').form('submit', {    
	    url:"",    
	    onSubmit: function(){    
	        // do some check    
	        // return false to prevent submit;    
	    },    
	    success:function(data){    
	        alert(data)    
	    }    
	});*/

	$("#registerInfo").hide();
});
function drow_login(){
	$("#registerInfo").hide();
	$("#loginInfo").show();
}
function drow_register(){
	$("#loginInfo").hide();
	$("#registerInfo").show();
}
function toRegister(){
	   
}