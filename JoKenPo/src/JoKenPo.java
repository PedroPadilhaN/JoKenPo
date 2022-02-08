import java.util.Scanner;

public class JoKenPo {
	public static void main(String args[]){

		Scanner ler = new Scanner(System.in);

		int player, cpu;
		String playerName;
		System.out.println("Qual seu nome?");
		playerName = ler.nextLine();

		System.out.println(":::JoKenPo:::\n");
		
		System.out.println("1. Pedra | 2. Papel | 3. Tesoura");
		System.out.println("Digite a opcao desejada: ");

		//logica do jogador
		
		player = ler.nextInt();
		switch(player){
		case 1:
			System.out.println("\n" + playerName + " escolheu Pedra");
			break;
		case 2:
			System.out.println("\n" + playerName + " escolheu Papel");
			break;
		case 3:
			System.out.println("\n"+ playerName + " escolheu Tesoura");
			break;
		default:
			System.out.println("\nOpcao invalida");
			break;
		}

		// lógica do computador
		cpu = (int)(Math.random()*3 + 1);
		ler.close();

		switch(cpu){
		case 1:
			System.out.println("CPU escolheu Pedra");
			break;
		case 2:
			System.out.println("CPU escolheu Papel");
			break;
		case 3:
			System.out.println("CPU escolheu Tesoura");
			break;
		}
		//logica para declarar vencedor
		if (player == cpu){
			System.out.println("EMPATE");
		} else {
			if((player == 1 && cpu == 3) || (player == 2 && cpu == 1) || (player == 3 && cpu == 2))  {
				System.out.println(playerName + " VENCEU!");
			} else {
				System.out.println("CPU VENCEU!");
			}
		}

	}



}