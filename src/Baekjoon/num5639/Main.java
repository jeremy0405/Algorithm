package Baekjoon.num5639;

/*
	문제    : BOJ 이진 검색 트리
    유형    : 재귀, 그래프 탐색
	난이도   : MEDIUM (G5)
	시간    : 30m
	uri    : https://www.acmicpc.net/problem/5639
    날짜    : 22.06.06(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static class Node {

		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}

		public void insertNode(int node) {
			if (this.data > node) {
				if (this.left == null) {
					this.left = new Node(node);
				} else {
					this.left.insertNode(node);
				}
			} else {
				if (this.right == null) {
					this.right = new Node(node);
				} else {
					this.right.insertNode(node);
				}
			}
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Node rootNode = new Node(Integer.parseInt(br.readLine()));
		String line;

		while ((line = br.readLine()) != null) {
			int node = Integer.parseInt(line);
			rootNode.insertNode(node);
		}

		postOrder(rootNode);

	}

	private static void postOrder(Node node) {
		if (node == null) {
			return;
		}

		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.data);
	}

}
