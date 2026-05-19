const prompt = require("prompt-sync")();

const radius = Number(prompt("Enter the radius of a circle: "));

let pi = 22 / 7;

let circumference = 2 * pi * radius;

console.log("The circumference of a circle is", circumference)
