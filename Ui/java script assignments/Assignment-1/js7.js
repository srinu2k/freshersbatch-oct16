var marks= parseInt(prompt("enter dollars"));
function a(){  
    document.getElementById("geek").innerHTML =marks+ " dollars = "+marks*74.28 +" Indian Rupees"
}  
function b(){  
    document.getElementById("g2").innerHTML =marks+ " dollars = "+marks*109.14 +" Japanese Yen" 
}  
function c(){  
    document.getElementById("g3").innerHTML =marks+ " dollars = "+marks*0.84 +" Euro" 
}  
function d(){  
    document.getElementById("g4").innerHTML =marks+ " dollars = "+marks*0.72 +" Pound"
}  
a();
b();
c();
d(); 