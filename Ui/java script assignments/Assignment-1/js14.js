let r=[];
for(var i=0;i<100;i++)
{
    r[i]=i;
}
r.sort(function(a,b){
    return b-a;
})
console.log(r[0]);
console.log(r[100-1]);
var sum1=0;
var sum2=0;
var sum=0;
var avg=0;
for(var i=0;i<100;i++)
{
    if(r[i]%2==0)
    {
        sum1+=1;
    }
    else{
        sum2+=1;
    }
    sum+=r[i];
    avg=sum/100;
}
if(sum1>sum2)
{
    console.log("even count is high");
}
else
{
    console.log("odd count is high");
}
console.log(sum);
console.log(avg);
