String mensagemBoasVinda = "Bem-Vindo ao o Screen Sound !";
List<String> listaDeBandas = new List<string>();

void ExibirLogo() {
    Console.WriteLine(@"
    
░██████╗░█████╗░██████╗░███████╗███████╗███╗░░██╗░██████╗░█████╗░██╗░░░██╗███╗░░██╗██████╗░
██╔════╝██╔══██╗██╔══██╗██╔════╝██╔════╝████╗░██║██╔════╝██╔══██╗██║░░░██║████╗░██║██╔══██╗
╚█████╗░██║░░╚═╝██████╔╝█████╗░░█████╗░░██╔██╗██║╚█████╗░██║░░██║██║░░░██║██╔██╗██║██║░░██║
░╚═══██╗██║░░██╗██╔══██╗██╔══╝░░██╔══╝░░██║╚████║░╚═══██╗██║░░██║██║░░░██║██║╚████║██║░░██║
██████╔╝╚█████╔╝██║░░██║███████╗███████╗██║░╚███║██████╔╝╚█████╔╝╚██████╔╝██║░╚███║██████╔╝
╚═════╝░░╚════╝░╚═╝░░╚═╝╚══════╝╚══════╝╚═╝░░╚══╝╚═════╝░░╚════╝░░╚═════╝░╚═╝░░╚══╝╚═════╝░
    ");
    Console.WriteLine(mensagemBoasVinda);
}

void ExibirOpcaoDoMenu() {

    ExibirLogo();
    Console.WriteLine("\n1# - Adicionar uma banda");
    Console.WriteLine("2# - Mostrar todas as bandas");
    Console.WriteLine("3# - Avaliar a banda");
    Console.WriteLine("4# - Exibir avalição da banda");
    Console.WriteLine("5# - Para sair");

    Console.Write("\nDigite a opção desejada: ");
    String opcao = Console.ReadLine()!; //O ! serve para dizer que o valor não pode ser nulo
    int.TryParse(opcao, out int opcaoConvertidaInteiro);
    
    switch(opcaoConvertidaInteiro) {
        case 1: RegistrarBanda();
            break;
        case 2: ExibirListaDeBandas();
            break;
        case 3: Console.WriteLine("Você digitou a opção " + opcaoConvertidaInteiro);
            break;
        case 4: Console.WriteLine("Você digitou a opção " + opcaoConvertidaInteiro);
            break;
        case 5: Console.WriteLine("Até a proxima! :D");
            break;
        default: Console.WriteLine("Opação inválida!");
        break;
    }
}

void RegistrarBanda() {
  Console.Clear();
  ExibirTituloDaOpcao("Registro das bandas");
  Console.Write("Digite o noma da banda que deseja registrar: ");
  String nomeDaBanda = Console.ReadLine()!;
  listaDeBandas.Add(nomeDaBanda);
  Console.WriteLine($"A banda {nomeDaBanda} foi registrada com sucesso! ");
  Thread.Sleep(2000);
  Console.Clear();
  ExibirOpcaoDoMenu();
}

void ExibirListaDeBandas() {
    Console.Clear();
    ExibirTituloDaOpcao("Exibindo as bandas registradas");
    foreach (var banda in listaDeBandas) {
        Console.WriteLine($"Banda: {banda}");
        Thread.Sleep(2000);
    }
    ExibirOpcaoDoMenu();
}

void ExibirTituloDaOpcao(string titulo)
{
    int quantidadeDeLetras = titulo.Length;
    string asteriscos = string.Empty.PadLeft(quantidadeDeLetras, '*');
    Console.WriteLine(asteriscos);
    Console.WriteLine(titulo);
    Console.WriteLine(asteriscos + "\n");
}

ExibirOpcaoDoMenu();