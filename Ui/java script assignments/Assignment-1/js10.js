var newlist=function()
{
let r=[];
r[0]=1;
r[1]=1;
for(var i=1;i<100-1;i++)
{
    r[i+1]=r[i]+r[i-1];
}
return r;
}

console.log(newlist());