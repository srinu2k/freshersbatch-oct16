var LongestToken= function()
{
	var string=prompt("enter the string:");
	var string1=string.split(["ab",'a']);
	string1.sort(function(a,b)
	{
		return b.length-a.length;
	})
	console.log(string1[0]);
}
console.log(LongestToken());