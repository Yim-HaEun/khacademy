package com.kh.goodExam.game;

public class GameView {
	private String startMsg = "���� ���߱� ���� �����մϴ�.";
	private String StartGss = "1���� 100 ������ ���ڸ� ���纸����!";
	private String InputGss = "������ ���ڸ� �Է��ϼ���.";
	private String CorrectGss = "���ڸ� ������ϴ�.";
	private String IncorrectGss = "Ʋ�Ƚ��ϴ�. �ٽ� �õ��ϼ���.";
	private String gmovr = "���� ���� !";

	public void displayMessage() {
		System.out.println(startMsg);
		System.out.println(StartGss);
	}
	//���ڸ�  �����ϴ� �� �Է��ϰ� ������� Ʋ�ȴ��� ���°Ŷ�  �õ�Ƚ�� ���� ����
	//1.���� �����ϴ� �� �Է��ϱ�
	public void displayGuessPrompt() {
		System.out.println(InputGss);
	}
	public void displayCorrectGuess() {
		System.out.println(CorrectGss);
	}
	public void displayIncorrectGuess() {
		System.out.println(IncorrectGss);
	}
	public void displayAttempts(int attempts) {
		System.out.println("�õ�Ƚ��: " + attempts);
	}
	public void displayGameOver() {
		System.out.println(gmovr);
	}
}
