package acmicpc.backjoon.problem;

import java.util.Scanner;

/*
����
�Է� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
�Է��� �־�����. �Է��� �ִ� 100�ٷ� �̷���� �ְ�, ���ĺ� �ҹ���, �빮��, ����, ���ڷθ� �̷���� �ִ�. �� ���� 100���ڸ� ���� ������, �� ���� �־����� �ʴ´�. ��, �� ���� �������� �������� �ʰ�, �������� ������ �ʴ´�.

���
�Է¹��� �״�� ����Ѵ�.

���� �Է� 1 
Hello
Baekjoon
Online Judge

���� ��� 1 
Hello
Baekjoon
Online Judge
*/
public class _11718_printing_input_data {
	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			Scanner sc = new Scanner(System.in);
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		}
	}
}
