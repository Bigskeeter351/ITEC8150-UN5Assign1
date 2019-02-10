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

public class Movie extends BoxOffice implements TicketPrices
{
// declare values
   final double SURCHARGE = 1.00;
   String choice;
   // constructor 
   public Movie()
   {
 //      title=setTitle();
//       producer=setProducer();
//       duration=setDuration();
//       numberOfTickets=setNumberOfTickets();
      
     
   }
   // method for the ticket price
   public void setTicketCost()
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter age child, adult, or senior");
      choice= input.nextLine();
      if(choice.equals("child"))
      {
 //        choice.getChild();
         totalCost=CHILD + 1.00;
      }
      else if(choice.equals("adult"))
      {
 //        choice.getAdult();
         totalCost=ADULT + 1.00;
      }
      else if(choice.equals("senior"))
      {
 //        choice.getSenior();
         totalCost=SENIOR;
      }
      else
      {
         System.out.println("Invalid choice");
      }
   //   return totalCost;
   }// end method
}// end of movie