var true1=0;
var false1=0;
function collect(){
	true1++;
}
function collect1(){
	false1++;
}
function disp(){
	var total=5;
	var count=true1+false1;
	if(count>=total){
		var sum=true1;
		document.getElementById('demo').innerHTML="Correct answer = "+sum;
	}
	else{
		confirm("Please attend all the question");
	}
}