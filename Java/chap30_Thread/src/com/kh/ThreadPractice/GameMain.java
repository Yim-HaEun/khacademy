package com.kh.ThreadPractice;

import java.io.IOException;
import java.util.Random;


public class GameMain {
	static GameLoop gl = new GameLoop();

	private static boolean isGameOver = false;
	public boolean getisGameOver() {
		return isGameOver;
	}
	public static void setGameOver(boolean isGameOver) {
		GameMain.isGameOver = isGameOver;
	}
	public static void main(String[] args) {
		// private static boolean isGameOver = false;
		
			//�ܺ� Ŭ������ �ν��Ͻ��� ����
			//GameMain s = new GameMain();
			
			//���� ���� ������ ����
			Thread gameThread = new Thread(gl);
			gameThread.start();
			
			//���� ���� ���� : �÷��̾ Enter Ű�� ������ ���� ����
			try {
				System.in.read(); //����ڰ� Ű����� �Է��� ����Ʈ�� ����, ����ڰ� EnterŰ�� ���������� ���α׷� �Ͻ� ����
				isGameOver = true;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
	}



