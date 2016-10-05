/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gift.advisor;
import java.util.Scanner;
/**
 *
 * @author Aleaya
 */
public class GiftAdvisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert the number in parenthesis to make a selection");
        System.out.println("Is the person female(1) or male(2)?");
        int gen = keyboard.nextInt();
        String gift = "";
        int pr;
        switch (gen) {
            case 1: System.out.println("Is your price range high(1), medium(2), or low(3)?");
                    pr = keyboard.nextInt();
                    switch(pr)
                    {
                        case 1: gift = "Get her jewelry or a weekend getaway";
                                break;
                        case 2: gift = "Get her perfume or a sweater";
                                break;
                        case 3: gift = "Get her wine or a selfie stick";
                                break;
                    }
                    break;
            case 2: System.out.println("Is your price range high(1), medium(2), or low(3)?");
                    pr = keyboard.nextInt();
                    switch(pr)
                    {
                        case 1: gift = "Get him a smart tv or apple watch";
                                break;
                        case 2: gift = "Get him a guitar or playstation";
                                break;
                        case 3: gift = "Get him books or shoes";
                                break;
                    }
                    break;
            default: gift = "Get a them a gift card";
                     break;
        }
        System.out.println(gift);
        keyboard.close();
    }
    
}
