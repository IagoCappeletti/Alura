String mensagemBoasVinda = "Bem-Vindo ao o Screen Sound !";
//List<String> listaDeBandas = new List<string>();

Dictionary<String, List<int>> bandasRegistradas = new Dictionary<string, List<int>>(); 

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
        case 3: AvaliarBanda();
            break;
        case 4: ExibirMediaDaAvaliacao();
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
  Console.Write("Digite o nomea da banda que deseja registrar: ");
  String nomeDaBanda = Console.ReadLine()!;
  bandasRegistradas.Add(nomeDaBanda, new List<int>());
  Console.WriteLine($"A banda {nomeDaBanda} foi registrada com sucesso! ");
  Thread.Sleep(2000);
  Console.Clear();
  ExibirOpcaoDoMenu();
}

void ExibirListaDeBandas() {
    Console.Clear();
    ExibirTituloDaOpcao("Exibindo as bandas registradas");
    foreach (var banda in bandasRegistradas.Keys) {
        Console.WriteLine($"Banda: {banda}");
        Thread.Sleep(2000);
    }
    ExibirOpcaoDoMenu();
    
}

void AvaliarBanda() {
    Console.Clear();
    ExibirTituloDaOpcao("Avaliar banda");
    
    Console.Write("Digite o nome da banda para avaliar: ");
    string nomeDaBanda = Console.ReadLine()!;
    if (bandasRegistradas.ContainsKey(nomeDaBanda)) {
        Console.Write($"Qual sua avaliação para a banda {nomeDaBanda}: ");
        int nota = int.Parse(Console.ReadLine()!);
        bandasRegistradas[nomeDaBanda].Add(nota);
        Console.WriteLine($"\nA nota {nota} para a {nomeDaBanda} foi registrada com sucesso!");
        Thread.Sleep(3000);
    }
    else {
        Console.WriteLine($"A banda {nomeDaBanda} não foi encontrada!");
        Thread.Sleep(2000);
        Console.Clear();
        ExibirOpcaoDoMenu();
    }
    
    ExibirOpcaoDoMenu();
}

void ExibirMediaDaAvaliacao() {
    Console.Clear();
    ExibirTituloDaOpcao("Avaliação da banda");
    Console.Write("Qual banda você quer ver a média? ");
    string avaliacaoBandaNome = Console.ReadLine()!;
    if (bandasRegistradas.ContainsKey(avaliacaoBandaNome)) {
        List<int> avaliacoes = bandasRegistradas[avaliacaoBandaNome];
        double media = avaliacoes.Count > 0 ? avaliacoes.Average() : 0;
        Console.WriteLine($"A média da banda {avaliacaoBandaNome} é: {media}");
        Thread.Sleep(3000);
    } else {
        Console.WriteLine("Banda não encontrada!");
    }

    Console.Clear();
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