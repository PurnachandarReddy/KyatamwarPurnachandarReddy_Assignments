function add(a=20,b=30)
{
    console.log("a= "+a+" b= "+b)
}
add();

function userFriends(username,...friends)
{
    console.log(friends);
    console.log("Username "+username+" and his friends are "+friends);
}

userFriends("Rohit","Dhoni","sachin","kohli");
function printCapitalName(...name)
{
    return name;
    
}
let arrayNames=["Rohit","Dhoni","sachin","kohli"];
console.log(printCapitalName(...arrayNames));