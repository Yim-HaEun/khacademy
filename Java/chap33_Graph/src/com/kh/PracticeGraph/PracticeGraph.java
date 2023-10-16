package com.kh.PracticeGraph;

import com.kh.GraphMain.Graph;

public class PracticeGraph {

	public static void main(String[] args) {
		//int ver = 8; //�׷��� ����� ���� 5�� ����
		//Graph graph = new Graph(ver);
		
		Graph ph = new Graph(7);
		ph.DFSPracticeMain();
		}
		
		public void BFSPracticeMain() {
			int ph = 9;
			BFSGraph graph = new BFSGraph(ph);
			
			graph.addEdge(0,1);
			graph.addEdge(0,2);
			graph.addEdge(1,3);
			graph.addEdge(1,4);
			graph.addEdge(2,5);
			graph.addEdge(2,6);
	
			
			System.out.println("BFS Ž�� ��� : ");
			graph.BFS(0);
			
		}
		
		public void DFSPracticeMain(){
			int ver = 7; //�׷��� ���� ���� 5�� ����
			DFSGraph graph = new DFSGraph(ver);
			
			graph.addEdge(0, 1);
			graph.addEdge(0, 2);
			graph.addEdge(1, 3);
			graph.addEdge(1, 4);
			graph.addEdge(2, 5);
			graph.addEdge(2, 6);
			graph.addEdge(3, 7);

			System.out.println("DFS Ž�� ��� : ");
			graph.DFS(0);
		}

	}


