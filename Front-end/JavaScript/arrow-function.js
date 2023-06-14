
// Arrow function 
const apresentaArrow = nome => `meu nome é ${nome}`;
const soma = (num1, num2) => num1 + num2;


// Aroorw function com mais de uma linha
const somaNumerosPequenos = (num1, num2) => {
    if (num1 > 10 || num2 > 10) {
        return "Somente números de 1 a 9";
    } else {
        return num1 + num2;
    }
}