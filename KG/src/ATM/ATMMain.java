package ATM;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import program.Program;

public class ATMMain implements Program {

	private Scanner scan = new Scanner(System.in);
	private List<BankBook> list = new ArrayList<BankBook>();
	
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
	
	private void deal() {
		// TODO Auto-generated method stub
		
	}



	private void opened() {
		BankBookType bt = BankBookType.INSERT;
		do {
			printBankBookMenu();
			try {
				int munu = scan.nextInt();

				bt = BankBookType.fromValue(munu);
				runBankBookMenu(bt);
				
			} catch(InputMismatchException e) {
				printBar();
				System.out.println("올바른 타입을 입력하세요.");
				printBar();
				scan.nextLine();
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (bt != BankBookType.EXIT);
		
	}



	private void printBankBookMenu() {
		System.out.print(
				    "통장개설 메뉴\r\n"
				  + "1. 통장 개설\n"
				  + "2. 통장 해지\n"
				  + "3. 이전으로\n"
				  + "메뉴 선택 : ");
	}



	private void runBankBookMenu(BankBookType bt) {
		switch (bt) {
		case INSERT:
			insert();
			break;
		case DELETE:
			delere();
			break;
		case EXIT:
			back();
			break;
		}
		
	}



	private void back() {
		printBar();
		System.out.println("이전으로 돌어갑니다.");
		printBar();
	}



	private void delere() {
		System.out.print("통장 이름 : ");
		String id = scan.next();
		System.out.print("비밀번호 : ");
		String pw = scan.next();
		
		BankBook bankBook = new BankBook(id, pw);
		
		if(!list.remove(bankBook)) {
			printBar();
			System.out.println("개설되지 않은 통장입니다.");
			printBar();
			return;
		}
		printBar();
		System.out.println("통장이 해지되었습니다");
		printBar();
	}



	private void insert() {
		System.out.print("통장 이름 : ");
		String id = scan.next();
		System.out.print("비밀번호 : ");
		String pw = scan.next();
		
		BankBook bankBook = new BankBook(id, pw);
		
		list.add(bankBook);
		printBar();
		System.out.println("통장이 개설되었습니다.");
		printBar();
	}



	/**중간 줄을 출력하는 메소드*/
	private void printBar() {
		System.out.println("----------------------------");
	}

}
