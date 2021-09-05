let str=prompt("Enter String:");
var ar =str.split(" ");
var arr=[];
var rev=[];
var join=[];
for(var i=0; i<ar.length; i++)
{
	arr[i]=ar[i].split("");
	rev[i]=arr[i].reverse();
	join[i]=rev[i].join("")+"ay";

}
var final=join.join(" ");
console.log(final);