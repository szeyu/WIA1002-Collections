/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Tuto3Q2;

/**
 *
 * @author szeyu
 */
public interface BidCollectionInterface <E extends BidInterface>{
    /**
    * Add an bid to this collection
    * @param bid bid to be added
    */
   void addBid(E bid);

   /**
    * Return the bid in this collection with the best yearly cost
    * @return the bid in this collection with the best yearly cost
    */
   double getBestYearlyCost(double averageHours, double energyCost);

   /**
    * Return the bid in this collection with the best initial cost.
    * The initial cost will be defined as the {@code unit cost} + {@code installation cost}
    * @return bid the bid in this collection with the best initial cost
    */
   double getBestInitialCost();

   /**
    * Clear all the items from the collection
    */
   void clear();

   /**
    * Get the number of items in this collection
    * @return the number of items in this collection
    */
   int getSize();

   /**
    * See whether this collection is empty
    * @return {@code true} if the collection is empty, false otherwise
    */
   boolean isEmpty();	
}
