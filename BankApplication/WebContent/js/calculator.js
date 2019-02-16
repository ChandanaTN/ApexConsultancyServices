var calculate=function(choice){
var num1=parseFloat(document.getElementById('num1').value);
var num2=parseFloat(document.getElementById('num2').value);
var res;
var choice=choice;

switch(choice)
	{
	case '+':
		res=num1+num2;
		break;
	case '-':
		res=num1-num2;
		break;
	case '*':
		res=num1*num2;
		break;
	case '/': 
		res=num1/num2;
		break;
	default:
		break;
			
	}
console.log(res);
document.getElementById('result').value=res;

	

}