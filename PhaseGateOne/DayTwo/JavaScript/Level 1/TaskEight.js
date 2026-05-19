const prompt = require("prompt-sync")();

const number = Number(prompt("Enter a number: "));

let result = number * number;

console.log("The square of " + number + " is", result);
