<!DOCTYPE html>
<html>
 
	<head>
		<meta charset="utf-8">
		<title></title>
		<script type="text/javascript">
			function checkall(){
				var checks=document.getElementsByName("one");
				for(var i=0;i<checks.length;i++){
					checks[i].checked=true;
				}
				
			}
			function delectall(){
				var checks=document.getElementsByName("one");
				for(var i=0;i<checks.length;i++){
					checks[i].checked=false;
				}
			}
			function reverse(){
				var checks=document.getElementsByName("one");
				for(var i=0;i<checks.length;i++){
					checks[i].checked=!checks[i].checked;
				}
				
			}
		</script>
	</head>
 
	<body>
		<input type="checkbox" name="one" id="one" value="选项一" />选项一
		<br />
		<input type="checkbox" name="one" id="one" value="选项二" />选项二
		<br />
		<input type="checkbox" name="one" id="one" value="选项三" />选项三
		<br />
		<input type="checkbox" name="one" id="one" value="选项四" />选项四
		<br />
		<input type="button" name="" id="check" value="全选" onclick="checkall()" />
		<br />
		<input type="button" name="" id="" value="全不选" onclick="delectall()" />
		<br />
		<input type="button" name="" id="" value="反选" onclick="reverse()" />
		<br />
 
	</body>
 
</html>