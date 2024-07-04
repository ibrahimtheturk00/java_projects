import java.util.Random;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to guessing game. You must guess a number between 1-10");
        Random random = new Random();
        int counter = 0;
int number =random.nextInt(10) + 1;
int guess = 0;
while (guess != number){
    guess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess"));
if (guess > number){
    counter++;
    JOptionPane.showMessageDialog(null,"You failed at your " + counter + ". attempt. You must guess a smaller number.");
}
else if(guess < number){
    counter++;
    JOptionPane.showMessageDialog(null,"You failed at your " + counter + ". attempt. You must guess a bigger number.");
}
else{
    counter++;
    JOptionPane.showMessageDialog(null, "You guessed the number at your " + counter + ". attempt. Number was "+ guess);
}
}
        }
    }