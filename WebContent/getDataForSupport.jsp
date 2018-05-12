<!DOCTYPE html>
<html>
<head>
	<title>Support Data</title>
	<script
  src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
  </script>
</head>
<body>
	<ul id = "test">
		Loading.....
	</ul>
	<script type="text/javascript">
		function getSupportData() {
	$.ajax({
		url : 'QuickSupportController',
		async : true,
		datatype : 'json',
		beforeSend: function(){
			document.getElementById('test').innerHTML = "...LOADING";
		},
		type : "GET",
		//while using the POST request data :
		//Boolean value used in Get request
		cache :  false,
		//call back methods in which the result is received
		success : function(data){
			/*var objectData = JSON.parse(data)
			console.log(objectData.login +" "+ objectData.created_at)*/
			data = JSON.parse(data);
			document.getElementById('test').innerHTML = (function(){
				var dataArray =[];
				var i;	
				for(i = 0; i < data.length; i++){
					dataArray.push(data[i].quickSupportData);
				}
				return generateTable(dataArray);
			})();
		},
		error : function(err){
			console.log(err)
		},
	});
}

getSupportData();

function generateTable(argument) {
	console.log(argument);
	var finalOutput = '';
	finalOutput = finalOutput+'<ol>'
	var i;
	for (i = 0; i < argument.length; i++) {
		var obj = argument[i]
		finalOutput = finalOutput+'<li>'+obj.name+' '+obj.email+' '+obj.bookingNumber+' '+obj.status+' '+obj.comments+'</li>';
	}
	finalOutput = finalOutput+'</ol>';
	return finalOutput;
}
	</script>
</body>
</html>