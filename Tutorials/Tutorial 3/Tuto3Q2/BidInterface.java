/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Tuto3Q2;

/**
 *
 * @author szeyu
 */
public interface BidInterface {
    	/**
     * Returns the name of the company making this bid.
     * @return the name of the company
     */
	String getCompanyName();
	
	/**
     * Returns the description of the air conditioner that this bid is for.
     * @return the description of the air conditioner
     */
	String getACDescrption();
	
	/**
     * Returns the capacity of this bid's AC in tons (1 ton = 12,000 BTU).
     * @return the capacity of the AC
     */
	double getACCapacity();
	
	 /**
     * Returns the seasonal efficiency of this bid's AC (SEER).
     * @return the seasonal efficiency of the AC
     */
	double getACSeasonalEfficiency();
	
	/**
     * Returns the cost of this bid's AC.
     * @return the cost of the AC
     */
	double getACCost();
	
	/**
     * Returns the cost of installing this bid's AC.
     * @return the cost of installing the AC
     */
	double getACInstallingCost();
	
	/**
     * Returns the yearly cost of operating this bid's AC.
     * @return the yearly cost of operating the AC
     */
	double getACYearlyOperatingCost(double averageHours, double energyCost);
}
