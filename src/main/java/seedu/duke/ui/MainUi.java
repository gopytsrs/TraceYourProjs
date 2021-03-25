package seedu.duke.ui;

public class MainUi {
    public static final String LOGO_STRING = " _____                                 "
            + "                 ___              _\n"
            + "/__   \\ _ __  __ _   ___  ___ /\\_/\\ ___   _   _  _ __  / _ \\ _ __  ___  (_)\n"
            + "  / /\\/| '__|/ _` | / __|/ _ \\\\_ _// _ \\ | | | || '__|/ /_)/| '__|/ _ \\ | |\n"
            + " / /   | |  | (_| || (__|  __/ / \\| (_) || |_| || |  / ___/ | |  | (_) || |\n"
            + " \\/    |_|   \\__,_| \\___|\\___| \\_/ \\___/  \\__,_||_|  \\/     |_|   \\___/_/ |\n"
            + "                                                                      |__/\n";
    public static final String ALL_COMMANDS_STRING = "-----------------------------------------"
            + "-------------------------------\n"
            + "Here are the available commands:\n"
            + "add: Adds a resource to a project\n"
            + "\tFormat: add p/PROJECT_NAME url/URL_LINK [d/LINK_DESCRIPTION]\n"
            + "delete: Deletes a resource from the resource list based on the project.\n"
            + "\tFormat: delete p/PROJECT_NAME [i/INDEX]\n"
            + "list-all: Shows a list of all resources used in all projects.\n"
            + "exit: Exits the program.\n"
            + "------------------------------------------------------------------------\n";
    public static final String PROJECT_TEAM_ID = "Team Project of CS2113-W10-3.";
    public static final String APP_NAME_AND_VERSION = "TraceYourProj - v0.1";
    public static final String HOW_TO_GET_HELP = "Type 'help' for a list of command and related usage.";
    public static final String SIGNAL_FOR_USER_TO_INPUT = "Duke> ";
    public static final String EXIT_MESSAGE = "Thank you for using TraceYourProj!\n"
            + "Hope you have a wonderful day.\n";

    public static void printWelcomeText() {
        System.out.print(LOGO_STRING + "\n");
        System.out.print(PROJECT_TEAM_ID + "\n");
        System.out.print(APP_NAME_AND_VERSION + "\n");
        System.out.print(HOW_TO_GET_HELP + "\n");
    }

    public static void printSignalForUserToEnterInput() {
        System.out.print(SIGNAL_FOR_USER_TO_INPUT);
    }

    public static void showExitMessage() {
        System.out.print(EXIT_MESSAGE + "\n");
    }

    public static void listAllCommands() {
        System.out.print(ALL_COMMANDS_STRING + "\n");
    }
}