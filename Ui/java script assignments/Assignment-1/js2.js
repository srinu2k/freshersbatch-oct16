const number = parseInt(prompt('Enter a positive integer: '));
var sum = 0;
for (let i = 1; i <= number; i++) {
    if(i%3==0)
    {
    sum += i;
    }
}
console.log('The sum of natural numbers:', sum);
document.write('The sum of natural numbers:', sum);