var list=[1,2,3,4,5];
var k= parseInt(prompt("enter the rotating index:"));
for (i=0;i<k;i++)
{
var q=list.shift();
list.push(q);
}
console.log(list);