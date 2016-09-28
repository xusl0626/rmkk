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
	    url:"tologin",    
	    onSubmit: function(){    
	        return true;
	    },    
	    success:function(data){  
	    	console.log(data);
	    	var data = eval('(' + data + ')');
	    	if(data==null){
	    		alert("用户不存在");
	    	}else{
	        	location.href="login";
	    	}
	    }    
	});  
	
	/*注册*/
	$('#registerInfo').form({    
	    url:"toregister",    
	    onSubmit: function(){    
	        return true;    
	    },  
	    success:function(data){    
	        console.log(data) 
	        if(data==null){
	        	alert("用户重复");
	        }else{
	        	location.href="login";
	        }
	    }    
	});

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