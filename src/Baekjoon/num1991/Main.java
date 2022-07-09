package Baekjoon.num1991;

/*
	문제    : BOJ 트리 순회
    유형    : 재귀
	난이도   : MEDIUM(S1)
	시간    : 30m
	uri    : https://www.acmicpc.net/problem/1991
    날짜    : 22.07.09(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static class Node {
		String data;
		Node left;
		Node right;

		public Node(String data) {
			this.data = data;
		}
	}

	static class Tree {
		Node root;

		void createNode(String data, String left, String right) {
			if (root == null) {
				root = new Node(data);

				if (!left.equals(".")) {
					root.left = new Node(left);
				}
				if (!right.equals(".")) {
					root.right = new Node(right);
				}
			} else {
				searchNode(root, data, left, right);
			}
		}

		void searchNode(Node node, String data, String left, String right) {
			if (node == null) {
				return;
			}
			if (node.data.equals(data)) {
				if (!left.equals(".")) {
					node.left = new Node(left);
				}
				if (!right.equals(".")) {
					node.right = new Node(right);
				}
			} else {
				searchNode(node.left, data, left, right);
				searchNode(node.right, data, left, right);
			}
		}

		void preorder(Node root) {
			System.out.print(root.data);
			if (root.left != null) {
				preorder(root.left);
			}
			if (root.right != null) {
				preorder(root.right);
			}
		}

		void inorder(Node root) {
			if (root.left != null) {
				inorder(root.left);
			}
			System.out.print(root.data);
			if (root.right != null) {
				inorder(root.right);
			}
		}

		void postorder(Node root) {
			if (root.left != null) {
				postorder(root.left);
			}
			if (root.right != null) {
				postorder(root.right);
			}
			System.out.print(root.data);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		Tree tree = new Tree();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			tree.createNode(st.nextToken(), st.nextToken(), st.nextToken());
		}

		tree.preorder(tree.root);
		System.out.println();
		tree.inorder(tree.root);
		System.out.println();
		tree.postorder(tree.root);

	}

}
