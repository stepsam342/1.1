import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter First And Last Name");
    String fullName = input.nextLine();
    System.out.println("Choose Section (A,B,C,D)");
    String seatSection = input.nextLine();
    System.out.println("Choose Seat (1-200)");
    String seatNumber = input.nextLine();; //inputs

    int nameLength = fullName.length();
    int sectionLength = seatSection.length();
    int seatLength = seatNumber.length();
    int spaces1 = (29-nameLength);
    int spaces2 = (26-sectionLength);
    int spaces3 = (29-seatLength);

    System.out.print("\n|------------------------------------|");
    System.out.print("\n|Name : " + fullName);
    while (spaces1>0){
      System.out.print(" ");
      spaces1--;
    }
    System.out.print("|");

    System.out.print("\n|Section : " + seatSection);
    while (spaces2>0){
      System.out.print(" ");
      spaces2--;
    }
    System.out.print("|");

    System.out.print("\n|Seat : " + seatNumber);
    while (spaces3>0){
      System.out.print(" ");
      spaces3--;
    }
    System.out.print("|");

    System.out.print("\n|Price : $83                         |");
    System.out.println("\n|------------------------------------|");//outputs
  }
}