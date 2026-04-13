import java.util.Scanner;

public class NokiaPhoneMenu {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        mainMenu:
        while (true) {
            System.out.println("List of menu functions");
            System.out.println("1. Phone book\n2. Messages\n3. Chat\n4. Call register\n5. Tones\n6. Settings\n7. Call divert\n8. Games\n9. Calculator\n10. Reminders\n11. Clock\n12. Profiles\n13. SIM services\n0. Exit");
            System.out.print("Select (1-13): ");
            
            int userChoice = inputCollector.nextInt();
            
            switch (userChoice) {
                case 1: 
                    System.out.println("\n1. Phone book");
                    System.out.println("\n1. Search\n2. Service Nos.\n3. Add name\n4. Erase\n5. Edit\n6. assign tone\n7. Send b'card\n8. Options\n9. Speed dials\n10. Voice tags \n0. Back");
                    System.out.print("Select (1-10): ");
                    
                    int userChoice2 = inputCollector.nextInt();
                    
                    if (userChoice2 == 8) {
                        System.out.println("\n8. Options");
                        System.out.println("\n1. Type of view\n2. Memory status\n0. Back");
                    } else if (userChoice >= 0) 
                    break;
                case 2: 
                    System.out.println("\n2. Messages");
                    System.out.println("\n1. Write messages\n2. Inbox\n3. Outbox\n4. Picture messages\n5. Templates\n6. Smileys\n7. Message settings\n8. Info service\n9. Voice mailbox number\n10. Service command editor\n0. Back");
                    if (userChoice >= 0) 
                    break;
                case 3: 
                    System.out.println("\n3. Chat");
                    System.out.println("\n0. Back");
                    if (userChoice >= 0) 
                    break;
                case 4: 
                    System.out.println("\n4. Call register");
                    System.out.println("\n1. Missed calls\n2. Received calls\n3. Dialled numbers\n4. Erase recent call lists\n5. Show call duration\n6. Show call costs\n7. Call cost settings\n8. Prepaid credit\n0. Back");
                    if (userChoice >= 0) 
                    break;
                case 5: 
                    System.out.println("\n5. Tones");
                    System.out.println("\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and games tones\n8. Vibrating alert\n9. Screen saver\n0. Back");
                    if (userChoice >= 0)
                    break;
                case 6: 
                    System.out.println("\n6. Settings");
                    System.out.println("\n1. Call settings\n2. Phone settings\n3. Security settings\n4. Restore factory settings\n0. Back");
                    if (userChoice >= 0) 
                    break;
                case 7: 
                    System.out.println("\n7. Call divert");
                    System.out.println("\n0. Back");
                    if (userChoice >= 0) 
                    break;
                case 8: 
                    System.out.println("\n8. Games");
                    System.out.println("\n0. Back");
                    if (userChoice >= 0) 
                    break;
                case 9: 
                    System.out.println("\n9. Calculator");
                    System.out.println("\n0. Back");
                    if (userChoice >= 0) 
                    break;
                case 10: 
                    System.out.println("\n10. Reminders");
                    System.out.println("\n0. Back");
                    if (userChoice >= 0)
                    break;
                case 11: 
                    System.out.println("\n11. Clock");
                    System.out.println("\n1. Alarm clock\n2. Clock settings\n3. Date settings\n4. Stopwatch\n5. Countdown timer\n6. Auto update of date and time\n0. Back");
                    if (userChoice >= 0) 
                    break;
                case 12: 
                    System.out.println("\n12. Profiles");
                    System.out.println("\n0. Back");
                    if (userChoice >= 0) 
                    break;
                case 13: 
                    System.out.println("\n13. SIM services");
                    System.out.println("\n0. Back");
                    if (userChoice >= 0) 
                    break;
                case 0: 
                    System.out.println("\n0. Exit!");
                    return;
                default:
                    System.out.println("Invalid Menu Option.");
                    continue mainMenu;
            } 
      
        }
    
    }
}
