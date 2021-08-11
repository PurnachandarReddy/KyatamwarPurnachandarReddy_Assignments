var add1 = function (x, y) {
    return new Promise((resolve, reject) => {
        var sum = x + y;
        if (sum) {
            resolve(sum);
        }
        else {
            reject(Error("Could not add the two values!"));
        }
    });
};
Promise.all([add1(2, 2)]).then((values) => {
    console.log(values);
  }
  );