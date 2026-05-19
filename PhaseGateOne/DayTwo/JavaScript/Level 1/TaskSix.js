const prompt = require("prompt-sync")();

const length = Number(prompt("Enter Length of a Rectangle: "));
const width = Number(prompt("Enter Width of a Rectangle: "));

let area = length * width;

console.log("The area of the reactangle is", area)
