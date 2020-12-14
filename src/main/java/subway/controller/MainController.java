package subway.controller;

import subway.view.MainMessages;
import subway.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
	private static final List<String> options = new ArrayList<>();

	static {
		options.add(Options.OPTION_1.getOption());
		options.add(Options.OPTION_2.getOption());
		options.add(Options.OPTION_3.getOption());
		options.add(Options.OPTION_4.getOption());
		options.add(Options.QUIT.getOption());
	}

	private static void controlByOption(String option, Scanner scanner) {
		if (option.equals(Options.OPTION_1.getOption())) {
			StationController.run(scanner);
			View.printMainScreen();
			run(scanner);
		} else if (option.equals(Options.OPTION_2.getOption())) {
			LineController.run(scanner);
			View.printMainScreen();
			run(scanner);
		} else if (option.equals(Options.OPTION_3.getOption())) {
			SectionController.run(scanner);
			View.printMainScreen();
			run(scanner);
		} else if (option.equals(Options.OPTION_4.getOption())) {
			View.showWholeMap();
			View.printMainScreen();
			run(scanner);
		} else if (option.equalsIgnoreCase(Options.QUIT.getOption())) {
			System.out.println(MainMessages.QUIT.getMessage());
		}
	}

	public static void run(Scanner scanner) {
		String option = View.getScreenOption(scanner);
		try {
			Options.validateOption(options, option);
			controlByOption(option, scanner);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println();
			run(scanner);
		}
	}
}
