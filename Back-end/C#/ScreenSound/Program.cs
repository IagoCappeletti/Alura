String mensagemBoaVinda = "Bem-Vindo ao o Screen Sound !";

void ExibirMensagemBoasVinda () {
    Console.WriteLine(@"
    
░██████╗░█████╗░██████╗░███████╗███████╗███╗░░██╗░██████╗░█████╗░██╗░░░██╗███╗░░██╗██████╗░
██╔════╝██╔══██╗██╔══██╗██╔════╝██╔════╝████╗░██║██╔════╝██╔══██╗██║░░░██║████╗░██║██╔══██╗
╚█████╗░██║░░╚═╝██████╔╝█████╗░░█████╗░░██╔██╗██║╚█████╗░██║░░██║██║░░░██║██╔██╗██║██║░░██║
░╚═══██╗██║░░██╗██╔══██╗██╔══╝░░██╔══╝░░██║╚████║░╚═══██╗██║░░██║██║░░░██║██║╚████║██║░░██║
██████╔╝╚█████╔╝██║░░██║███████╗███████╗██║░╚███║██████╔╝╚█████╔╝╚██████╔╝██║░╚███║██████╔╝
╚═════╝░░╚════╝░╚═╝░░╚═╝╚══════╝╚══════╝╚═╝░░╚══╝╚═════╝░░╚════╝░░╚═════╝░╚═╝░░╚══╝╚═════╝░
    ");
    Console.WriteLine(mensagemBoaVinda);
}

void ExibirOpcaoDoMenu() {

    Console.WriteLine("\n1# - Adicionar uma banda");
    Console.WriteLine("2# - Mostrar todas as bandas");
    Console.WriteLine("3# - Avaliar a banda");
    Console.WriteLine("4# - Exibir avalição da banda");
    Console.WriteLine("5# - Para sair");

    Console.Write("\nDigite a opção desejada: ");
    String opcao = Console.ReadLine()!; //O ! serve para dizer que o valor não pode ser nulo
    int.TryParse(opcao, out int opcaoConvertidaInteiro);
    
    switch(opcaoConvertidaInteiro) {
        case 1: Console.WriteLine("Você digitou a opção " + opcaoConvertidaInteiro);
            break;
        case 2: Console.WriteLine("Você digitou a opção " + opcaoConvertidaInteiro);
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

ExibirMensagemBoasVinda();
ExibirOpcaoDoMenu();