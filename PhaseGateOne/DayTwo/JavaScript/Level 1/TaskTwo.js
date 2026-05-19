const prompt = require("prompt-sync")();
const age = Number(prompt("What is your age? "));

const newAge = age + 5;

console.log("You will be " + newAge + " years old in 5 years.")
