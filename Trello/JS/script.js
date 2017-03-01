function valid()
{
var result=true;
var e=document.getElementsByName("email")[0].value;
var atindex=e.indexOf('@');
var dotindex=e.lastIndexOf('.');
if(atindex<1 || dotindex=>e.length-2 ||dotindex-atindex<3)
result=false;
return(result);
}
function effect()
{
var x=document.getElementById("a");
x.style.backgroundColor="green";
}
function undoeffect()
{
var x=document.getElementById("a");
x.style.backgroundColor="white";
}
function add(a,b)
{
document.write(a+b);
}
