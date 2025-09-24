// Ejercicio 1

const arrNums1 = [1, 2, 3, 4, 5, 6];

const resNums1 = arrNums1.filter(elem => elem % 2 === 0);

console.log(resNums1);

// Ejercicio 2

const arrStr = ["sol", "pluja", "mar"];

const resArrStr = arrStr.filter(elem => elem.length > 3);

console.log(resArrStr);

// Ejercicio 3

const arrNums2 = [2, 3, 4];

const resArrNums2 = arrNums2.reduce((acc, elem) => acc * elem, 1);

console.log(resArrNums2);

// Ejercicio 4

const arrStr2 = ['Hola', 'món'];

const resArrStr2 = arrStr2.reduce((acc, elem) => acc + elem, "");

console.log(resArrStr2);