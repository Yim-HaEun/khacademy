package com.kh.goodExam.game;

import java.util.Scanner;

public class GameController {
	//		String 
	private GameModel model;
	private GameView view;
	
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}
	public void runGame() {
		//���� �޼��� �����ִ� �� ����ϰ� 
		view.displayMessage();
		//��ĳ�� �Է��ؼ� �Է°� ȣ��
		Scanner sc = new Scanner(System.in);
		
		//���� �����ϴ� ���� �Է�����
		
		boolean isTrue = true;
		//��ǻ�Ͱ� ������ ���ڸ� ������ �� �ҷ��� view
		while(isTrue) { //false�� �ɶ����� �ݺ�
			view.displayGuessPrompt();
			int guess = sc.nextInt();
			
			if( model.inCorrectGuess(guess)) {
				view.displayCorrectGuess();
				view.displayAttempts(model.getAttempts());
				isTrue = false; //break;
			}else {
			//��ǻ�Ͱ� ������ ���ڰ� ���� �Է��� ���ڰ� Ʋ���� ��
				view.displayIncorrectGuess();
				view.displayAttempts(model.getAttempts());
			}
		}
	}
	public static void main(String[] args) {
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m,v);
		
		c.runGame();
		
	}
}
