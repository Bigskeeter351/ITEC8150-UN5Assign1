/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoboxoffice;

/**
 *
 * @author Skeetois
 */
import java.util.Scanner;
public class Play extends BoxOffice implements TicketPrices
{
private String seating;
   public Play()
   {
      title = "Hamlet";
      producer = "Shakespeare";
      duration = "240 minutes";
      numberOfTickets = 2;
      seating = "Balcony";
      
   }
   public String toString()
   {
      return""; // Play();
   }//end toString
   // method for the play ticketCost
   public void setTicketCost()
   {
      String choice;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter age child, adult, or senior");
      choice= input.nextLine();
      if(choice.equals("orchestra"))
      {
     //    choice.getOrchestra();
         totalCost=ORCHESTRA;
      }
      else if(choice.equals("MainFloor"))
      {
    //     choice.getMainFloor();
         totalCost=MAINFLOOR;
      }
      else if(choice.equals("balcony"))
      {
  //       choice.getBalcony();
         totalCost=BALCONY;
      }
      else
      {
         System.out.println("Invalid choice");
      }
   //   return totalCost;
   }// end method
}// end of play