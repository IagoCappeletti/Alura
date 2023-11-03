Random numero = new Random();
int numeroAleatorio = numero.Next(1, 100);
bool numeroEncontrado = false;

do {
    Console.Write("Digite um número entre 1 a 100: ");
    string numeroDigitado = Console.ReadLine()!;

/*
    Tenta converter a string numeroDigitado em um número inteiro. Se der certo ele retorna para o int.TryParse como true,
    e o número convertido. Caso de algo errado ele retorna false e continua como String e vai como opção inválida
 */
    if (int.TryParse(numeroDigitado, out int numeroDigitadoConvertido)) {  
        if (numeroDigitadoConvertido == numeroAleatorio) {
            Console.WriteLine("Você acertou o número na mosca!");
            numeroEncontrado = true;
        }
        else if (numeroDigitadoConvertido > numeroAleatorio) {
            Console.WriteLine("Um pouco menos!");
        }
        else {
            Console.WriteLine("Um pouco mais!");
        }
    }
    else {
        Console.WriteLine("Número inválido. Por favor, digite um número válido.");
    }
} while (!numeroEncontrado);
