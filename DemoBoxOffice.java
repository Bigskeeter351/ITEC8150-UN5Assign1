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

public class DemoBoxOffice //extends BoxOffice
{
   public static void main(String[] args) throws Exception
   {
      double grandTotal = 0.0;
      BoxOffice[] box = new BoxOffice[6];
      char showing;
      Scanner input = new Scanner(System.in);
      System.out.println ("Will you be see a Movie or a Play? ");
      // showing=input=nextChar();

        // Character input 
        showing = input.next().charAt(0); 
        
      // display();
      System.out.println("The grand total for your showings is:$ "+grandTotal);
      
      try{
         int x;
         switch(showing) 
         {
            case 'm':
               System.out.println("Movie");
               //if(showing.equalsTo('m'))
               //{
                  for( x=0; x< box; ++ x)
                  {
                     setTicketCost();
                     grandTotal=totalCost+totalCost;
                  }
                  return grandTotal;
               //}
               break;
            case 'p':
               System.out.println("Play");
               if(showing.equalsTo('p'))
               {
                  for(x=0; x<box; ++x)
                  {
                     setTicketCost();
                     grandTotal=totalCost+totalCost;
                  }
                  return grandTotal;
               }
            
               break;
            default:
               System.out.println("Invaild choice");
         }// end switch statement
      } catch (SeatingException e)
      {
         System.out.println(e.getMessage());
      }
      catch(AgeException e)
      {
         System.out.println(e.getMessage());
      }
      
   }//end main
//   public void display()
//   {
//      System.out.println("The grand total for your showings is:$ "+grandTotal);
//   }
}//end class