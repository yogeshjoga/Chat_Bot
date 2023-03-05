package com.chatbot.ai.api.chat.bot.ai.logic;

import java.util.Scanner;

public class MessageLogic {

	public void intractionWithHuman() {
		String[] words = { "pug", "hello", "hi", "how are you", "how r u",
				"my name is PUG java chatBot developed by @yogesh joga" };
		String[] questions = { "what is your name", "", "wt is ur name", "hi", "hlo", "hello", "how r you", "how r u",
				"wt is ur age", "what is your age", };
		// we can use json also
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter user Input");
		String user = scanner.nextLine();
		// System.out.println(questions[0]);
		// System.out.println(user);

		if (user.equals(questions[0])) {
			System.out.println(words[4]);

			for (String userInput : words) {

			}
			// System.out.println(userInput);
		}

	}
}
