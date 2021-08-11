interface Printable{
    print();
}

let circle:Printable={
    print()
    {
        console.log("This is a circle object");
    }

};
let employee:Printable={
    print()
    {
        console.log(" This is an employee object ");
    }

};
function printAll(...objs)
{
    for(let obj of objs)
    {
    console.log(obj.print());
    }
}
printAll(circle,employee);