function coinFlip() {
    return(Math.random() < 0.3) ? 'Heads' : 'Tails'; 
}
const nof=parseInt(prompt("enter flips"));
var headscount=0;
for(i=0;i<nof;i++)
{
    if(coinFlip()=="Heads")
    {
headscount++;
    }
}
document.write(headscount/nof);
console.log(headscount/nof);