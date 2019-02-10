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
public abstract class BoxOffice
{
   //declare values
   protected String title;
   protected String producer;
   protected String duration;
   protected int numberOfTickets;
   protected double totalCost;
   
   // Gets and Sets
   public String getTitle()
   {
      return title;
   }
   public String getProducer()
   {
      return producer;
   }
   public String getDuration()
   {
      return duration;
   }
   public int getNumberOfTickets()
   {
      return numberOfTickets;
   }
   public void setTitle(String t)
   {
      t=title;     
   }
   public void setProducer(String p)
   {
      p=producer;
   }
   public void setDuration(String d)
   {
      d=duration;
   }
   public void setNumberOfTickets(int n)
   {
      n=numberOfTickets;
   }
  
   public BoxOffice()
   {
      title="Star Wars";
      producer="George Lucus";
      duration="120 minutes";
      numberOfTickets=2;
   }
   //abstract method
   public abstract void setTicketCost();
   
}//end of class