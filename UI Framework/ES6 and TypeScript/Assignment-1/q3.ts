let Order={
    id:101,
    title:"Indian Economy",
    price:767,
   
};
function printOrder()
{
 console.log("Order details :"+Order.id+" "+Order.title+" "+Order.price);
}
 function getPrice()
 {
 return Order.price;
 }
var Book=Object.assign(Order);
printOrder();
console.log( getPrice());
console.log(Book.id+" "+Book.title+" "+Book.price);