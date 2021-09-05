let r=[];
var newlist=function(){
array=[11,22,33,44];
for(var i=array.length-1;i>=0;i--)
{
    r.push(array[i]);
}
return r;
}
console.log(newlist());