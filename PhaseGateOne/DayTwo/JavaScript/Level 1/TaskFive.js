const prompt = require("prompt-sync")();

const celsius = Number(prompt("Enter Temperature in Celsius: "));

let fahrenheit = (celsius * 9/5) + 32;

console.log("The Temperature in Fahrenheit is " + fahrenheit + " degree");
