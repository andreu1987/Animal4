package check;

import data.AnimalTypeData;
import data.CommandsData;

import java.util.Locale;
import java.util.Scanner;

public class CheckTeam {
    public static String checkStrTeam(Scanner scanner, String message) {
        while (true) {
            System.out.println(message);
            String commandStr = scanner.next().trim().toUpperCase(Locale.ROOT);
            boolean isExist = false;
            for (CommandsData commandsData : CommandsData.values()) {
                if (commandsData.name().equals(commandStr)) {
                    return commandStr;
                }
            }
               System.out.println(String.format("Введенная команда %s не поддерживается", commandStr));
                continue;
        }
    }

}

