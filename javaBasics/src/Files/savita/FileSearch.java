package Files.savita;

import java.io.File;

import java.util.Arrays;

import java.util.Scanner;

public class FileSearch {

	public static void main(String[] argv) throws Exception {

		System.out.println("Enter the directory path: ");

// C:\\selenium

		Scanner sc = new Scanner(System.in);

		String pathStr = sc.next();

		System.out.println("Enter the desired file name: ");

//Demo1.txt

		String file = sc.next();

		System.out.println(file);

		File dir = new File(pathStr);

		String[] list = dir.list();

		System.out.println(Arrays.toString(list));

		boolean flag = false;

		for (int i = 0; i < list.length; i++) {

			if (file.equals(list[i])) {

				flag = true;

			}

		}

		if (flag) {

			System.out.println("File Found");

		} else {

			System.out.println("File Not Found");

		}

	}

}
