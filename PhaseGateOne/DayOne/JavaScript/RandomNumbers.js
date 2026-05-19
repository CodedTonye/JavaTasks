let userInput = 0;
let count = 1;

let random = Math.floor(Math.random() * 100) + 1;

while (count <= 5) {

    const prompt = require("prompt-sync")();
        userInput = prompt("Guess the correct number between 1 - 100: ");

count += 1;

if (userInput != random && random > userInput) {
                console.log("Wrong! The number is higher", random = Math.floor(Math.random() * 100) + 1);
            }
            else if (userInput != random && random < userInput) {
                console.log("Wrong! The number is lower", random = Math.floor(Math.random() * 100) + 1);
            }
            else if (userInput == random) {
                console.log("Correct");
                break;
            }
            else if (userInput < 1 || userInput > 100) {
                console.log("Out of bound");
            }
            

//
//console.log(random)
}
//console.log(random);

