var msg=document.getElementById('msg');



function calculator(expr){

	msg=document.getElementById('msg');
	document.getElementById('msg').value=msg.value+expr;

}

function exe(){
	try {
   document.getElementById('msg').value=eval(msg.value);
	}
catch(err) {
    document.getElementById("msg").value = 'Invalid Expression';
}
	
}
function clearscreen(){
	
	document.getElementById('msg').value="";

}