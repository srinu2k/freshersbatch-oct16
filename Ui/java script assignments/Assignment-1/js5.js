var num=parseInt(prompt("enter current year"));
var yearsPrinted = 0;

function leapYears() {
    while (yearsPrinted < 20) { 
        if ((num % 4 === 0) && (!((num % 100===0) && (num % 400 !== 0)))) {
            document.write(num + "<br>");
            yearsPrinted++;
            num++;
        } else {
            num++;
        }
    }       
}

leapYears();