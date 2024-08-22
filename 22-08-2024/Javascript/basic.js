// var x;
// x = 10;
// console.log(x);


// function doHomework(name)
// {
//     console.log("My name is " + name);
// }
// doHomework("Akhil");


function doHomework(name,callback)
{
    console.log(`My name is ${name} Chaurasiya`);
    callback();
}

function doAlert()
{
    console.log("it is a alert messgae");
}

doHomework("akhil",doAlert);


var sum = (a,b) => {
    let result = a+b;
    console.log(result);
};

sum(3,5);

function greeting()
{
    var msg = "hii";

    function sayHi()
    {
        console.log(msg);
    }
    return sayHi;
}

let hi = greeting();
hi();


function sumNum(...input)
{
    var sum = 0;
    for(let i of input)
    {
       sum = sum+i
    }
    return sum;
}

console.log(sumNum(1));
console.log(sumNum(1,4,6,7));
console.log(sumNum(1,5,7,5,3,2));
sumNum(1,5,7);
sumNum(1,6,8,4,2,2);
