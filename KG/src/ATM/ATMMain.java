package ATM;

import java.util.InputMismatchException;
import java.util.Scanner;

import program.Program;

public class ATMMain implements Program {

	private Scanner scan = new Scanner(System.in);
	
	private final int OPENED = 1;
	private final int DEAL = 2;
	private final int HISTORY = 3;
	private final int EXIT = 4;
	
	@Override
	public void printMenu() {
		System.out.print("메뉴\r\n"
						+ "1. 통장개설\r\n"
						+ "2. 통장거래\r\n"
						+ "3. 통장거래내역\r\n"
						+ "4. 프로그램 종료 \r\n"
						+ "메뉴 선택 : ");
	}
		


	@Override
	public void run() {
		int menu = 0;
		
		do {
			printMenu();
			try {
				menu = scan.nextInt();
				printBar();
				runMenu(menu);
			} catch(InputMismatchException e) {
				printBar();
				System.out.println("올바른 메뉴를 입력하세요.");
				scan.nextLine();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (menu != 4);
		
	}

	@Override
	public void runMenu(int menu) throws Exception {
		switch (menu) {
		case OPENED:
			opened();
			break;
		case DEAL:
			deal();
			break;
		case HISTORY:
			history();
			break;
		case EXIT:
			exit();
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
			break;
		}
		
	}
	
	private void opened() {
		BankBookType bt = BankBookType.INSERT;
		
		
	}



	/**중간 줄을 출력하는 메소드*/
	private void printBar() {
		System.out.println("----------------------------");
	}

}
