const prompt = require("prompt-sync")();

const first_number = Number(prompt("Enter first number: "));
const second_number = Number(prompt("Enter second number: "));

let sum = first_number + second_number;

console.log("The sum of two numbers is", sum);
